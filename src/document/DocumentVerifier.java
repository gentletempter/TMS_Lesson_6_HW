package document;

import exception.SequenceContainsException;
import exception.SequenceEndException;
import exception.SequenceStartException;

/**
 * This class is used to work with documents
 */
public class DocumentVerifier {

    /**
     * This method solves to check document number for contains "abc" sequence
     *
     * @throws SequenceContainsException
     */
    public static void checkSequenceContains(String documentNumber) throws SequenceContainsException {
        if (documentNumber.toLowerCase().contains("abc")) {
            System.out.println("[OK] document.Document number contains \"abc\"");
        } else {
            throw new SequenceContainsException("[FAULT] document.Document number does not contain \"abc\"", documentNumber);
        }
    }

    /**
     * This method solves to check document number for starts with "555" sequence
     *
     * @throws SequenceStartException
     */
    public static void checkSequenceStart(String documentNumber) throws SequenceStartException {
        if (documentNumber.startsWith("555")) {
            System.out.println("[OK] document.Document number starts with \"555\"");
        } else {
            throw new SequenceStartException("[FAULT] document.Document number does not start with \"555\"", documentNumber);
        }
    }

    /**
     * This method solves to check document number for ends "1a2b" sequence
     *
     * @throws SequenceEndException
     */
    public static void checkSequenceEnd(String documentNumber) throws SequenceEndException {
        if (documentNumber.endsWith("1a2b")) {
            System.out.println("[OK] document.Document number ends with \"1a2b\"");
        } else {
            throw new SequenceEndException("[FAULT] document.Document number does not end with \"1a2b\"", documentNumber);
        }
    }

    /**
     * This method solves to full check document number
     */
    public static void documentNumberVerification(String documentNumber) {
        System.out.println("Checking document number.........");
        try {
            DocumentVerifier.checkSequenceContains(documentNumber);
            DocumentVerifier.checkSequenceStart(documentNumber);
            DocumentVerifier.checkSequenceEnd(documentNumber);
        } catch (SequenceContainsException ex1) {
            System.out.printf("%s: [%s]\n", ex1.getMessage(), ex1.getDocNumber());
        } catch (SequenceStartException ex2) {
            System.out.printf("%s: [%s]\n", ex2.getMessage(), ex2.getDocNumber());
        } catch (SequenceEndException ex3) {
            System.out.printf("%s: [%s]\n", ex3.getMessage(), ex3.getDocNumber());
        }
    }
}