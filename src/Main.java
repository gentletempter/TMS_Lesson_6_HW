import document.DocumentVerifier;
import registration.UserRegistration;

/**
 * Designed to test each of methods in packages.
 */
public class Main {
    public static void main(String[] args) {
        DocumentVerifier.documentNumberVerification("5524-abc-4321-xyz-1a2b");
        System.out.println(UserRegistration.register("John y", "qwerty2", "qwerty2"));
    }
}
