//Create a class called "Car" with attributes like "make", "model", "year", and "color". Include a method that prints out the car's attributes.
class Car{
  String make;
  String model;
  int year;
  String color;

  Car(){
    make="BMW";
    model="BMW X5";
    year=2017;
    color="red";
  }
  void display(){
    System.out.println(make+" "+model+" "+year+" "+color);
  }
}
class Carmain{
  public static void main(String args[]){
    Car car1=new Car();
    car1.display();
  }
}