class StudentThread implements Runnable {

    public void run() {
        System.out.println("Rahul");
        System.out.println("Anu");
        System.out.println("Kiran");
        System.out.println("Priya");
    }
}

public class RunnableDemo {
    public static void main(String[] args) {

        Thread t = new Thread(new StudentThread());
        t.start();
    }
}