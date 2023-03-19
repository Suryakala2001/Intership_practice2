class Teacher extends Person1 {
    private String teacherID;

    public Teacher(String firstName, String lastName, String teacherID) {
        super(firstName, lastName);
        this.teacherID = teacherID;
    }

    public String getID() {
        return teacherID;
    }
}


public class Personmain {
    public static void main(String[] args) {
        Person1 student = new Student1("Shreya", "Hitha", "1234gb6");
        System.out.println("Student full name: " + student.getFullName());
        System.out.println("Student ID: " + student.getID());
        Person1 teacher = new Teacher("Murali", "A", "987ib65");
        System.out.println("Teacher full name: " + teacher.getFullName());
        System.out.println("Teacher ID: " + teacher.getID());
    }
}