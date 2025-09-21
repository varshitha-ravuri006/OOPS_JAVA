package exceptionsdemo;
class LibraryAccount {
    private int borrowed = 0;
    public void borrow(int n) throws BookLimitExceededException {
        if (borrowed + n > 3) throw new BookLimitExceededException("Cannot borrow more than 3 books");
        borrowed += n;
        System.out.println("Borrowed " + n + " book(s). Total now: " + borrowed);
    }
}
public class LibraryBookIssueDemo {
    public static void main(String[] args) {
        LibraryAccount acc = new LibraryAccount();
        try {
            acc.borrow(2);
            acc.borrow(2); // triggers
        } catch (BookLimitExceededException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
