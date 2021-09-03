package document.exception;

public class SequenceContainsException extends Exception {
    private String docNumber;

    public String getDocNumber() {
        return docNumber;
    }

    public SequenceContainsException(String message, String docNumber) {
        super(message);
        this.docNumber = docNumber;
    }
}
