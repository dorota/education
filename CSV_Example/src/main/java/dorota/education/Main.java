package dorota.education;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;
import java.text.ParseException;

public class Main {
    public static void main(String []args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        IDelinquentAccountService service = ctx.getBean("DelinquentAccountService", IDelinquentAccountService.class);
        try {
            for(Account account: service.findDelinquent()) {
                System.out.println(account.getAccountNumber() + " " + account.getBalance());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Accounts not reachable");
        } catch (ParseException e) {
            System.out.println("Improper account data format");
        }
    }
}
