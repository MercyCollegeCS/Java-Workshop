import java.util.Scanner;

public class IfElseBoolean {
    public static void main(String[] args) {

        System.out.print("Enter a score: ");
        Scanner keyboard = new Scanner(System.in);
        int score = keyboard.nextInt();

        if (score >= 0 && score <= 100) {
            System.out.println("Score is valid");
        }
        else {
            System.out.println("Please Enter a range from 0 to 100.");
        }

    }
}
