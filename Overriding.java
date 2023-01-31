/*If subclass(child class) has the same method as declared in the parent class,
 * then the method of the subclass overrides the method of the superclass.
 * It is known as Method-Overriding in Java.
 */

class Animal {
    public void displayInfo() {
        System.out.println("I am an animal.");
    }
}

class Dog extends Animal {
    @Override
    public void displayInfo() {
        System.out.println("I am a dog.");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.displayInfo();
    }
}
