/*Constant in Java are fixed values assigned to identifiers
 *  that are not modified throughout the execution of the code.
 * In java, 
 * the declaration of constant variables is prefixed with final keyword
 *      final data-type variable-name = value;
 */
public class FinalKeyword {
    public static void main(String[] args) {
        final double PI = 3.14159;              //constant
        double radius = 5.87;

        double area = PI * radius * radius;

        System.out.println("Area of the circle is => " + area);
    }
}
