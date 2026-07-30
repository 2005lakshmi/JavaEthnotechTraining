class Calculator<T> {

    T data;

    Calculator(T data) {
        this.data = data;
    }

    void display() {
        System.out.println("Data: " + data);
    }
}

public class GenericCalculator {
    public static void main(String[] args) {

        Calculator<Integer> c1 = new Calculator<>(50);
        Calculator<String> c2 = new Calculator<>("Hello");
        Calculator<Double> c3 = new Calculator<>(45.75);

        c1.display();
        c2.display();
        c3.display();
    }
}