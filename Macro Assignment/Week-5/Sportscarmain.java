//Create a class called Vehicle with attributes make and model. Create a subclass called Car that inherits from Vehicle and adds an attribute num_doors. Create a subclass called SportsCar that inherits from Car and adds an attribute top_speed. Create a method in SportsCar called rev_engine() that prints out "Vroom!".

class Vehicle{
  String make,model;
}
class  Car extends Vehicle{
  int no_of_doors;
}
class SportsCar extends Car{
  double top_speed;
   void  rev_engine(){
     System.out.println("vroom");
   }
   
}

class SportsCarmain{
  public static void main(String args[]){
    SportsCar sp=new SportsCar();
    sp.make="xyz";
    sp.model="Super";
    sp.no_of_doors=3;
    sp.top_speed=280;
    sp.rev_engine();
  }
}