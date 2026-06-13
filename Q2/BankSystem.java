/* Create a class BankAccount with:
Fields: accountNumber, balance
Methods: deposit(double amount), withdraw(double amount), and getBalance()
Create a subclass SavingsAccount with:
Field: interestRate
Override withdraw() to prevent withdrawal if it causes the balance to fall below a threshold (e.g., 1000).
Add a method addInterest() to update balance based on the interest rate.
Make all fields private and use getters/setters.
Demonstrate account creation, deposit, interest addition, and controlled withdrawal.
File: BankSystem.java. */

class BankAccount{
    private int accountNumber;
    private double balance;

    public void setAccountNumber(int AN){
        this.accountNumber = AN;
    }

    public int getAcountNumber(){
        return accountNumber;
    }

    public void setBalance(double b){
        this.balance = b;
    }

    public double getBalance(){
        return balance;
    }

    void deposit(double amount){
        this.balance += amount;
    }

    void withdraw(double amount){
        this.balance -= amount;
    }
}

class SavingsAccount extends BankAccount{
    private double interestRate;

    public void setInterestRate(double IR){
        this.interestRate = IR;
    }

    public double getInterestRate(){
        return interestRate;
    }

    @Override
    public void withdraw(double amount){
        if ( (getBalance() - amount) <= 500){
            System.out.println("Unable to withdraw due to threshold");
        } else {
            setBalance(getBalance() - amount);
        }
    }

    public void addInterest(){
        setBalance( getBalance() + (getBalance() *interestRate) );
    }
}

public class BankSystem {
    public static void main(String[] args){
        SavingsAccount account = new SavingsAccount();
    
        account.deposit(7500);

        account.setInterestRate(5);
        account.addInterest();
        double balance = account.getBalance();

        System.out.println(balance);

        account.withdraw(50000);

        account.withdraw(5000);
        
        System.out.println(account.getBalance());
    }
}
