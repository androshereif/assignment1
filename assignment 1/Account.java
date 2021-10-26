
package assign2;
import java.util.Date;
/**
 *
 * @author andro
 */
public class Account {
    private int id;
private double balance; 
private double annualInterestRate; 
private Date dateCreated;


Account () {
    id = 0;
    balance = 0.0;
    annualInterestRate = 0.0;
}
Account(int newId, double newBalance) {
    id = newId;
    balance = newBalance;
}
Account(int newId, double newBalance, double newAnnualInterestRate) {
    id = newId;
    balance = newBalance;
    annualInterestRate = newAnnualInterestRate;
}

public int getId() {
    return id;
}
public double getBalance() {
    return balance;
}
public double getAnnualInterestRate() {
    return annualInterestRate;
}
public void setId(int newId) {
    id = newId;
}
public void setBalance(double newBalance) {
    balance = newBalance;
}
public void setAnnualInterestRate(double newAnnualInterestRate) {
    annualInterestRate = newAnnualInterestRate;
}

public void setDateCreated(Date newDateCreated) {
    dateCreated = newDateCreated;
}

double getMonthlyInterestRate() {
    return annualInterestRate/12;
}

double withdraw(double amount) {
    return balance -= amount;
}   

double deposit(double amount) {
    return balance += amount;   
}
}


