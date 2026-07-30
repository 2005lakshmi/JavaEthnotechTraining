import java.util.Scanner;

class Vehicle {
    String brand;
    int speed;

    void getVehicleDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Brand: ");
        brand = sc.nextLine();

        System.out.print("Enter Speed: ");
        speed = sc.nextInt();
        sc.nextLine();
    }
}

class Car extends Vehicle {
    String model;

    void getCarDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Model: ");
        model = sc.nextLine();
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    void getElectricCarDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Battery Capacity: ");
        batteryCapacity = sc.nextInt();
    }

    void display() {
        System.out.println("\nVehicle Details");
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Model: " + model);
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {

        ElectricCar e = new ElectricCar();

        e.getVehicleDetails();
        e.getCarDetails();
        e.getElectricCarDetails();

        e.display();
    }
}