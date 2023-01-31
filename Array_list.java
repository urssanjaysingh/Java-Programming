import java.util.ArrayList;
/* ArrayList is a resizable array with many useful methods to work with */

public class Array_list {
    public static void main(String[] args) {

        ArrayList<String> color = new ArrayList<>();

        color.add("Red");
        color.add("Green");
        color.add("Blue");
        color.add("Yellow");

        System.out.println("Array List: " + color);
        System.out.println();

        System.out.print("set(3, 'Orange') => ");
        color.set(3, "Orange"); // change element values
        System.out.println(color);

        System.out.println();
        System.out.print("get(3) => "); 
        System.out.print(color.get(3)); // get individual element
        System.out.println();

        System.out.println();
        System.out.print("remove(3) => ");
        color.remove(3); // remove element
        System.out.println(color);
    }
}
