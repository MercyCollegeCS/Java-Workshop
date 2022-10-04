class IfStatement {
  public static void main(String[] args) {

    int number = 10;
    
    // compare number
    // checks if number is less than 0
    if (number < 0) {
      System.out.println("The number is negative.");
    }

    System.out.println("Statement outside if block");

    String language = "Java";

    // compare string
    if (language == "Java") {
      System.out.println("Good Programming Language");
    }

  }
}