class Student{
  int rollno;
  String name;
  String branch;
  Student(int r,String n,String b){
    rollno=r;
    name=n;
    branch=b;
  }
  void display(){
    System.out.println(rollno+" "+name+" "+branch);
    
  }
}
class Studentmain{
  public static void main(String args[]){
    Student st=new Student(2001,"Suryakala","cse");
    st.display();
  }
}