class Product{
  int pid;
  float price;
  Product(int pid,float price){
    this.pid=pid;
    this.price=price;
  }
  double calculateDiscount(){
    return 0.0;
    
  }
}

class Electronics extends Product{
  double purchaseAmount;
  Electronics(int pid,float price,double purchaseAmount){
    super(pid,price);

    this.purchaseAmount=purchaseAmount;
  }
  double calculateDiscount(){
    if(purchaseAmount>15000){
      return purchaseAmount*0.5;
    }
    else{
      return purchaseAmount*0.1;
    }
  }
}
class Apparels extends Product{
  String season;
  Apparels(int pid,float price,String season){
    super(pid,price);
    this.season=season;
  }
  double calculateDiscount(){
    if(season.equals("winter")){
      return price*0.5;
    }
    else{
      return price*0.1;
    }
  }
}

class ProductDemo{
  public static void main(String args[]){
  Apparels app=new Apparels(10,500,"winter");
    double result=app.calculateDiscount();
    System.out.println(result);
  }
}