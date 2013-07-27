package dorota.education;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.List;

public interface IDelinquentAccountService {
    public List<Account> findDelinquent() throws FileNotFoundException, ParseException;
}
