package exception;

public class SequenceEndException extends Exception{
    private String docNumber;

    public String getDocNumber() {
        return docNumber;
    }

    public SequenceEndException(String message, String docNumber) {
        super(message);
        this.docNumber = docNumber;
    }
}

