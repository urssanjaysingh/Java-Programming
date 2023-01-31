import java.util.Scanner;

/* Multiple inheritance is not supported in java, so we can't extend two classes at one time.
* We can extend only one class but we can implement any number of interfaces.
*/

class Person {

    String name = "";
    int age = 0;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public void show_person_details() {
        System.out.println("The name of the person is " + name);
        System.out.println("The age of the person is " + age);
    }
}

interface Father {

    public void task();
}

class Man extends Person implements Father {

    int salary = 0;

    public Man(String n, int a, int s) {
        super(n, a);
        salary = s;
    }

    @Override
    public void task() {
        System.out.println("Earn Money");
        System.out.println("Salary of person is " + salary);
    }
}

public class ExtendImplement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter name: ");
        String p_name = scan.next();

        System.out.print("Enter age: ");
        int p_age = scan.nextInt();

        System.out.print("Enter salary: ");
        int p_salary = scan.nextInt();

        scan.close();

        Man m = new Man(p_name, p_age, p_salary);
        System.out.println();
        m.show_person_details();
        System.out.println();
        m.task();
    }
}
