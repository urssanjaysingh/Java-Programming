/* Encapsulation in Java is a process of wrapping,
    code and data together into a single unit.
 * We can create a fully encapsulated class in Java by making,
 *  all the data members of the class private. 
 * Now we can use conventional setter and getter methods to set and get data in it.
 */

class Person {

    private int age; // private field

    public int getAge() { // getter method
        return age;
    }

    public void setAge(int age) { // setter method
        this.age = age; // 'this' keyword is a reference variable that refers to the current object.
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Person p1 = new Person();

        p1.setAge(22); // change age using setter

        System.out.println("My age is " + p1.getAge()); // access age using getter
    }
}
