import java.util.*;

public class AllRoutes {

    // Add road (Undirected Graph)
    public static void addRoad(Map<Integer, List<Integer>> roads, int u, int v) {
        roads.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        roads.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    // DFS to find all paths
    public static void allRoutes(Map<Integer, List<Integer>> roads,
                                 int current,
                                 int target,
                                 List<Integer> path,
                                 Set<Integer> visited,
                                 List<List<Integer>> allPaths) {

        path.add(current);
        visited.add(current);

        if (current == target) {
            allPaths.add(new ArrayList<>(path));
        } else {

            for (int next : roads.getOrDefault(current, Collections.emptyList())) {

                if (!visited.contains(next)) {
                    allRoutes(roads, next, target, path, visited, allPaths);
                }
            }
        }

        // Backtracking
        path.remove(path.size() - 1);
        visited.remove(current);
    }

    public static void main(String[] args) {

        Map<Integer, List<Integer>> roads = new HashMap<>();

        addRoad(roads, 1, 2);
        addRoad(roads, 1, 3);
        addRoad(roads, 2, 4);
        addRoad(roads, 3, 4);
        addRoad(roads, 2, 5);
        addRoad(roads, 5, 4);

        List<List<Integer>> allPaths = new ArrayList<>();

        allRoutes(roads, 1, 4,
                new ArrayList<>(),
                new HashSet<>(),
                allPaths);

        System.out.println("All Possible Routes:");

        for (List<Integer> path : allPaths) {
            System.out.println(path);
        }
    }
}