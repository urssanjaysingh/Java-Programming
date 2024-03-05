
/* In multi-level Inheritance, we have Parent, child, grand-child relationship */
import java.util.Scanner;

class Parent { // Parent Class
    String name = "";

    public Parent(String n) {
        name = n;
    }

    public void show_name() {
        System.out.println("Name is: " + name);
    }
}

class Child extends Parent { // Child class
    int age = 0;

    public Child(String n, int a) {
        super(n);
        age = a;
    }

    public void show_age() {
        System.out.println("Age is: " + age);
    }
}

class GrandChild extends Child { // Grand-Child class
    String gender = "";

    public GrandChild(String n, int a, String g) {
        super(n, a); // n will go to, super(n) of Child class
        gender = g;
    }

    public void show_gender() {
        System.out.println("Gender is: " + gender);
    }
}

public class InheritMultiLevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String p_name = scan.next();
        System.out.print("Enter your age: ");
        int p_age = scan.nextInt();
        System.out.print("Enter your gender: ");
        String p_gender = scan.next();

        scan.close();

        System.out.println();

        GrandChild gc = new GrandChild(p_name, p_age, p_gender);
        gc.show_name();
        gc.show_age();
        gc.show_gender();
    }
}