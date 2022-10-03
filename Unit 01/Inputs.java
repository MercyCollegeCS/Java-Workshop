import java.util.Scanner;

public class Inputs  { // make sure the class name is the same as filename
    public static void main(String []args) { // main program

    int length; // declare variables
    int width;
    int area;

    // Create a Scanner object to read input.
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = keyboard.next(); // returns the next thing to read as a String
    System.out.println("Welcome, " + name);

    // Get length from the user.
    System.out.print("Enter length: ");
    length = keyboard.nextInt(); // returns the next thing to read as an integer

    // Get width from the user.
    System.out.print("Enter width: ");
    width = keyboard.nextInt();

    // Calculate area.
    area = length * width;

    // Display area.
    System.out.println("The area of rectangle is " + area);

    }
 }


