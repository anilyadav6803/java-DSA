public class Fibonacci {
    public static void printFibonacci(int n) {
        if (n < 0) {
            System.out.println("Invalid input");
            return;
        }
        
        long[] fib = new long[n + 1];
        
        if (n >= 0) {
            fib[0] = 0;
            System.out.print(fib[0] + " ");
        }
        if (n >= 1) {
            fib[1] = 1;
            System.out.print(fib[1] + " ");
        }
        
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.print(fib[i] + " ");
        }
        
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5;
        printFibonacci(n);
    }
}