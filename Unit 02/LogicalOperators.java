public class LogicalOperators {
    public static void main(String[] args) {

        // Use the && operator to check if both conditions are true
        System.out.println((5 > 3) && (8 > 5)); // true
        System.out.println((5 > 3) && (8 < 5)); // false

        // Use the || operator to check if either condition is true
        System.out.println((5 < 3) || (8 > 5)); // true
        System.out.println((5 > 3) || (8 < 5)); // true
        System.out.println((5 < 3) || (8 < 5)); // false

        // Use the ! operator to negate a boolean expression
        System.out.println(!(5 == 3)); // true
        System.out.println(!(5 > 3)); // false

    }
}
