/*Method Overloading in java is a feature that allows a class to have 
more than one method with same name but different parameters and return types */

public class Overloading {
    public static void main(String[] args) {
        int rectangle_area = area(30, 20);
        System.out.println("Area of rectangle: " + rectangle_area);

        float circle_area = area(2.5f);
        System.out.println("Area of circle: " + circle_area);
    }

    /* Function to find area of a rectangle */
    public static int area(int length, int width) {
        int result = length * width;
        return result;
    }

    /* Function to find area of a circle */
    public static float area(float radius) {
        float result = 3.14f * radius * radius;
        return result;
    }
}
