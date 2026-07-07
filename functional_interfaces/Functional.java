import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
interface Calculator {
    int calc(int x, int y);
}

public class Functional {

    static int method1(Calculator obj, int x, int y) {
        return obj.calc(x, y);
    }

    public static void main(String[] args) {

        // Consumer
        Consumer<Integer> consumer = x -> System.out.println("Hello " + x);

        // Predicate
        Predicate<Integer> pred = x -> x % 2 == 0;

        // Function
        Function<Integer, Integer> func = x -> x * x;

        consumer.accept(10);

        // Custom Functional Interface
        Calculator add = (x, y) -> x + y;
        Calculator multiply = (x, y) -> x * y;

        System.out.println("Addition: " + add.calc(5, 10));
        System.out.println("Multiplication: " + multiply.calc(5, 10));

        System.out.println("Method1 Result: " + method1(add, 6, 10));

        System.out.println("Square of 6: " + func.apply(6));

        // List
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("\nEven Numbers:");
        list.stream()
                .filter(pred)
                .forEach(System.out::println);

        // Filter + Map + Collect
        List<Integer> list2 = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .collect(Collectors.toList());

        System.out.println("\nSquared Even Numbers:");
        System.out.println(list2);

        // Print individually
        System.out.println("\nUsing forEach:");
        list2.forEach(System.out::println);
    }
}