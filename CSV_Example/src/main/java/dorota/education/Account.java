package dorota.education;

import java.math.BigDecimal;
import java.util.Date;

public class Account {
    private String accountNumber;
    private BigDecimal balance;
    private Date dueDate;

    public Account(String accountNumber, BigDecimal balance, Date dueDate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.dueDate = dueDate;
    }

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

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
