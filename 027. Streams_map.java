/* Streams provide a better way to manipulate collections. */
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Set;

public class Streams_map {
    public static void main(String[] args) {
        
        List<Integer> numList = new ArrayList<>();
        numList.add(10);
        numList.add(20);
        numList.add(30);
        numList.add(40);
        System.out.println("List of Numbers => " + numList);
        System.out.println();

        // mapping a list
        System.out.println("map(x -> x*x):");
        List<Integer> listOfSquares = numList.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println("    List of Squares => " + listOfSquares);
        Set<Integer> setOfSquares = numList.stream().map(x -> x*x).collect(Collectors.toSet());
        System.out.println("    Set of Squares => " + setOfSquares);
        System.out.println();

        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        System.out.println("List of Numbers => " + languages);
        System.out.println();

        // filter a list
        System.out.println("filter(s -> s.startsWith('p')):");
        List<String> filterResult = languages.stream().filter(s -> s.startsWith("P")).collect(Collectors.toList());
        System.out.println("    Languages starting with 'p' => " + filterResult);
        System.out.println();

        // sort a list
        System.out.println("sorted():");
        List<String> sortedList = languages.stream().sorted().collect(Collectors.toList());
        System.out.println("    Languages sorted alphabetically => " + sortedList);
        System.out.println();

        // iterate a list
        System.out.println("forEach(x -> System.out.print(x)):");
        languages.stream().forEach(x -> System.out.print("  " + x));
        System.out.println("\n");

/* reduce(Identity, (Accumulator) -> implemetation, Combiner): 
            Change the whole collection representation into a single result. 
* Identity - An element that is the initial value of the reduction operation
*            and the default result if the streams is empty.
* Accumulator - A function that takes two parameters, 
*               a partial result of the reduction operation and the next element of the stream.
* Combiner - A function used to combine the partial result of the reduction operation
*            when the reduction is parallelized, or when there is a mismatch between,
*            the types of the accumulator arguments and the types of the accumulator implementation.
*/

        System.out.println("List of Numbers => " + numList);
        System.out.println("reduce():");
        int sum = numList.stream().reduce(0, (ans, i) -> ans+i);
        System.out.println("    Sum of all elements in the List of Numbers => " + sum);
    }
}
