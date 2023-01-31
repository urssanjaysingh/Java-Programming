/* An enumeration is defined as a list that contains constants. 
    The enumeration is created using the enum keyword.
*/
public class Enumeration {
    enum Direction {
        East, West, North, South
    }

    public static void main(String[] args) {
        Direction d1, d2, d3, d4; // variables of type Direction
        d1 = Direction.East;
        d2 = Direction.West;
        d3 = Direction.North;
        d4 = Direction.South;
        System.out.println("Direction 1 => " + d1);
        System.out.println("Direction 2 => " + d2);
        System.out.println("Direction 3 => " + d3);
        System.out.println("Direction 4 => " + d4);
    }
}
