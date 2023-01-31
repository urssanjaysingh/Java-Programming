/* If we want to access class members without creating an instance of the class,
 * we need to declare the members static. 
 * Static members can be accessed directly from other class using the class name.
 * If we declare a variable static, all objects of the class share the same static variable.
Note: Static variables are rarely used in Java. Instead, the static constants are use.
    These static constants are defined by 'static final' keyword. and reperesented in uppercase.
 */

class StaticTest {
    // non-static method 
    int multiply(int a, int b) {
        return a * b;
    }

    // static method
    static int add(int a, int b) {
        return a + b;
    }
}

class Test {
    // static variable
    static int max = 10;

    // non-static variable
    int min = 5;
}

public class StaticKeyword {
    public static void main(String[] args) {
        StaticTest st = new StaticTest();
        // calling non-static method
        System.out.println(st.multiply(2, 2));
        // calling static method
        System.out.println(StaticTest.add(2, 3));

        System.out.println();

        Test obj  = new Test();
        // accessing non-static variable
        System.out.println(obj.min + 1);
        // accessing static variable
        System.out.println(Test.max + 1);
    }
}