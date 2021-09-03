package registration;

import registration.exception.WrongLoginException;
import registration.exception.WrongPasswordException;

/**
 * This class is used to verification user registration
 */
public class UserRegistration {
    public static boolean register(String login, String password, String confirmPassword) {
        try {
            validator(login, password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    /**
     * @param login           <i>must be less than 20 characters and must not contain spaces.</i>
     * @param password        <i>must be less than 20 characters long, must not contains spaces and must contain at least one digit.</i>
     * @param confirmPassword <i>must match the password</i>
     * @throws WrongLoginException    when login are invalid
     * @throws WrongPasswordException when password are invalid or mismatch the confirmPassword
     */
    private static void validator(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.contains(" ") || login.length() >= 20) {
            throw new WrongLoginException("Invalid login!");
        }
        if (passwordVerifier(password, confirmPassword) != null) {
            throw new WrongPasswordException(passwordVerifier(password, confirmPassword));
        }
    }

    /**
     * Used for get detail message
     */
    private static String passwordVerifier(String password, String confirmPassword) {
        if (password.contains(" ") || password.length() >= 20 || !password.matches(".*\\d+.*")) {
            return "Invalid password!";
        } else if (!password.equals(confirmPassword)) {
            return "Password mismatch!";
        } else {
            return null;
        }

    }
}
