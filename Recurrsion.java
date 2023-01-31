/* In Java, a method that calls itself again and again is known as a recursive method. 
And this, process is known as recursion.
    In order to stop the recursive call, we need to provide some condition inside the method.
        Otherwise, the method will be called infinitely. */

class Factorial {

    static int factorial(int n) {

        if (n != 0) // termination condition
            return n * factorial(n-1);  // recursive call
        else
            return 1;
    }
}

public class Recurrsion {
    public static void main(String[] args) {
        
        int number = 5, result;
        result = Factorial.factorial(number);
        System.out.println("factorial(" + number + ")" + " = " + result);
    }
}
