public class SwitchUp {
    public static void main(String args[]) {
        // Declare a variable called grade, and initialize it to 85

        int grade = 85;
        // Divide grade by 10, and store the result in a new variable called tempgrade
        int tempgrade = grade / 10;

        // Use a switch statement to check the value of tempgrade
        switch (tempgrade) {
            // If tempgrade is 10 or 9, print an A to the console
            case 10:
            case 9:
                System.out.println('A');
                // Use the break statement to exit the switch statement
                break;
            case 8:
                // If tempgrade is 8, print a B to the console
                System.out.println('B');
                break;
            case 7:
                System.out.println('C');
                break;
            case 6:
                System.out.println('A');
                break;
            // If tempgrade is any other value, print an F to the console
            default:
                System.out.println('F');
        }
    }
}