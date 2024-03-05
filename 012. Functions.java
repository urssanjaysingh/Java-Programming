/* Fuction is a block of code which performs a specific task */
public class Functions {
    public static void main(String[] args) {
        greet(); // function call
        add(5, 10);
        swap(10, 20);

        /* we have to create a object to invoke a non static function */
        Functions obj = new Functions();
        int get_result = obj.sum(10, 20);
        System.out.println(get_result);
    }

    /* function without parameter */
    public static void greet() // function defination
    {
        System.out.println("Hello User!");
    }

    /* function with parameter */
    public static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    /* function to swap values */
    public static void swap(int a, int b) {
        System.out.println("Before swapping, a = " + a + " b = " + b);

        int c = a;
        a = b;
        b = c;
        System.out.println("After swapping, a = " + a + " b = " + b);
    }

    /* function with return values */
    public int sum(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }
}
