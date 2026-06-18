package scenario;

public class PasswordChecker {

    static void checkPassword(String password) {

        try {

            if (password == null) {
                throw new NullPointerException();
            }

            if (password.length() == 0) {
                throw new Exception("Password cannot be empty");
            }

            if (password.length() < 8) {
                throw new Exception(
                        "Password must be at least 8 characters long");
            }

            if (!Character.isUpperCase(password.charAt(0))) {
                throw new Exception(
                        "First character must be uppercase");
            }

            if (!Character.isDigit(
                    password.charAt(password.length() - 1))) {

                throw new Exception(
                        "Last character must be a digit");
            }

            boolean special = false;

            for (char ch : password.toCharArray()) {

                if ("@#$%&*".indexOf(ch) != -1) {
                    special = true;
                    break;
                }
            }

            if (!special) {
                throw new Exception(
                        "Password must contain a special character");
            }

            System.out.println("Strong Password");

        }

        catch (NullPointerException e) {

            System.out.println("Password cannot be null");
        }

        catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        checkPassword(null);

        checkPassword("");

        checkPassword("Abc");

        checkPassword("abcdef@1");

        checkPassword("Abcdefgh");

        checkPassword("Abcdefg@");

        checkPassword("Abcdefg@1");
    }
}
