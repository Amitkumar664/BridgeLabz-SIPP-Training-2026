class MathWizard {

    // Instance variable
    int number = 100;

    // Check if a number is prime
    public boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Factorial using iteration (int version)
    public long factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Factorial not defined for negative numbers");

        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Overloaded factorial method (double version)
    public double factorial(double n) {
        if (n < 0 || n != (int) n)
            throw new IllegalArgumentException(
                    "Factorial only defined for non-negative whole numbers");

        double fact = 1;
        for (int i = 1; i <= (int) n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Fibonacci series up to nth term
    public int fibonacci(int n) {
        if (n <= 1)
            return n;

        int a = 0, b = 1, c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    // GCD using Euclidean algorithm
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    // LCM
    public int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    // Power function
    public double power(double base, int exp) {
        double result = 1;

        for (int i = 1; i <= Math.abs(exp); i++) {
            result *= base;
        }

        return (exp < 0) ? 1 / result : result;
    }

    // Demonstrating local vs instance variable
    public void showScopeDifference() {

        // Local variable
        int number = 50;

        System.out.println("Local Variable number = " + number);
        System.out.println("Instance Variable number = " + this.number);
    }
}

// Driver Class
public class MathWizardDemo {
    public static void main(String[] args) {

        MathWizard mw = new MathWizard();

        System.out.println("Prime Check (29): " + mw.isPrime(29));

        System.out.println("Factorial(int) of 5: " + mw.factorial(5));

        System.out.println("Factorial(double) of 6.0: " + mw.factorial(6.0));

        System.out.println("Fibonacci(10): " + mw.fibonacci(10));

        System.out.println("GCD(24, 36): " + mw.gcd(24, 36));

        System.out.println("LCM(24, 36): " + mw.lcm(24, 36));

        System.out.println("Power(2, 5): " + mw.power(2, 5));

        System.out.println("\nScope Demonstration:");
        mw.showScopeDifference();
    }
}