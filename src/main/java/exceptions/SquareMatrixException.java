package exceptions;

public class SquareMatrixException extends RuntimeException {
    @Override
    public String getMessage() {
        return "The matrix is not square!";
    }
}
