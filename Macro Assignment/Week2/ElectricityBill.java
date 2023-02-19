import java.util.Scanner;
class ElectricityBill{
  public static void main(String args[]){
    int unit;
    float amount,total_amount,charge_amount;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number");
    unit = sc.nextInt();
    if(unit<=50){
      amount=unit * 0.50f;
    }
    else if (unit <= 150){
      amount = 25 + ((unit - 50) * 0.75f);
    }
    else if (unit <= 250){
      amount = 100 + ((unit - 150)*1.20f);
    }
    else{
      amount=220 + ((unit - 250) * 1.50f);
    }
     charge_amount=amount * 0.20f;
    total_amount = amount + charge_amount;
    System.out.println("Electricity bill price=" + total_amount);
    }
  }
