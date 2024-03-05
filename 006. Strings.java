/*String is a sequence of character or array of character.
 * It is a class in Java which is defined in java.lang.package, 
 *      that is why its first letter is always capital.
 * It is a non-primitive or derived data type.
 * String is immutable(unchangeble) in Java.
 * There are two ways to create String object:
 *  1. By string literal - Java strings literals are created using double quotes("").
 *                              and it uses string pool.
 *  2. By new keyword - Java string objects are created using "new" keyword.
 *                          StringClass objectName = new String("")
 *                              and it uses heap memory. 
*/
public class Strings {
    public static void main(String[] args) {
        /* String methods */
        String s = "Hello";
        System.out.println(s);

        System.out.println();

        /* The escape(\) character is used to escape some of the characters present inside a string. */
        // use the escape character
        String example = "This is the \"String\" class.";
        System.out.println(example);

        System.out.println();

        /* charAt(): Returns a character at a specified index. */
        System.out.println("charAt(1) => " + s.charAt(1));

        /* length(): Returns length of the string. */
        System.out.println("Length => " + s.length());

        /* toUpperCase() and toLowerCase(): Converts string to uppercase or lowercase letter. */
        System.out.println("Uppercase => " + s.toUpperCase());
        System.out.println("Lowercase => " + s.toLowerCase());

        /* startsWith() and endsWith() */
        System.out.println("Is Start with 'He' => " + s.startsWith("He"));
        System.out.println("Is Ends with 'I' => " + s.endsWith("I"));

        System.out.println();

        /* trim(): eliminates white spaces before and after string */
        String str1 = "    Hi! ";
        System.out.println("Before trim => " + str1);
        System.out.println("After trim => " + str1.trim());

        System.out.println();

        /* valueOf: Converts given type such as int, double, boolean, char into string. */
        int a = 10;
        String b = String.valueOf(a);
        System.out.println("valueOf() method => " + b+10);

        System.out.println();

        /* replace(): replaces only first occurrence of first sequence of character
                        with second sequence of character.
         */
        String str2 = "I is a B.Tech Student";
        System.out.println(str2);
        System.out.println("Replacing 'I' with 'Ram' => " + str2.replace("I", "Ram"));

        System.out.println();

        /* replace(): replaces all occurrence of first sequence of character
                        with second sequence of character.
         */
        String str3 = "Ram is a Student. Ram likes Music.";
        System.out.println(str3);
        System.out.println("Replacing 'Ram' with 'He' => " + str3.replaceAll("Ram", "He"));

        System.out.println();

        /* equals(): checks whether two strings are equal or not. */
        String s1 = "Java";
        String s2 = "C++";
        System.out.println("'Java' == 'C++' => " + s1.equals(s2));

        System.out.println();

        String s3 = "Java";
        String s4 = "Java";
        System.out.println("'Java' == 'Java' => " + s3.equals(s4));

        System.out.println();
    }
}
