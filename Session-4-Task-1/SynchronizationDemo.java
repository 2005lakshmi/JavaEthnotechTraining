class BankAccount {

    int balance = 1000;

    synchronized void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposit: " + amount);
        System.out.println("Balance: " + balance);
    }

    synchronized void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

class User1 extends Thread {

    BankAccount b;

    User1(BankAccount b) {
        this.b = b;
    }

    public void run() {
        b.deposit(500);
    }
}

class User2 extends Thread {

    BankAccount b;

    User2(BankAccount b) {
        this.b = b;
    }

    public void run() {
        b.withdraw(300);
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        User1 u1 = new User1(b);
        User2 u2 = new User2(b);

        u1.start();
        u2.start();
    }
}