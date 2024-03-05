import java.util.PriorityQueue;
/*Queue in Java is a linear data structure where you can handle an ordered collection of elements.
 * It follows the FIFO(First in First Out) principle.
 * A Priority-Queue maintain natural or sorted order. 
 * If we just print a Priority-queue the output will not be in sorted order,
 *  but if we print queue after remove(), peek() then output will be sorted.
*/

public class Queue_demo {
    public static void main(String[] args) {
        
        PriorityQueue<String> queue = new PriorityQueue<>();

        queue.add("India");
        queue.add("Germay");
        queue.add("America");

        System.out.println("Queue => " + queue);
        System.out.println();

        System.out.println("remove() => " + queue.remove());
        System.out.println();

        System.out.println("Queue => " + queue);
        System.out.println();

        System.out.println("peek() => " + queue.peek());
        System.out.println();

        System.out.println("Queue => " + queue);
        System.out.println();

        String head = queue.poll();
        System.out.println("poll() => " + head);
        System.out.println();

        System.out.println("Queue => " + queue);
        System.out.println();
    }
}
