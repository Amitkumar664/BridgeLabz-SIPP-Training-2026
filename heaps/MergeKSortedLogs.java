import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class LogEntry {
    int timestamp;

    LogEntry(int timestamp) {
        this.timestamp = timestamp;
    }
}

class Node {
    int sourceIndex;
    int elementIndex;

    Node(int sourceIndex, int elementIndex) {
        this.sourceIndex = sourceIndex;
        this.elementIndex = elementIndex;
    }
}

public class MergeKSortedLogs {

    public static List<LogEntry> mergeKSortedLogs(List<List<LogEntry>> sources) {

        PriorityQueue<Node> minHeap = new PriorityQueue<>(
                (a, b) -> sources.get(a.sourceIndex).get(a.elementIndex).timestamp
                        - sources.get(b.sourceIndex).get(b.elementIndex).timestamp);

        // Insert first element from each list
        for (int i = 0; i < sources.size(); i++) {
            if (!sources.get(i).isEmpty()) {
                minHeap.offer(new Node(i, 0));
            }
        }

        List<LogEntry> merged = new ArrayList<>();

        while (!minHeap.isEmpty()) {

            Node current = minHeap.poll();

            int source = current.sourceIndex;
            int index = current.elementIndex;

            merged.add(sources.get(source).get(index));

            // Insert next element from the same list
            if (index + 1 < sources.get(source).size()) {
                minHeap.offer(new Node(source, index + 1));
            }
        }

        return merged;
    }

    public static void main(String[] args) {

        List<List<LogEntry>> logs = new ArrayList<>();

        logs.add(List.of(new LogEntry(1), new LogEntry(4), new LogEntry(7)));
        logs.add(List.of(new LogEntry(2), new LogEntry(5), new LogEntry(8)));
        logs.add(List.of(new LogEntry(3), new LogEntry(6), new LogEntry(9)));

        List<LogEntry> result = mergeKSortedLogs(logs);

        System.out.println("Merged Logs:");

        for (LogEntry log : result) {
            System.out.print(log.timestamp + " ");
        }
    }
}