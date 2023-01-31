import java.util.TreeMap;
/* TreeMap provides an efficient means of storing key-value pairs in sorted order. */

public class Tree_map {
    public static void main(String[] args) {
        
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(3, "Monu");
        treeMap.put(2, "Akash");
        treeMap.put(1, "Ajay");
        treeMap.put(4, "Shivam");

        System.out.println("TreehMap => " + treeMap);
        System.out.println();
    }
}
