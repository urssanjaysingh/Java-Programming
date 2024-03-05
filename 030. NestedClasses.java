/* In Java, you can define a class within another class. Such class is known as nested class.
 * There are two types of nested classes you can create in Java.
 *  1. Non-static nested class (inner class):
        A non-static nested class is a class within another class. 
        It has access to members of the enclosing class (outer class). 
        It is commonly known as inner class.
        Since the inner class exists within the outer class, 
            you must instantiate the outer class first, in order to instantiate the inner class.
 *  2. Static nested class:
        Unlike inner class, a static nested class cannot access the member variables of the outer class. 
        It is because the static nested class doesn't require you to create an instance of the outer class.
        Static nested class can be directy accessed using outer class name.
 */

class CPU { // outer class
    double price;

    class Processor { // nested class(inner class)

        // members of nested class
        double cores;
        String manufacturer;

        double getCache() {
            return 4.3;
        }
    }

    protected class RAM { // nested protected class

        // members of protected nested class
        double memory;
        String manufacturer;

        double getClockSpeed() {
            return 5.5;
        }
    }
}

class MotherBord { // static nested class

    static class USB {
        int usb2 = 2;
        int usb3 = 1;
        int getTotalPorts() {
            return usb2 + usb3;
        }
    }
}

public class NestedClasses {
    public static void main(String[] args) {

        // creating object of outer class CPU
        CPU cpu = new CPU();
        // creating an object of inner class Processor using outer class.
        CPU.Processor processor = cpu.new Processor();
        // creating an object of inner class RAM using outer class.
        CPU.RAM ram = cpu.new RAM();
        System.out.println("Processor Cache = " + processor.getCache());
        System.out.println("RAM Clock Speed = " + ram.getClockSpeed());

        System.out.println();

        // creating object of the static nested class using the name of the outer class
        MotherBord.USB usb = new MotherBord.USB();
        System.out.println("Total Ports = " + usb.getTotalPorts());
    }
}