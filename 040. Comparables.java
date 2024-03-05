
/* Java provides two interfaces(comparable and comparator), 
    to sort objects using data members of the class.
* Comparable:
    Comparable is present in java.lang package.
    We can sort the collection on the basis of a single element.
    Provides compareTo() metod to sort elements.
*/
import java.util.ArrayList;
import java.util.Collections;

// A class 'Laptop' that implements Comparable
class Laptop implements Comparable<Laptop> {

    private String brand;
    private int ram;
    private int price;

    // constructor
    public Laptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    // getter methods for accessing private data
    public String getBrand() {
        return this.brand;
    }

    public int getRam() {
        return this.ram;
    }

    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "{" +
                " brand='" + getBrand() + "'" +
                ", ram='" + getRam() + "'" +
                ", price='" + getPrice() + "'" +
                "}";
    }

    // sorting by ram
    @Override
    public int compareTo(Laptop l) {
        if (this.getRam() > l.getRam())
            return 1;
        else
            return -1;
    }
}

public class Comparables {
    public static void main(String[] args) {

        ArrayList<Laptop> laps = new ArrayList<>();
        laps.add(new Laptop("Dell", 16, 800));
        laps.add(new Laptop("Apple", 8, 1200));
        laps.add(new Laptop("Acer", 12, 700));

        Collections.sort(laps);

        for (Laptop lap : laps) {
            System.out.println(lap);
        }
    }
}
