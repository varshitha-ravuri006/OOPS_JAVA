package exceptionsdemo;
public class BookLimitExceededException extends Exception {
    public BookLimitExceededException(String msg) { super(msg); }
}
