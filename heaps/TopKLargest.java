import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class TopKLargest {

    public static List<Integer> topKLargest(int[] transactions, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int amount : transactions) {

            if (minHeap.size() < k) {
                minHeap.offer(amount);
            } else if (amount > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(amount);
            }
        }

        return new ArrayList<>(minHeap);
    }

    public static void main(String[] args) {

        int[] transactions = {5000, 12000, 7000, 15000, 3000, 20000, 9000};
        int k = 3;

        List<Integer> result = topKLargest(transactions, k);

        System.out.println("Top " + k + " Largest Transactions:");
        System.out.println(result);
    }
}