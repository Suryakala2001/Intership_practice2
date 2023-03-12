//Create a class called BankAccount with attributes balance and interest_rate. Create two subclasses, CheckingAccount and SavingsAccount, that both inherit from BankAccount. Add an attribute transaction_fee to CheckingAccount and an attribute min_balance to SavingsAccount. Create a method in CheckingAccount called withdraw() that subtracts an amount from the balance and also subtracts the transaction fee. Create a method in SavingsAccount called add_interest() that adds interest to the balance.
import java.util.Scanner;
class BankAccount{
  double balance;
  double interest_rate;
  
}

class CheckingAccount extends BankAccount
{
  Scanner sc=new Scanner(System.in);
  double transcatoin_fee;

  void withdraw(){
    System.out.println("enter amount");
    int amount=sc.nextInt();
    balance=balance-amount-transcatoin_fee;
    System.out.println("balance is:"+balance);
  }
  
}

class SavingsAccount extends BankAccount{
  double minBalance;
  void add_interest(){
    double interest=balance*interest_rate/100;
    balance=balance+interest;
    System.out.println("adding interest balance is:"+balance);
  }
}

class BankDetailsmain{
  public static void main(String args[]){
    CheckingAccount ch=new CheckingAccount();
    ch.withdraw();
    SavingsAccount sa=new SavingsAccount();
    sa.add_interest();
  }
}