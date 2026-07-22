import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FriendGraph {

    private Map<Integer, Set<Integer>> friendGraph = new HashMap<>();

    // Add friendship (Undirected Graph)
    public void addFriendship(int u, int v) {
        friendGraph.computeIfAbsent(u, k -> new HashSet<>()).add(v);
        friendGraph.computeIfAbsent(v, k -> new HashSet<>()).add(u);
    }

    // Check if two users are friends
    public boolean isFriend(int u, int v) {
        return friendGraph
                .getOrDefault(u, Collections.emptySet())
                .contains(v);
    }

    // Display graph
    public void displayGraph() {
        for (Map.Entry<Integer, Set<Integer>> entry : friendGraph.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        FriendGraph graph = new FriendGraph();

        // Add friendships
        graph.addFriendship(1, 2);
        graph.addFriendship(1, 3);
        graph.addFriendship(2, 4);
        graph.addFriendship(3, 5);
        graph.addFriendship(4, 5);

        System.out.println("Friend Graph:");
        graph.displayGraph();

        System.out.println();

        System.out.println("Is 1 friend of 2? " + graph.isFriend(1, 2));
        System.out.println("Is 1 friend of 5? " + graph.isFriend(1, 5));
        System.out.println("Is 4 friend of 5? " + graph.isFriend(4, 5));
    }
}