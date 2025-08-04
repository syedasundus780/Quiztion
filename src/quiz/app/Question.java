package quiz.app;

public class Question implements Comparable<Question> {
    String question;
    String[] options;
    String correctAnswer;
    int priority; // Lower value means higher priority

    public Question(String question, String[] options, String correctAnswer, int priority) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
        this.priority = priority;
    }

    @Override
    public int compareTo(Question other) {
        return Integer.compare(this.priority, other.priority); // Compare based on priority
    }
}
