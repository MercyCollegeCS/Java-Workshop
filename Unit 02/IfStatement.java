class IfStatement {
  public static void main(String[] args) {

    // Declare a variable called number and initialize it to 10
    int number = 10;

    // Use an if statement to check if the value of number is less than 0
    if (number < 0) {
      // If the condition is true, print a message to the console
      System.out.println("The number is negative.");
    }

    // This statement will be executed regardless of the if statement
    System.out.println("Statement outside if block");

    // Declare a variable called language and initialize it to "Java"
    String language = "Java";

    // Use an if statement to compare the value of language to the string "Java"
    if (language == "Java") {
      // If the values are equal, print a message to the console
      System.out.println("Good Programming Language");
    }

  }
}