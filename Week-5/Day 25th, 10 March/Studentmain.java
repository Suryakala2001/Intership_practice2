class Person{
  String name;
  String gender;
  int age;
  void print(){
    System.out.print(name+" "+gender+" "+age);
  }
  void printAddress(){
    
    System.out.println(address);
  }
}

class Student extends Person{
  int id;
  double sub1,sub2,sub3;
  String branch;
  void avreage(){
    double avg=(sub1+sub2+sub3)/3;
    System.out.println("average is"+avg);
  }
  void percentage(){
    double totalmarks=sub1+sub2+sub3;
    double per=(totalmarks/300)*100;
    System.out.println("percentage is"+per);
  }
  
}

public class Studentmain{
  public static void main(String args[]){
    Student st1=new Student();
    st1.name="Siri";
    st1.gender="female";
    st1.age=21;
    st1.address="Shimoga";
    st1.id=2001;
    st1.sub1=45;
    st1.sub2=65;
    st1.sub3=78;
    st1.branch="cse";
    st1.print();
    st1.printAddress();
    
    st1.avreage();
    st1.percentage();
  }
}