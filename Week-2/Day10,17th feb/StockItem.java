import java.util.*;
class StockItem{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
    System.out.println("enter how much item you want?");
    int item = sc.nextInt();
    int itemStock = 5;
    int amountPerItem=750;
    int acBalance=3200;
    int totalAmount =item*amountPerItem;
    if(item>itemStock ){
    
      System.out.println("try again later");
    }
    else{
      System.out.println("please do payment = " + totalAmount);
    }
    if((totalAmount>acBalance)){
      System.out.println(" add more money to their account ");
    }
    else if(item>itemStock ){
      System.out.println("add itemStock ");
    }
    else{
     System.out.println("payement done. sit back and relax your item will be there with you soon");
    }
  }




