
/* If there is a constructor in parent class, then 
    it is necessary for inherited child class,
        to also have a constructor.
 */
import java.util.Scanner;

class Vehicle { // parent class
    int cost = 0;
    int mileage = 0;

    public Vehicle(int c, int m) { // constructor
        cost = c;
        mileage = m;
    }

    public void show_vehicle_details() {
        System.out.println("I am a vehicle");
        System.out.println("Cost of vehicle: " + cost);
        System.out.println("Mileage of vehicle: " + mileage);
    }
}

class Car extends Vehicle {
    String color = "";
    int tyres = 0;

    public Car(int c, int m, String col, int ty) { // constructor with Vehicle class properties
        super(c, m); // super method is used to send properties from child class to parent class
        color = col;
        tyres = ty;
    }

    public void show_car_details() {
        System.out.println("I am a Car");
        System.out.println("Color of car: " + color);
        System.out.println("Number of tyres in car: " + tyres);
    }
}

public class InheritConstructor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter cost of vehicle: ");
        int cost = scan.nextInt();
        System.out.print("Enter mileage of vehicle: ");
        int mileage = scan.nextInt();

        /* Note: nextInt() method only consumes the integers part 
            and leave the enter or newline character in the input buffer.
                nextLine() also consume enter and newline character that
                    still exist in input buffer, and take them as the input from the user.
            So, to avoid skipping put an additional nextLine() call after the nextInt() call.
         */

/* Note: nextLine() returns every character in a line until Carriage Return("\r\n") or end of line.
            next() split the line into individual words, and return one word at a time.
        next() does not consumes newline character("\n").
*/

        System.out.print("Enter color of car: ");
        String color = scan.next();
        System.out.print("Enter number of tyres in car: ");
        int tyres = scan.nextInt();

        scan.close();

        System.out.println();
        Car c = new Car(cost, mileage, color, tyres);
        c.show_vehicle_details();
        System.out.println();
        c.show_car_details();
    }
}
