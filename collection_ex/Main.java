import java.util.*;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        
    }

    public String toString() {
        return id + " " + name + " " + age;
    }
}

public class Main {
    public static void main(String[] args) {

        // Ascending order by age
        //sort students baased on age in desc order
        //sort students bassed on name in desc ore
        TreeSet<Student> ascSet = new TreeSet<>((s1, s2) -> {
            if (s1.age != s2.age)
                return s1.age - s2.age;
            return s1.id - s2.id; // Tie-breaker
        });

        ascSet.add(new Student(101, "Amit", 22));
        ascSet.add(new Student(102, "Rahul", 20));
        ascSet.add(new Student(103, "Ankit", 21));
        ascSet.add(new Student(104, "Priya", 20));

        System.out.println("Ascending Order (Age):");
        for (Student s : ascSet) {
            System.out.println(s);
        }

        // Descending order by age
        TreeSet<Student> descSet = new TreeSet<>((s1, s2) -> {
            if (s1.age != s2.age)
                return s2.age - s1.age;
            return s1.id - s2.id; // Tie-breaker
        });

        descSet.add(new Student(101, "Amit", 22));
        descSet.add(new Student(102, "Rahul", 20));
        descSet.add(new Student(103, "Ankit", 21));
        descSet.add(new Student(104, "Priya", 20));

        System.out.println("\nDescending Order (Age):");
        for (Student s : descSet) {
            System.out.println(s);
        }
    }
}