import java.util.HashSet;

public class EventEntryVerificationSystem {

    HashSet<String> participants = new HashSet<>();

    // Register Participant
    public void registerParticipant(String email) {
        if (participants.add(email)) {
            System.out.println("Registration Successful: " + email);
        } else {
            System.out.println("Duplicate Registration! " + email);
        }
    }

    // Display Participants
    public void displayParticipants() {
        System.out.println("\nRegistered Participants:");

        if (participants.isEmpty()) {
            System.out.println("No Participants Registered.");
        } else {
            for (String email : participants) {
                System.out.println(email);
            }
        }

        System.out.println("Total Attendees: " + participants.size());
    }

    public static void main(String[] args) {

        EventEntryVerificationSystem event = new EventEntryVerificationSystem();

        event.registerParticipant("amit@gmail.com");
        event.registerParticipant("rahul@gmail.com");
        event.registerParticipant("priya@gmail.com");

        // Duplicate Registration
        event.registerParticipant("amit@gmail.com");

        event.displayParticipants();
    }
}
