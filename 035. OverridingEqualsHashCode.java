import java.util.HashMap;
import java.util.Objects;

/* The equals() and hashCode() are two important methods provided by the Object class, 
for comparing objects. 
* equals():
    To compare two objects that wheter they are the same, 
        it compares the values of both the objects's attributes.
    By default, two objects will be the same only if stored in the same memory location.
* hashCode():
    A hashCode is an integer value associated with every object in Java, 
        facilitating the hashing in hash table.
    The hashCode() method returns the same hash value when called on two objects, 
        which are equal according to the equals() method. 
    And if the objects are unequal, it usually returns different hash values.
Note: Both the methods should be overridden to get the complete equality mechanism, 
using equals() alone is not sufficient. 
    It means, if we override the equals(), we must override the hashcode() method.
 */

class Student {
    public String registrationNumber;

    public Student(String registrationNumber) { // constructor
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() { // getter
        return this.registrationNumber;
    }

    // equals() 
    @Override
    public boolean equals(Object o) {
        System.out.println("In equals()");
        if (o == this)
            return true;
        if (!(o instanceof Student)) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(registrationNumber, student.registrationNumber);
    }

    // hashCode() 
    @Override
    public int hashCode() {
        System.out.println("In hashCode()");
        return Objects.hashCode(registrationNumber);
    }
}

class ReportCard {
    private int mathScore;

    public ReportCard(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getMathScore() {
        return this.mathScore;
    }
}

public class OverridingEqualsHashCode {
    public static void main(String[] args) {
        Student s1 = new Student("H234");
        Student s2 = new Student("H234");
        System.out.println(s1.equals(s2));

        System.out.println();

        HashMap<Student, ReportCard> studentReport = new HashMap<>();
        studentReport.put(s1, new ReportCard(80));
        studentReport.put(s2, new ReportCard(80));

        System.out.println(studentReport.size());
    }
}
