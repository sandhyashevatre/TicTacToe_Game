

public class InvalidMoveException extends Exception {
	
    private int lineNumber;

    public InvalidMoveException(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public int getLineNumber() {
        return lineNumber;
    }
}
