import java.util.*;

public class CircuitCycleDetection {

    // Add connection (Undirected Graph)
    public static void addConnection(Map<Integer, List<Integer>> circuit, int u, int v) {
        circuit.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        circuit.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    // DFS to detect cycle
    public static boolean dfsCycleCheck(Map<Integer, List<Integer>> circuit,
                                        int node,
                                        int parent,
                                        Set<Integer> visited) {

        visited.add(node);

        for (int neighbor : circuit.getOrDefault(node, Collections.emptyList())) {

            if (!visited.contains(neighbor)) {

                if (dfsCycleCheck(circuit, neighbor, node, visited)) {
                    return true;
                }

            } else if (neighbor != parent) {
                return true;
            }
        }

        return false;
    }

    // Check if graph contains a cycle
    public static boolean hasWiringLoop(Map<Integer, List<Integer>> circuit, int n) {

        Set<Integer> visited = new HashSet<>();

        for (int v = 0; v < n; v++) {

            if (!visited.contains(v)) {

                if (dfsCycleCheck(circuit, v, -1, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int n = 5;

        Map<Integer, List<Integer>> circuit = new HashMap<>();

        addConnection(circuit, 0, 1);
        addConnection(circuit, 1, 2);
        addConnection(circuit, 2, 3);
        addConnection(circuit, 3, 1); // Creates a cycle
        addConnection(circuit, 3, 4);

        if (hasWiringLoop(circuit, n)) {
            System.out.println("Cycle Detected (Wiring Loop Found)");
        } else {
            System.out.println("No Cycle Found");
        }
    }
}