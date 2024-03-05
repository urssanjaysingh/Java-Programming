
/* File handling implies how to read from and wite to file in JAVA. 
    Java provides the basic I/O packacge for reading and writing,
    streams.java.io package allows to do all Input and Output tasks in Java.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) {

        // create a new file
        try {
            File myObj = new File("MyFile.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println();

        // write to file
        try {
            FileWriter myWriter = new FileWriter("MyFile.txt");
            myWriter.write("Java is the prominent programming language of the millenium");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println();

        // read the file
        try {
            File myObj = new File("MyFile.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println();

        // getting file information
        File myObj = new File("MyFile.txt");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable: " + myObj.canRead());
            System.out.println("File size in bytes: " + myObj.length());
        } else {
            System.out.println("File does not exist.");
        }
    }
}
