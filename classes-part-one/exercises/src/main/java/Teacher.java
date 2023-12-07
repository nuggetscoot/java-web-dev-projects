public class Teacher {
    // Fields
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    // Constructors
    public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    // Getters and Setters with access modifiers
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

    public void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }

    // Method with access modifier
    public void introduce() {
        System.out.println("Hello, I am " + firstName + " " + lastName + ".");
        System.out.println("I teach " + subject + " and have been teaching for " + yearsTeaching + " years.");
    }
}
