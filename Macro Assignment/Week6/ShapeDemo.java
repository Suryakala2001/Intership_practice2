//Write a program that demonstrates method overriding. Define a superclass called Shape with a method called getArea() that returns 0. Define two subclasses, Circle and Rectangle, that extend Shape and override the getArea() method to calculate and return the area of their respective shapes. In the main method, create instances of both Circle and Rectangle and call their getArea() methods.

class Shape{
  double  getArea(){
    
    return 0.0;
  }
}

class Circle extends Shape{
  double getArea(){
    int r=3;
    double area = 3.14f * r * r;
        System.out.println("Area is " + area);
         return area;
  }
}

class Rectangle extends Shape{
  double getArea(){
    int w=5,l=6;
  double area = w * l;
    System.out.println("Area is " + area);
    return area;
  }
}

public class ShapeDemo{
  public static void main(String args[]){
    Circle c=new Circle();
    c.getArea();
    Rectangle rec=new Rectangle();
    rec.getArea();
  }
}