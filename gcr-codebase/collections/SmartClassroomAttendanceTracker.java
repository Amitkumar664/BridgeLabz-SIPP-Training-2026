import java.util.ArrayList;
import java.util.HashMap;

public class SmartClassroomAttendanceTracker {

    HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    // Mark Attendance
    public void markAttendance(String subject, String student) {

        if (!attendance.containsKey(subject)) {
            attendance.put(subject, new ArrayList<>());
        }

        ArrayList<String> students = attendance.get(subject);

        if (students.contains(student)) {
            System.out.println(student + " is already marked present in " + subject);
        } else {
            students.add(student);
            System.out.println("Attendance Marked: " + student + " -> " + subject);
        }
    }

    // Display Attendance
    public void displayAttendance() {

        System.out.println("\nAttendance Record:");

        for (String subject : attendance.keySet()) {
            ArrayList<String> students = attendance.get(subject);

            System.out.println("\nSubject: " + subject);

            for (String student : students) {
                System.out.println(student);
            }

            System.out.println("Total Students Present: " + students.size());
        }
    }

    public static void main(String[] args) {

        SmartClassroomAttendanceTracker tracker =
                new SmartClassroomAttendanceTracker();

        tracker.markAttendance("Java", "Amit");
        tracker.markAttendance("Java", "Rahul");
        tracker.markAttendance("Python", "Priya");
        tracker.markAttendance("Python", "Amit");

        // Duplicate Attendance
        tracker.markAttendance("Java", "Amit");

        tracker.displayAttendance();
    }
}