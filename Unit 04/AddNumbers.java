class AddNumbers {
    // create a method
    public static int addNumbers(int a, int b) {
        int total = a + b;
        // return value
        return total;
    }

    public static void main(String[] args) {

        int num1 = 25;
        int num2 = 15;

        System.out.println("Sum is: " + addNumbers(num1, num2));
    }
}