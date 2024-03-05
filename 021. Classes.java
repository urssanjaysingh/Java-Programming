
/*Class is a template/blue-print for real-world entities.
 *  Class is a user-defined data-type.
 * Objects are specific instances of a class.
 */
import java.util.Scanner; //provides Scanner class

class StudentClass1 {

    String name = "Bob";
    int marks = 65;

    public void show_details() {
        System.out.println("Student's Name: " + name);
        System.out.println("Student's Marks: " + marks);
    }
}

class StudentClass2 {

    /* Taking input from user */
    Scanner scan = new Scanner(System.in);

    String name = "";
    int marks = 0;

    public void get_details() {

        System.out.print("Enter your name: ");
        name = scan.nextLine(); // string input
        System.out.print("Enter your marks: ");
        marks = scan.nextInt(); // integer input
    }

    /*
     * Note: nextLine() returns every character in a line until Carriage
     * Return("\r\n") or end of line.
     * next() split the line into individual words, and return one word at a time.
     */

    public void show_details() {

        System.out.println("Student's Name: " + name);
        System.out.println("Student's Marks: " + marks);
    }
}

/* Note: only one class in a java file can be public */
public class Classes {
    public static void main(String[] args) {
        StudentClass1 s1 = new StudentClass1();
        s1.show_details();

        System.out.println();

        StudentClass2 s2 = new StudentClass2();
        s2.get_details();
        s2.show_details();
    }
}
