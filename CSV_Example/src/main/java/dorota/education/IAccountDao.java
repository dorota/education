package dorota.education;

import java.io.FileNotFoundException;
import java.util.List;

public interface IAccountDao {
    public List<Account> getAllAccounts() throws FileNotFoundException;
}
