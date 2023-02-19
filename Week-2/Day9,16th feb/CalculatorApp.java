//Calculator App : create an application that takes a two values along with operator and find the value based on operator./
 import java.util.Scanner;
 class CalculatorApp{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
    double num1,num2,result=0;
    num1=sc.nextDouble();
    num2=sc.nextDouble();
    
    System.out.println("Choose an operator:+,-,*,/");
    String operator;
    operator = sc.next();
    if(operator == "+"){
      result=num1+num2;
    }else if(operator == "-"){
      result=num1-num2;
    }else if(operator == "*"){
      result=num1*num2;
    }else if(operator == "/"){
      result=num1/num2;
    }else{
      System.out.println("invalid");
    }
    System.out.println(result);
   
    
    
  }
}