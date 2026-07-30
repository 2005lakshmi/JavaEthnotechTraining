import java.util.ArrayList;
import java.util.HashMap;

class User {

    String name;

    User(String name) {
        this.name = name;
    }
}

class Booking {

    ArrayList<User> users = new ArrayList<>();
    HashMap<Integer, Boolean> seats = new HashMap<>();

    Booking() {
        for (int i = 1; i <= 5; i++) {
            seats.put(i, true);
        }
    }

    synchronized void bookSeat(User user, int seat) {

        if (seats.get(seat)) {

            seats.put(seat, false);

            users.add(user);

            StringBuilder sb = new StringBuilder();

            sb.append("Booking Successful\n");
            sb.append("Name: ").append(user.name);
            sb.append("\nSeat Number: ").append(seat);

            System.out.println(sb);

        } else {
            System.out.println("Seat " + seat + " Already Booked");
        }
    }

    void displaySeats() {
        System.out.println(seats);
    }
}

class Customer extends Thread {

    Booking booking;
    User user;
    int seat;

    Customer(Booking booking, User user, int seat) {
        this.booking = booking;
        this.user = user;
        this.seat = seat;
    }

    public void run() {
        booking.bookSeat(user, seat);
    }
}

public class TicketBooking {
    public static void main(String[] args) {

        Booking booking = new Booking();

        Customer c1 = new Customer(booking, new User("Rahul"), 1);
        Customer c2 = new Customer(booking, new User("Anu"), 1);

        c1.start();
        c2.start();

        try {
            c1.join();
            c2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        booking.displaySeats();
    }
}