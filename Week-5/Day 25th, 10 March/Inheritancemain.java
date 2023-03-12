class Animal{
  String name;
  String color;
  int taillength;
  int no_of_legs;
  void eat(){
    System.out.println("eating...");
  }
}

class Cat extends Animal{
  String bread;
  int type_of_price;
  void scratch(){
    System.out.println("scratching..");
  }
  void display(){
    System.out.println(name+" "+color+" "+taillength+" "+no_of_legs+" "+bread+" "+type_of_price);
  }
}

public class Inheritancemain{
  public static void main(String args[]){
    Cat cat=new Cat();
    cat.name="Angle";
    cat.color="brown";
    cat.taillength=3;
    cat.no_of_legs=4;
    cat.bread="Persian cat";
    cat.type_of_price=20000;
    cat.display();
    cat.eat();
    cat.scratch();
  }
}