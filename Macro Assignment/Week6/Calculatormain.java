//Create a class named "Calculator" with three methods named "add" with first method takes two parameters of int type. Second add method takes 2 paramters of double type and third add method takes 3 parameters of first two parameters of int and third parameters of long and perform addition operation in each method.

class Calculator
{
  public void add(int a,int b)
  {
  int result=a+b;  
  System.out.println("the result is"+result);
}
public void add(double c,double d)
  {
    double result=c+d;
  System.out.println("the result is"+result);
}
public void add(int a,int b,long f)  
  {
    long result=a+b+f;
    System.out.println("the result is"+result);
  }
}
class Calculatormain
  {
    public static void main(String args[])
    {
      Calculator c=new Calculator();
      c.add(1,2);
      c.add(4,5);
      c.add(1,2,3);
    }
  }