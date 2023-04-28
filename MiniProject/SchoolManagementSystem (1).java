//Your program should have the following classes:
//Teacher: This class should have private fields for the teacher's name and subject, as well as getters and setters for these fields.
//Student: This class should have private fields for the student's name and grade level, as well as getters and setters for these fields.
//School: This class should have private fields for the list of Teachers and the list of Students, as well as methods to add and remove Teachers and Students from the lists, and methods to print the lists of Teachers and Students. Additionally, this class should have methods to find a Teacher or Student by name and to remove a Teacher or Student from the School.
//Your program should have a main method that allows users to interact with the School object and perform the actions listed above. The program should continue running until the user chooses to exit.
//I hope this gives you a good starting point for your assignment!


import java.util.ArrayList;
import java.util.Scanner;
public class Teacher{
  private String name;
  private String subject;
public Teacher(String name,String subject){
  this.name=name;
  this.subject=subject;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
}
public class Student{
  private String name;
  private int gradeLevel;
  public Student(String name,int gradeLevel){
    this.name=name;
    this.gradeLevel=gradeLevel;
    
  }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getGradeLevel() {
	return gradeLevel;
}
public void setGradeLevel(int gradeLevel) {
	this.gradeLevel = gradeLevel;
}
}
public class School{
private ArrayList<Teacher> teachers;
private ArrayList<Student> students;
  public School() {
  teachers = new ArrayList<>();
  students = new ArrayList<>();
    }
  public void addTeacher(Teacher teacher){
    teachers.add(teacher);
    
  }

  public void removeTeacher(Teacher teacher){
    teachers.remove(teacher);
  }
    public void addStudent(Student student){
    students.add(student);
    
  }

  public void removeStudent(Student student){
    students.remove(student);
  }
public List<Teacher> getTeachers() {
	return teachers;
}


public List<Student> getStudents() {
	return students;
}
public void printTeachers(){
  for(Teacher teacher:teachers){
    System.out.println(teacher.getName()+"teaches"+teacher.getSubject());
  }
}
  public void printStudents() {
    for (Student student : students) {
      System.out.println(student.getName() + " is in grade " + student.getGradeLevel());
        }
    }
  public Teacher findTeacherByName(String name){
    for(Teacher teacher:teachers){
      if(teacher.getName().equals(name)){
        return teacher;
      }
    }
    return null;
  }
      public Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }
public void removeTeacherByName(String name){
          Teacher teacher = findTeacherByName(name);
        if (teacher != null) {
            teachers.remove(teacher);
        }
    }
    public void removeStudentByName(String name) {
        Student student = findStudentByName(name);
        if (student != null) {
            students.remove(student);
        }
    }
}
public class MiniProject2{
  public static void main(String args[]){
    School school=new School();
    Scanner sc=new Scanner(System.in);
    while(true){
  System.out.println("Welcome to the School management system!");
  System.out.println("Choose an option:");
  System.out.println("1. Add Teacher");
  System.out.println("2. Remove Teacher ");
   System.out.println("3. Add Student ");
  System.out.println("4. Remove Student ");
      System.out.println("5. Print Teachers ");
      System.out.println("6. Print Students ");
 System.out.println("7. Find Teacher ");
         System.out.println("8. Find Student ");
            System.out.println("9. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

                        switch (choice) {
                case 1:
                    System.out.println("Enter teacher name:");
                    String teacherName = scanner.nextLine();
                    System.out.println("Enter subject:");
                    String subject = scanner.nextLine();
                    Teacher teacher = new Teacher(teacherName, subject);
                    school.addTeacher(teacher);
                    System.out.println("Teacher added.");
                    break;
                case 2:
                    System.out.println("Enter teacher name:");
                    teacherName = scanner.nextLine();
                    teacher = school.findTeacherByName(teacherName);
                    if (teacher != null) {
                        school.removeTeacher(teacher);
                        System.out.println("Teacher removed.");
                    } else {
                        System.out.println("Teacher not found.");
                    }
                    break;
                case 3:
                    System.out.println("Enter student name:");
                    String studentName = scanner.nextLine();
                    System.out.println("Enter grade level:");
                    int gradeLevel = scanner.nextInt();
                    scanner.nextLine(); 
                    Student student = new Student(studentName, gradeLevel);
                    school.addStudent(student);
                    System.out.println("Student added.");
                    break;
                case 4:
                    System.out.println("Enter student name:");
                    studentName = scanner.nextLine();
                    student = school.findStudentByName(studentName);
                    if (student != null) {
                        school.removeStudent(student);
                        System.out.println("Student removed.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                    System.out.println("Enter teacher name:");
                    teacherName = scanner.nextLine();
                    teacher = school.findTeacherByName(teacherName);
                    if (teacher != null) {
                        System.out.println("Teacher found: " + teacher.getName() + " (" + teacher.getSubject() + ")");
                    } else {
                        System.out.println("Teacher not found.");
                    }
                    break;
                case 6:
                    System.out.println("Enter student name:");
                    studentName = scanner.nextLine();
                    student = school.findStudentByName(studentName);
                    if (student != null) {
                        System.out.println("Student found: " + student.getName() + " (Grade " + student.getGradeLevel() + ")");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 7:
                    school.printTeachers();
                    break;
                case 8:
                    school.printStudents();
                    break;
                case 9:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


//A School Management System is a software application designed to streamline and automate various administrative and academic tasks in educational institutions. The system provides a centralized platform for teachers, students, and administrators to access information and manage various tasks efficiently.

//The School Management System typically includes features such as attendance tracking, grade management, assignment submission, scheduling, communication tools, student information management, and financial management. It can also include modules for managing library resources, online exams, and hostel management.

//The system helps to improve communication between teachers, students, and parents, reducing paperwork, and increasing efficiency. It enables administrators to monitor the academic progress of students, manage staff, and generate reports. Additionally, it provides access to real-time data, facilitating decision-making and enhancing the overall learning experience.

//Overall, a School Management System is a valuable tool for educational institutions to automate and streamline various administrative and academic tasks, leading to improved efficiency, better communication, and enhanced learning outcomes.













  
}