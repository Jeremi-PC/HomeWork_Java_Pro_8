package hierarchy;

public class Student <T> {
    private String firstName;
    private String lastName;
    private T subject;

    public T getSubject() {
        return subject;
    }

    public Student(String firstName, String lastName, T subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }
}
