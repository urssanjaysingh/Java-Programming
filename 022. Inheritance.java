/* In Java, Classes can be derived from other classes.
 * A clas that is derived from another class is called a subclass(extended class).
 * The class from which the subclass is derived is called a superclass.
 */
class Vehicle { // parent class
    int cost = 234;
    int mileage = 35;

    public void show_vehicle_details() {
        System.out.println("I am a vehicle");
        System.out.println("Cost of vehicle: " + cost);
        System.out.println("Mileage of vehicle: " + mileage);
    }
}

class Car extends Vehicle { // inherited or derived child class
    String color = "blue";
    int tyres = 4;

    public void show_car_details() {
        System.out.println("I am a Car");
        System.out.println("Color of car: " + color);
        System.out.println("Number of tyres in car: " + tyres);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car c = new Car();
        c.show_car_details();
        System.out.println();
        c.show_vehicle_details(); // invoking method of Vehicle class by object of Car class
    }
}