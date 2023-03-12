import java.util.Scanner;
class Book{
  String title;
  Sting authorName;
  int year;
  Book(String t,Sting a,int y){
    title=t;
    authorName=a;
    year=y;
  }
  void display(){
    System.out.println(title+" "+authorName+" "+year);
  }
}
public class BookDemo{
  public static void main(String args[]){
   System.out.ptintln("enter Book details");
    Scanner sc=new Scanner(System.in);
    Book b[]=new Book[5];

    for (int i=0;i<5;i++){
      System.out.println("enter book"+(i+1)+"details");
      System.out.println("enter title");
      String title=sc.next();
      System.out.println("enter authorName");
      String authorName=sc.next();
      System.out.println("enter year");
      int year=sc.nextInt();
      b[i]=new Book(title,authorName,year);
    }
    
  }
}