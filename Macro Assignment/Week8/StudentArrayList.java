import java.util.*;
class Student{
  String name,branch;
  int rollno,age;

  Student(String name,String branch,int rollno,int age){
    this.name=name;
    this.branch=branch;
    this.rollno=rollno;
    this.age=age;
  }
}

class StudentArrayList{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    ArrayList<Student> st=new ArrayList<Student>();

    for(int i=0;i<4;i++){
      st.add(new Student(sc.next(),sc.next(),sc.nextInt(),sc.nextInt()));
    }
    
  }
}