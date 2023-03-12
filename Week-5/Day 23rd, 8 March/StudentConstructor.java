class Student{
  int rollno;
  String name;
  String branch;

  Student(){
    rollno=2001;
    name="Suryakala";
    branch="cse";
  }
  void display(){
    System.out.println(rollno+" "+name+" "+branch);
  }
}
class Studentmain{
  public static void main(String args[]){
    Student st=new Student();
    st. display();
  }
}