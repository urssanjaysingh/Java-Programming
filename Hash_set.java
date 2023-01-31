import java.util.HashSet;
/* Hashset is a unique collection. Elements will be access in a random fashion. */

public class Hash_set {
    public static void main(String[] args) {
        
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Ajay");
        hashSet.add("Akash");
        hashSet.add("Monu");
        hashSet.add("Shivam");

        System.out.println("HashSet => " + hashSet);
        System.out.println();

        System.out.print("add('Monu') => ");
        hashSet.add("Monu");
        System.out.println(hashSet);
        System.out.println();

        System.out.print("contains('Shivam') => ");
        System.out.print(hashSet.contains("Shivam"));
        System.out.println();
        System.out.print("contains('Sanjay') => ");
        System.out.print(hashSet.contains("Sanjay"));
        System.out.println("\n");

        System.out.print("remove('Shivam') => ");
        hashSet.remove("Shivam");
        System.out.println(hashSet);
        System.out.println();
    }
}
