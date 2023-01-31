import java.util.HashMap;
import java.util.Map.Entry; // provide entrySet() method
/* HashMap allows us to store key and value pair, where keys should be unique. */

public class Hash_map {
    public static void main(String[] args) {
        
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Ajay");
        map.put(2, "Akash");
        map.put(3, "Monu");
        map.put(4, "Shivam");

        System.out.println("HashMap => " + map);
        System.out.println();

        System.out.println("Size of map => " + map.size());
        System.out.println();

        System.out.print("containsKey(4) => ");
        System.out.print(map.containsKey(4));
        System.out.println("\n");

        System.out.print("get(4) => ");
        System.out.print(map.get(4));
        System.out.println("\n");

        System.out.print("keySet() => ");
        System.out.print(map.keySet());
        System.out.println("\n");

        System.out.print("values() => ");
        System.out.print(map.values());
        System.out.println("\n");

        for(Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
