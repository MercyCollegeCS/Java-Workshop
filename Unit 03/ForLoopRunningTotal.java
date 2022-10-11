// Program to find the total of natural numbers from 1 to 100.

class ForLoopRunningTotal {
    public static void main(String[] args) {

        int total = 0;
        int n = 101;

        // for loop
        for (int i = 1; i < n; ++i) {
            // body inside for loop
            total += i;
        }

        System.out.println("total = " + total);
    }
}