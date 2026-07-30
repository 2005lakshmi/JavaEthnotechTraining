class Countdown extends Thread {

    public void run() {

        for (int i = 10; i >= 1; i--) {

            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Time Up!");
    }
}

public class SleepDemo {
    public static void main(String[] args) {

        Countdown c = new Countdown();
        c.start();
    }
}