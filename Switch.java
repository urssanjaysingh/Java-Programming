import java.util.Scanner;

/*Switch Statement allows us to execute a block of code among many alternative. */

public class Switch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter day number: ");
        int day = scan.nextInt();
        scan.close();

        String dayString;

        switch (day) {
            case 1:
                dayString = "Monday";
                break;

            case 2:
                dayString = "Tuesday";
                break;

            case 3:
                dayString = "Wednesday";
                break;

            case 4:
                dayString = "Thursday";
                break;

            case 5:
                dayString = "Friday";
                break;

            case 6:
                dayString = "Saturday";
                break;

            case 7:
                dayString = "Sunday";
                break;

            default:
                dayString = "Invalid Day!";
                break;
        }
        System.out.println(dayString);
    }
}
