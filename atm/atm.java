public class atm {

    public int balance;

    public atm(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) {
        if ((balance - amount) < 0) {
            System.out.println("Not Sufficient Balance for Withdrawals");
        } else {
            balance = balance - amount;
            System.out.println("You have Withdrawn: " + amount);
        }
    }

    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("You have Deposited: " + amount);
    }

    public String checkBalance() {
        return "Current Balance: " + balance;
    }
}