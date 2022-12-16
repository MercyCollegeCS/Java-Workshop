class NestedIf {
    public static void main(String[] args) {

        // Declare three variables, n1, n2, and n3, and initialize them
        Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;

        // Use an if statement to check if n1 is greater than or equal to n2
        if (n1 >= n2) {

            // Use another if...else statement to check if n1 is greater than or equal to n3
            if (n1 >= n3) {
                // If the condition is true, assign n1 to the largest variable
                largest = n1;
            }

            else {
                // If the condition is false, assign n3 to the largest variable
                largest = n3;
            }
        } else {

            // Use another if...else statement to check if n2 is greater than or equal to n3
            if (n2 >= n3) {
                // If the condition is true, assign n2 to the largest variable
                largest = n2;
            }

            else {
                // If the condition is false, assign n3 to the largest variable
                largest = n3;
            }
        }

        // Print the value of the largest variable to the console
        System.out.println("Largest Number: " + largest);
    }
}
