public class bank {
    public static void main(String[] args) {

        int account = 0;

        atm atm1 = new atm(account);

        atm1.deposit(200);

        atm1.withdraw(100);

        System.out.println(atm1.checkBalance());

        atm1.withdraw(200);

        System.out.println(atm1.checkBalance());

        atm1.withdraw(50);

        System.out.println(atm1.checkBalance());

        atm1.deposit(100);

        System.out.println(atm1.checkBalance());

    }
}
