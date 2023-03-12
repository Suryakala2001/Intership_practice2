class Car{
  String make;
  String model;
  int year;
  String color;
  Car(String m,String mo,int y,String c){
   make=m;
    model=mo;
    year=y;
    color=c;
  
  }
  void display(){
    System.out.println(make+" "+model+" "+year+" "+color);
  }
}
class Carmain{
  public static void main(String args[]){
    Car car1=new Car("BMW","BMW X5",2017,"Red");
    car1.display();
  }
}