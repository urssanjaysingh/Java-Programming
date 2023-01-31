/* An interface is a completely "abstract class" 
        that is used to group related methods with empty bodies. 
 *   Completely abstract means all the methods in class are abstract.
 *       We use 'implements' keyword instead of 'extends' 
 * We can implements from multiple interfaces.   
We can't instantiate an interface i.e. can't create an object of interface.
*/

interface Phone {

    public void cost();
    public void color();
    public void batteryLife();
}

class Iphone implements Phone {

    public void cost() {

        System.out.println("Cost of Iphone is 30$");
    }

    public void color() {

        System.out.println("Color of Iphone is Gold");
    }

    public void batteryLife() {

        System.out.println("Battery Life of Iphone is 22-hours");
    }
}

interface AnimalEat {
    void eat();
}

interface AnimalTravel {
    void travel();
}

/* implementation of multiple-inheritance by interface */
class Animal implements AnimalEat, AnimalTravel {   

    public void eat() {
        System.out.println("Animal is eating.");
    }

    public void travel() {
        System.out.println("Animal is travelling");
    }
}

public class Interface {
    public static void main(String[] args) {
        
        Iphone ip = new Iphone();
        ip.cost();
        ip.color();
        ip.batteryLife();

        System.out.println();

        Animal a = new Animal();
        a.eat();
        a.travel();
    }
}
