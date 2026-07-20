import java.util.PriorityQueue;

class Patient {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class EmergencyRoom {

    PriorityQueue<Patient> triageQueue =
            new PriorityQueue<>((a, b) -> b.severity - a.severity);

    void addPatient(Patient p) {
        triageQueue.offer(p);
    }

    Patient treatNext() {
        return triageQueue.poll();
    }

    public static void main(String[] args) {

        EmergencyRoom er = new EmergencyRoom();

        er.addPatient(new Patient("Amit", 4));
        er.addPatient(new Patient("Rahul", 9));
        er.addPatient(new Patient("Priya", 6));
        er.addPatient(new Patient("Neha", 10));

        while (!er.triageQueue.isEmpty()) {
            Patient p = er.treatNext();
            System.out.println(p.name + " -> Severity: " + p.severity);
        }
    }
}