import java.util.Scanner;
class  ExampleAge{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    boolean valid=true;
    do{
      System.out.println("Enter the age");
      int age=sc.nextInt();
      if(age>0){
        System.out.println("valid age");
        valid =false;
        
      }
      else{
        System.out.println("Invalid age and agin enter");
      }
    }while(valid);
    
  }
}