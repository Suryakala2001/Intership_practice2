import java.util.Scanner;
class PrintWeekDay{
  public static void main(String args[]){
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number 1-6");
    num=sc.nextInt();
    switch(num){
      case 1:
        System.out.println("sunday");
        break;
      case 2:
        System.out.println("monday");
        break;
      case 3:
        System.out.println("tuesday");
        break;
      case 4:
        System.out.println("wednesday");
        break;
      case 5:
        System.out.println("thursday");
        break;
      case 6:
        System.out.println("friday");
        break;
      default:
        System.out.println("not valid");
    }
  }
}