import java.util.TreeSet;
/* 
 * TreeSet provides an implementation of the Set interface that uses a tree for storage.
 * Objects are stored in a sorted and ascending order. 
 * Access and retrieval times are quite fast.
 */

public class Tree_set {
    public static void main(String[] args) {
        
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Shivam");
        treeSet.add("Ajay");
        treeSet.add("Monu");
        treeSet.add("Akash");

        System.out.println("TreeSet => " + treeSet);
        System.out.println();
    }
}