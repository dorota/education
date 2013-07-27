package dorota.education;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DelinquentAccountService implements IDelinquentAccountService {

    IAccountDao accountDao;
    public IAccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findDelinquent() throws FileNotFoundException, ParseException {
        List<Account> allAccounts = accountDao.getAllAccounts();
        List<Account> delinquentAccounts = new ArrayList<Account>();
        for(Account account:allAccounts) {
            if((new Date().getTime() > account.getDueDate().getTime())) {
                delinquentAccounts.add(account);
            }
        }
        return delinquentAccounts;
    }
}
