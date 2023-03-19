class Bank{
  String name="siri";
  void balanceamount(){
    System.out.println(" balance amount is 2000rs");
  }
}

class Canara extends Bank{
  void balanceamount(){
    System.out.println("balance amount is 1000rs");
  }
}

class Union extends Bank{
  String name="surya";
  void print(){
    System.out.println(super.name);
    System.out.println(name);
  }
  void balanceAmount(){
    super.balanceamount();
    System.out.println("balance amount is 300rs");
  }
}

public class Overridingmain{
  public static void main(String args[]){
    Canara ca=new Canara();
    ca.balanceamount();
    ca.print();
  }
}