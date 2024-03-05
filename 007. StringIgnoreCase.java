/*  Java String equalsIgnoreCase():
        This method compares two strings, ignoring case differences. 
        If the strings are equal, equalsIgnoreCase() returns true. If not, it returns false.
    Java String compareToIgnoreCase():
        The Java String compareTo() method compares two strings 
            lexicographically (in the dictionary order), ignoring case differences.  
*/

public class StringIgnoreCase {
    public static void main(String[] args) {

        String str1 = "LEARN JAVA";
        String str2 = "Learn Java";

        // if str1 and str2 are equal (ignoring case differences),
        // the result is true
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("str1 and str2 are equal");
        } else {
            System.out.println("str1 and str2 are not equal");
        }

        // if str1 and str2 are equal (ignoring case differences),
        // the result is 0
        if (str1.compareToIgnoreCase(str2) == 0) {
            System.out.println("str1 and str2 are equal");
        } else {
            System.out.println("str1 and str2 are not equal");
        }
    }
}
