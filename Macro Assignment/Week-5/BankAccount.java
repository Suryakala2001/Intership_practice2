import java.util.Scanner;
 class BankAccount{
   Scanner sc=new Scanner(System.in);
   long accountNo;
   double balance;
   BankAccount(long aNo,double bal){
     accountNo=aNo;
     balance=bal;
   }
   void withdraw(){
     System.out.println("Enter amount to withdraw");
     balance =balance-sc.nextDouble();
     displayBalance();
   }
   void deposite(){
     System.out.println("Enter amount to deposite");
     balance=balance+sc.nextDouble();
     displayBalance();
   }
   
  
 }

public class BankAccounts{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter account number");
    long  aNo=sc.nextLong();
    System.out.println("Enter balance");
    double bal=sc.nextLong();

    BankAccount ba=new BankAccount(aNo,balance);
    ba.withdraw();
    ba.deposite();
  }
}