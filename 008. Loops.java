/* Looping statements are used to repeat a task multiple times */
public class Loops {
    public static void main(String[] args) {
        // while loop
        int x = 1;
        while (x <= 4) {
            System.out.print(x + " ");
            x++;
        }
        System.out.println("\n");

        // do-while loop
        int y = 6;
        do {
            System.out.print(y + " ");
            y++;
        } while (y < 5);
        System.out.println("\n");

        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Enhanced for loop
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int item : numbers) {
            System.out.print(item + " ");
        }
    }
}
