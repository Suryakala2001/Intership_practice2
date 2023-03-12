import java.util.Scanner;
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
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  Student st[]=new Student[5];
  for(int i=0;i<5;i++){
  st[i]=new Student();
  System.out.println("enter id");
  st[i].id=sc.nextInt();
  System.out.println("enter name");
  st[i].name=sc.next();
  System.out.println("enter branch");
  st[i].branch=sc.next();
  System.out.println("enter sub1");
  st[i].sub1=sc.nextDouble();
  System.out.println("enter sub2");
  st[i].sub2=sc.nextDouble();
  System.out.println("enter sub3");
  st[i].sub3=sc.nextDouble();
  System.out.println("enter sub4");
  st[i].sub4=sc.nextDouble();
  st[i].average();
   st[i].percentage(); 
  
  }
  }
}