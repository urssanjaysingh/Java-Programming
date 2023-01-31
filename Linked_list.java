import java.util.LinkedList;
/* LinkedList internally uses a doubly linked list and provides methods to work with it */

public class Linked_list {
    public static void main(String[] args) {
        
        LinkedList<String> names = new LinkedList<>();

        names.add("Ajay");
        names.add("Akash");
        names.add("Monu");
        names.add("Shivam");

        System.out.println("Linked List => " + names);
        System.out.println();

        System.out.print("addFirst('Jenny') => ");
        names.addFirst("Jenny");
        System.out.println(names);
        System.out.println();

        System.out.print("addLast('Chris') => ");
        names.addLast("Chris");
        System.out.println(names);
        System.out.println();

        System.out.print("add(4, 'Sanjay') => ");
        names.add(4, "Sanjay");
        System.out.println(names);
        System.out.println();

        System.out.print("removeFirst() => ");
        names.removeFirst();
        System.out.println(names);
        System.out.println();

        System.out.print("removeLast() => ");
        names.removeLast();
        System.out.println(names);
    }
}
