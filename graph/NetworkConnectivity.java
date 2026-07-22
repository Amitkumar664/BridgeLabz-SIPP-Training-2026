import java.util.*;

public class NetworkConnectivity {

    // Add connection (Undirected Graph)
    public static void addConnection(Map<Integer, List<Integer>> network, int u, int v) {
        network.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        network.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    // DFS to mark all connected servers
    public static void dfsMark(Map<Integer, List<Integer>> network,
                               int node,
                               Set<Integer> visited) {

        visited.add(node);

        for (int neighbor : network.getOrDefault(node, Collections.emptyList())) {

            if (!visited.contains(neighbor)) {
                dfsMark(network, neighbor, visited);
            }
        }
    }

    // Count connected components
    public static int countNetworkSegments(Map<Integer, List<Integer>> network, int n) {

        Set<Integer> visited = new HashSet<>();
        int segments = 0;

        for (int server = 0; server < n; server++) {

            if (!visited.contains(server)) {
                segments++;
                dfsMark(network, server, visited);
            }
        }

        return segments;
    }

    public static void main(String[] args) {

        int n = 7; // Servers: 0 to 6

        Map<Integer, List<Integer>> network = new HashMap<>();

        addConnection(network, 0, 1);
        addConnection(network, 1, 2);

        addConnection(network, 3, 4);

        addConnection(network, 5, 6);

        int segments = countNetworkSegments(network, n);

        System.out.println("Connected Components: " + segments);

        if (segments == 1) {
            System.out.println("Network is Fully Connected");
        } else {
            System.out.println("Network is NOT Fully Connected");
        }
    }
}