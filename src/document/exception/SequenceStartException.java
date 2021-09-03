package document.exception;

public class SequenceStartException extends Exception{
    private String docNumber;

    public String getDocNumber() {
        return docNumber;
    }
    public SequenceStartException(String message, String docNumber) {
        super(message);
        this.docNumber = docNumber;
    }
}
