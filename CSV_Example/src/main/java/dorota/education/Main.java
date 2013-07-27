package dorota.education;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String []args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        IDelinquentAccountService service = ctx.getBean("DelinquentAccountService", IDelinquentAccountService.class);
        try {
            for(Account account: service.findDelinquent()) {
                System.out.println(account.getAccountNumber());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Accounts not reachable");
        }
    }
}
