package dorota.education;

import java.io.FileNotFoundException;
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
    public List<Account> findDelinquent() throws FileNotFoundException {
        List<Account> allAccounts = accountDao.getAllAccounts();
        List<Account> delinquentAccounts = new ArrayList<Account>();
        for(Account account:allAccounts) {
            if(new Date().getTime() - account.getLastPaidOn().getTime() > 30 * 24 * 60 * 60 * 1000) {
                delinquentAccounts.add(account);
            }
        }
        return delinquentAccounts;
    }
}
