import java.lang.Math;

public class Operators  { // make sure the class name is the same as filename
    public static void main(String []args) { // main program
      
    int a = 10;
    int b = 20;
    int c = 3;

    System.out.println("a + b = " + (a+b));
    System.out.println("a - b = " + (a-b));
    System.out.println("a * b = " + (a*b));
    System.out.println("a ^ c = " + Math.pow(a, c)); // import Math library, exponent
    
    System.out.println("a / c = " + (a/c));
    System.out.println("(float) a / c = " + (float) a/c); // cast result as float
    System.out.println("10 / 3f = " + 10 / 3f); // one operand is float, the calculation is float
    System.out.println("10.0 / 3 = " + 10.0 / 3); // one operand is double, the calculation is double

    System.out.println("a % c = " + (a%c)); // mod
    System.out.println(5/2); // mod  

    }
 }


