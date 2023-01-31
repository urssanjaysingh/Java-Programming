public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Arithmetic operators -> +, -, *, /
        System.out.println(a + b);
        System.out.println(b - a);
        System.out.println(a * b);
        System.out.println(b / a);

        System.out.println("");

        // Relational operators -> <, >, ==, !=
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a == b);
        System.out.println(a != b);

        System.out.println("");

        // Logical operators -> &, |
/* Note: && does not evaluates the right side condition if left side condition becomes false 
    Similarly, || does not evaluates the right side condition if left side condition becomes true
        Hence, We can save processing power by using && and || instead of & and |
*/
        boolean c = true;
        boolean d = false;
        System.out.println(c & c);
        System.out.println(d & d);
        System.out.println(c & d);
        System.out.println(c | c);
        System.out.println(d | d);
        System.out.println(c | d);

        System.out.println("");

        // Ternary Operator
        int e = 1;
        int f = 2;
        int result;

        result = e < f ? e : f;

        System.out.println(result);
    }
}
