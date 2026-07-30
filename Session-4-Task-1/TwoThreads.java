class EvenThread extends Thread {

    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddThread extends Thread {

    public void run() {
        for (int i = 1; i <= 9; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class TwoThreads {
    public static void main(String[] args) {

        EvenThread e = new EvenThread();
        OddThread o = new OddThread();

        e.start();
        o.start();
    }
}