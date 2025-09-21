package exceptionsdemo;
import java.time.*;
class OnlineExam {
    private LocalDateTime endTime;
    public OnlineExam(LocalDateTime endTime) { this.endTime = endTime; }
    public void submit(LocalDateTime submitTime) throws LateSubmissionException {
        if (submitTime.isAfter(endTime)) throw new LateSubmissionException("Submission after end time");
        System.out.println("Submission accepted at " + submitTime);
    }
}
public class OnlineExamDemo {
    public static void main(String[] args) {
        OnlineExam exam = new OnlineExam(LocalDateTime.now().minusMinutes(1));
        try {
            exam.submit(LocalDateTime.now()); // triggers
        } catch (LateSubmissionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
