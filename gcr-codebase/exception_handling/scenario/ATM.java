package scenario;

class InsufficientBalanceException extends Exception {

    double balance;
    double amount;

    public InsufficientBalanceException(
            String msg,
            double balance,
            double amount) {

        super(msg);
        this.balance = balance;
        this.amount = amount;
    }
}

public class ATM {

    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {

            throw new InsufficientBalanceException(
                    "Insufficient Balance",
                    balance,
                    amount);
        }

        System.out.println("Withdrawal Successful");
    }

    public static void main(String[] args) {

        try {

            withdraw(5000, 8000);

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());
            System.out.println("Available Balance: ₹" + e.balance);
            System.out.println("Requested Amount: ₹" + e.amount);
        }
    }
}
