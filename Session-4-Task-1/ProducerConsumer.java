class Data {

    int number;

    synchronized void produce(int n) {
        number = n;
        System.out.println("Produced: " + number);
    }

    synchronized void consume() {
        System.out.println("Consumed: " + number);
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {

        Data d = new Data();

        d.produce(100);
        d.consume();
    }
}