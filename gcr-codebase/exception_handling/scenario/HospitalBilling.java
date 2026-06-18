package scenario;

class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

public class HospitalBilling {

    static void makePayment(double balance, double bill)
            throws InsufficientFundsException {

        if (balance < bill) {
            throw new InsufficientFundsException(
                    "Payment Failed: Insufficient Funds");
        }

        System.out.println("Payment Successful");
    }

    public static void main(String[] args) {

        try {

            // Division by zero
            int totalBill = 1000;
            int items = 0;
            System.out.println(totalBill / items);

            // Invalid patient index
            int patients[] = {101, 102, 103};
            System.out.println(patients[5]);

            // Bad numeric input
            int age = Integer.parseInt("abc");

            // Payment failure
            makePayment(500, 1000);

        }

        catch (ArithmeticException e) {
            System.out.println("Error: Number of items cannot be zero.");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        }

        catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        }

        catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("System continues running...");
    }
}