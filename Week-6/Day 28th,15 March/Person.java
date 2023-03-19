abstract class Person1 {
    private String firstName;
    private String lastName;

    public Person1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
    public abstract String getID();
}


class Student1 extends Person1 {
    private String studentID;

    public Student1(String firstName, String lastName, String studentID) {
        super(firstName, lastName);
        this.studentID = studentID;
    }

    public String getID() {
        return studentID;
    }
}