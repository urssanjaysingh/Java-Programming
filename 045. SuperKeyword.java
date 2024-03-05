/* The super keyword in Java is used in subclasses, 
    to access superclass members (attributes, constructors and methods). */

class Animal {
    protected String type = "animal";
}

class Dog extends Animal {
    public String type = "mammal";

    public void printType() {
        System.out.println("I am a " + type);
        System.out.println("I am an " + super.type); // Access superclass attribute
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.printType();
    }
}
