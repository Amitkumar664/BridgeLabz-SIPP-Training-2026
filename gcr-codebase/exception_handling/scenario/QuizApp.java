package scenario;

public class QuizApp {

    public static void main(String[] args) {

        String answers[] = {"A", "B", null, "D"};

        for (int i = 0; i < 6; i++) {

            try {

                if (answers[i].equals("A")) {
                    System.out.println("Answer " + i + " is Correct");
                } else {
                    System.out.println("Answer " + i + " is Incorrect");
                }

            }

            catch (ArrayIndexOutOfBoundsException e) {

                System.out.println(
                        "Invalid index: " + i);
            }

            catch (NullPointerException e) {

                System.out.println(
                        "Answer at index " + i + " is null");
            }
        }

        System.out.println("Checking completed.");
    }
}