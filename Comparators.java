/* Java provides two interfaces(comparable and comparator), 
    to sort objects using data members of the class.
* Comparator:
    Comparator is present in the java.util package.
    We can sort the collection on te basis of multiple elements.
    Provides compare() method to sort elements.
*/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Laptop {

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
}

public class Comparators {
    public static void main(String[] args) {

        ArrayList<Laptop> laps = new ArrayList<>();
        laps.add(new Laptop("Dell", 16, 800));
        laps.add(new Laptop("Apple", 8, 1200));
        laps.add(new Laptop("Acer", 12, 700));

        // sorting by price
        Comparator<Laptop> lapy = new Comparator<Laptop>() {
            public int compare(Laptop l1, Laptop l2) {
                if(l1.getPrice() > l2.getPrice())
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(laps, lapy);

        for (Laptop lap : laps) {
            System.out.println(lap);
        }
    }
}
