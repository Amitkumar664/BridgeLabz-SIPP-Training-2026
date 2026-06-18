package level;

import java.util.Scanner;

public class MultipleCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter index: ");
            int idx = sc.nextInt();

            System.out.println("Value at index " + idx + ": " + arr[idx]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");

        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }

        sc.close();
    }
}
