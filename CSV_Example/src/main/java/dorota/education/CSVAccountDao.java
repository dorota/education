package dorota.education;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVAccountDao implements IAccountDao {
    String accountsSource;

    public String getAccountsSource() {
        return accountsSource;
    }

    public void setAccountsSource(String accountsSource) {
        this.accountsSource = accountsSource;
    }

    @Override
    public List<Account> getAllAccounts() throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new FileInputStream(accountsSource));
        List<Account> allAccounts = new ArrayList<Account>();
        while (fileScanner.hasNext()) {
            String accountDesc = fileScanner.nextLine();
            String[] accountDescParts = accountDesc.split(" ");
            String accountName = accountDescParts[0];
            int balance = Integer.valueOf(accountDescParts[1]);
            Date paidDate = Date.valueOf(accountDescParts[2]);
            allAccounts.add(new Account(accountName, BigDecimal.valueOf(balance), paidDate));
        }
        return allAccounts;
    }
}
