/* The Java Object hashCode() method returns the hash code value associated with the object.
 * Note: The hash code value is an integer value associated with each object. 
 * It is used to identify the location of objects in the hash table.
 */
import java.util.ArrayList;

public class ObjectHashCode {
    public static void main(String[] args) {

        // hashCode() with Object
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        System.out.println("Object-1 Hash-Code => " + obj1.hashCode()); 
        System.out.println("Object-2 Hash-Code => " + obj2.hashCode()); 
        System.out.println("Object-3 Hash-Code => " + obj3.hashCode()); 

        System.out.println();

        // hashCode() with String
        String str = new String();
        System.out.println(str.hashCode());  

        System.out.println();

        // hashCode() with ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.hashCode());  

        System.out.println();

        // Hash Code Value for Equals Object
        // hashCode() with Object
        Object obj4 = new Object();
        // assign obj1 to obj2
        Object obj5 = obj4;
        // check if two objects are equal
        System.out.println(obj4.equals(obj5));  
        // get hashcode of obj1 and obj2
        System.out.println(obj4.hashCode());   
        System.out.println(obj5.hashCode());   
    }
}
