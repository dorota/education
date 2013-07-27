package dorota.education;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.List;

public interface IAccountDao {
    public List<Account> getAllAccounts() throws FileNotFoundException, ParseException;
}
