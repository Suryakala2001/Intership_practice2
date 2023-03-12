//Create a class called BankAccount with attributes balance and interest_rate. Create a subclass called SavingsAccount that inherits from BankAccount and adds an attribute min_balance. Create a method in SavingsAccount called withdraw() that subtracts an amount from the balance, but only if the resulting balance is greater than or equal to the minimum balance.

import java.util.Scanner;
class BankAccount{
  double balance;
  float interestRate;
}

class SavingAccount extends BankAccount{
  Scanner sc=new Scanner(System.in);
  double minBalance; 

  void withdraw(){
    while(true){
      System.out.println("Enter the Amount");
      double amount=sc.nextDouble();
      double balance1=balance-amount;
      if(balance1>=minBalance){
        balance=balance-amount;
        System.out.println("balance is"+balance);
        break;
        }else{
          System.out.println("Amount must be grater than miminum balance");
        }
      }
    }
  }

   class BankAccountmain{
    public static void main(String args[]){
      SavingAccount sa=new SavingAccount();
      sa.withdraw();
    }
  }
  
