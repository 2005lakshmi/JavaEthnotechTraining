import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public void setDetails(int accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolder = name;
        balance = bal;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited Successfully");
    }

    public void withdraw(double amount) {
        if (amount <= 0)
            System.out.println("Invalid Amount");
        else if (amount > balance)
            System.out.println("Insufficient Balance");
        else {
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
        }
    }

    public void checkBalance() {
        System.out.println("Balance = " + balance);
    }

    public void display() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount b = new BankAccount();

        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        b.setDetails(acc, name, bal);

        System.out.print("Enter Deposit Amount: ");
        b.deposit(sc.nextDouble());

        System.out.print("Enter Withdraw Amount: ");
        b.withdraw(sc.nextDouble());

        b.checkBalance();

        System.out.println("\nAccount Details");
        b.display();
    }
}