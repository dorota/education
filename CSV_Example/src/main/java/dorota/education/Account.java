package dorota.education;

import java.math.BigDecimal;
import java.util.Date;

public class Account {
    private String accountNumber;
    private BigDecimal balance;
    private Date lastPaidOn;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Date getLastPaidOn() {
        return lastPaidOn;
    }

    public void setLastPaidOn(Date lastPaidOn) {
        this.lastPaidOn = lastPaidOn;
    }
}
