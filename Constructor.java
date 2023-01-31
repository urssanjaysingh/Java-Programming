
/* Constructor is a special method, whose name is dependent on class name.
        A constructor method name remain same as class name.
    It is used to initialize all instanses at the time of object creation.
 */
import java.util.Scanner;

class ClassStudent3 {
    String s_name = "";
    int s_marks = 0;

    public ClassStudent3(String name, int marks) {
        s_name = name;
        s_marks = marks;
    }

    public void show_details() {
        System.out.println("Student's Name: " + s_name);
        System.out.println("Student's Marks: " + s_marks);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String student_name = scan.nextLine();
        System.out.print("Enter your marks: ");
        int student_marks = scan.nextInt();

        scan.close(); // scanner object need to be closed after one done using them.

        ClassStudent3 s = new ClassStudent3(student_name, student_marks);
        s.show_details();
    }
}
