import java.ang.Math;

public class ExampleOperators  { // make sure the class name is the same as filename
    public static void main(String []args) { // main program
      
    int a = 10;
    int b = 20;
    int c = 3;

    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(Math.pow(a, c)); // import Math library, exponent
    
    System.out.println(a/c);
    
    float d = a/c;
    System.out.println(d);

    float e = (float) a/c; // keep decimal
    System.out.println(e);

    System.out.println(Math.floorDiv(a, c)); // import Math library, floor division
    System.out.println(a%c); // mod
      

    }
 }


