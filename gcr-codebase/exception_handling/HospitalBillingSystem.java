class InsufficientFundsException extends Exception {
    InsufficientFundsException(String msg) {
        super(msg);
    }
}

public class HospitalBillingSystem {

    static void makePayment(double bill, double payment)
            throws InsufficientFundsException {

        if (payment < bill) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds");
        }

        System.out.println("Payment successful");
    }

    public static void main(String[] args) {

        String[] patients = {"Amit", "Rahul", "Neha"};

        try {

            // NumberFormatException
            int totalBill = Integer.parseInt("5000");
            int items = Integer.parseInt("0");

            // ArithmeticException
            int costPerItem = totalBill / items;
            System.out.println("Cost per item = " + costPerItem);

            // ArrayIndexOutOfBoundsException
            int patientIndex = 5;
            System.out.println("Patient = " + patients[patientIndex]);

            makePayment(totalBill, 2000);

        } catch (ArithmeticException e) {
            System.out.println("Error: Number of items cannot be zero.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Unexpected error occurred.");
        }

        System.out.println("Hospital billing system running safely.");
    }
}
