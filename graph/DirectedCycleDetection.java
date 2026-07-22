import java.util.*;

public class DirectedCycleDetection {

    // Add directed edge
    public static void addDependency(Map<Integer, List<Integer>> tasks, int from, int to) {
        tasks.computeIfAbsent(from, k -> new ArrayList<>()).add(to);
    }

    // DFS to detect cycle
    public static boolean dfsCycleCheck(Map<Integer, List<Integer>> tasks,
                                        int node,
                                        int[] state) {

        state[node] = 1; // GRAY (Currently Visiting)

        for (int dep : tasks.getOrDefault(node, Collections.emptyList())) {

            if (state[dep] == 1) {
                return true; // Cycle Found
            }

            if (state[dep] == 0) {
                if (dfsCycleCheck(tasks, dep, state)) {
                    return true;
                }
            }
        }

        state[node] = 2; // BLACK (Completely Visited)

        return false;
    }

    // Check for circular dependency
    public static boolean hasCircularDependency(Map<Integer, List<Integer>> tasks, int n) {

        int[] state = new int[n];
        // 0 = WHITE, 1 = GRAY, 2 = BLACK

        for (int v = 0; v < n; v++) {

            if (state[v] == 0) {

                if (dfsCycleCheck(tasks, v, state)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int n = 4;

        Map<Integer, List<Integer>> tasks = new HashMap<>();

        addDependency(tasks, 0, 1);
        addDependency(tasks, 1, 2);
        addDependency(tasks, 2, 3);
        addDependency(tasks, 3, 1); // Creates a cycle

        if (hasCircularDependency(tasks, n)) {
            System.out.println("Circular Dependency Detected");
        } else {
            System.out.println("No Circular Dependency");
        }
    }
}