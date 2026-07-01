import java.util.*;

public class ArraylistEx {

    static class Employee {
        int id;
        String name;

        Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {

        ArrayList<Employee> list1 = new ArrayList<>();

        Employee emp1 = new Employee(0, "Sumit");
        Employee emp2 = new Employee(1, "Amit");

        list1.add(emp1);
        list1.add(emp2);

        for (Employee e : list1) {
            System.out.println(e.id + " " + e.name);
        }
    }
}