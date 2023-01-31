/* In Java, 'this' keyword is used to refer to the current object inside a method or a constructor. 
 * In Java, it is not allowed to declare two or more variables having the same name 
 *  inside a scope (class or method). However, instance variables and parameters may have the same name. 
 * In such a situation, we use this keyword for Ambiguity Variable Names.
Note: Also, if the name of the parameter and instance variable is different, 
    the compiler automatically appends this keyword.
 * Another common use of this keyword is in setters and getters methods of a class:
 *      to assign value inside the setter method
 *      to access value inside the getter method

*/

class Main {

    int age;
    Main(int age){  // constructor
        this.age = age; // Ambiguity Variable Names
    }

    String name;

    // setter method
    void setName( String name ) {
        this.name = name;
    }

    // getter method
    String getName(){
        return this.name;
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        
        Main obj = new Main(8);
        System.out.println("obj.age = " + obj.age);

        System.out.println();

       // calling the setter and the getter method
       obj.setName("Toshiba");
       System.out.println("obj.name: "+obj.getName());

    }
}
