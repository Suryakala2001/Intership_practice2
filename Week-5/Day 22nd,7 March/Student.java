class Student{
  int id;
  String name;
  String branch;
  double sub1,sub2,sub3,sub4;
  void average(){
    double avg=(sub1+sub2+sub3+sub4)/4;
    System.out.println(name+"average is"+avg);
  }
  void percentage(){
    double totalmarks=sub1+sub2+sub3+sub4;
    double per=(totalmarks/400)*100;
    System.out.println(name+"percentage is"+per);
  }
}
class StudentMain{
  public static void main(String args[]){
   Student st1=new Student();
    st1.id=1001;
    st1.name="Siri";
    st1.branch="CSE";
    st1.sub1=50;
    st1.sub2=65;
    st1.sub3=45;
    st1.sub4=78;
    st1.average();
    st1.percentage();
    Student st2=new Student();
    st1.id=1002;
    st1.name="Shreya";
    st1.branch="CSE";
    st1.sub1=70;
    st1.sub2=68;
    st1.sub3=75;
    st1.sub4=58;
    st1.average();
    st1.percentage();
  }
} 