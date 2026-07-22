import java.util.*;

public class FewestFlights {

    // Add direct flight (Undirected Graph)
    public static void addRoute(Map<Integer, List<Integer>> routes, int u, int v) {
        routes.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        routes.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    // Find shortest path using BFS
    public static List<Integer> fewestFlights(Map<Integer, List<Integer>> routes,
                                              int origin,
                                              int destination) {

        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> parent = new HashMap<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(origin);
        visited.add(origin);
        parent.put(origin, null);

        while (!queue.isEmpty()) {

            int city = queue.poll();

            if (city == destination) {
                break;
            }

            for (int next : routes.getOrDefault(city, Collections.emptyList())) {

                if (!visited.contains(next)) {
                    visited.add(next);
                    parent.put(next, city);
                    queue.offer(next);
                }
            }
        }

        // Destination not reachable
        if (!visited.contains(destination)) {
            return Collections.emptyList();
        }

        // Reconstruct path
        LinkedList<Integer> path = new LinkedList<>();
        Integer node = destination;

        while (node != null) {
            path.addFirst(node);
            node = parent.get(node);
        }

        return path;
    }

    public static void main(String[] args) {

        Map<Integer, List<Integer>> routes = new HashMap<>();

        addRoute(routes, 1, 2);
        addRoute(routes, 1, 3);
        addRoute(routes, 2, 4);
        addRoute(routes, 3, 5);
        addRoute(routes, 4, 6);
        addRoute(routes, 5, 6);

        int origin = 1;
        int destination = 6;

        List<Integer> path = fewestFlights(routes, origin, destination);

        if (path.isEmpty()) {
            System.out.println("No route available.");
        } else {
            System.out.println("Shortest Path: " + path);
            System.out.println("Number of Flights: " + (path.size() - 1));
        }
    }
}