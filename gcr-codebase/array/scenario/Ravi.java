/*A warehouse stores item quantities in an array. Find the max, min,
total stock, and detect duplicates. Extend: rotate the stock array by
k positions (simulate daily shift handover), and transpose a 2D shelf
grid.*/
import java.util.*;

public class Ravi {

    public static int max(int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] rotate(int arr[], int k) {
        int n = arr.length;
        k = k % n;

        int rotated[] = new int[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            rotated[newIndex] = arr[i];
        }

        return rotated;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1D Array
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter stock quantities:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Maximum
        int ansMax = max(arr);
        System.out.println("Maximum stock = " + ansMax);

        // Minimum
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum stock = " + min);

        // Total Stock
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        System.out.println("Total stock = " + total);

        // Duplicate Detection
        boolean visited[] = new boolean[arr.length];

        System.out.println("Duplicate elements:");

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (visited[i]) {
                continue;
            }

            boolean duplicateFound = false;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    duplicateFound = true;
                }
            }

            if (duplicateFound) {
                found = true;
                System.out.println(arr[i]);
            }
        }

        if (!found) {
            System.out.println("No duplicates found.");
        }

        // Rotate Array
        System.out.print("Enter k for rotation: ");
        int k = sc.nextInt();

        int rotated[] = rotate(arr, k);

        System.out.print("Rotated Array: ");
        for (int i = 0; i < rotated.length; i++) {
            System.out.print(rotated[i] + " ");
        }
        System.out.println();

        // 2D Array (Shelf Grid)
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int grid[][] = new int[rows][cols];

        System.out.println("Enter shelf grid:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Grid:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose
        System.out.println("Transpose Grid:");

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }












}


