
public class BankAccount implements Measurable{
    public  double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getMeasure()
    {
        return balance;
    }

}

