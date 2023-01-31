/* Abstract class is a restricted class cannot be used to create objects 
    At time of inheritance when we change or override a method of parent class 
        in a child class, it is called Method Overriding.
* Abstract classes cannot be instantiated, but they can be subclassed.
* An abstract method is a method that is declared without an implementation(without braces).
*/

abstract class Animal {

    public abstract void animal_sound();
}

class Cat extends Animal {

    @Override // method overriding
    public void animal_sound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {

    @Override
    public void animal_sound() {
        System.out.println("Bow Bow");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        
        Cat c = new Cat();
        c.animal_sound();

        Dog d = new Dog();
        d.animal_sound();
    }
}
