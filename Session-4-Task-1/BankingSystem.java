import java.util.Scanner;

class InsufficientFundsException extends Exception {

    InsufficientFundsException(String msg) {
        super(msg);
    }
}

class Bank {

    double balance = 1000;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Balance = " + balance);
    }

    void withdraw(double amount) throws InsufficientFundsException {

        if (amount > balance)
            throw new InsufficientFundsException("Insufficient Balance");
        else {
            balance = balance - amount;
            System.out.println("Balance = " + balance);
        }
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank b = new Bank();

        System.out.print("Enter Deposit Amount: ");
        b.deposit(sc.nextDouble());

        System.out.print("Enter Withdraw Amount: ");

        try {
            b.withdraw(sc.nextDouble());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}