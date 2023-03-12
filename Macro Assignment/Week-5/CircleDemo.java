class Circle{
  int radius;
  int diameter;

  Circle(int radius){
    this.radius=radius;
    this.diameter=2*radius;
  }
  void display(){
    System.out.println("Radius"+radius);
    System.out.println("Diameter"+diameter);
    
  }
  voia area(){
    System.out.println("Area of circle"+(3.14*radius*radius));
  }
}
public class CircleUsingCons{
  public static void  main(String[] args){
    Circle c=new Circle(4);
    c.display();
    c.area();
  }
}