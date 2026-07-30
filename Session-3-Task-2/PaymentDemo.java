abstract class Payment {

    abstract void pay(double amount);
}

class CreditCardPayment extends Payment {

    void pay(double amount) {
        System.out.println("Credit Card Payment Successful: " + amount);
    }
}

class DebitCardPayment extends Payment {

    void pay(double amount) {
        System.out.println("Debit Card Payment Successful: " + amount);
    }
}

class UPIPayment extends Payment {

    void pay(double amount) {
        System.out.println("UPI Payment Successful: " + amount);
    }
}

class NetBankingPayment extends Payment {

    void pay(double amount) {
        System.out.println("Net Banking Payment Successful: " + amount);
    }
}

public class PaymentDemo {

    public static void main(String[] args) {

        Payment p;

        p = new CreditCardPayment();
        p.pay(1000);

        p = new DebitCardPayment();
        p.pay(2000);

        p = new UPIPayment();
        p.pay(500);

        p = new NetBankingPayment();
        p.pay(3000);
    }
}