//Create a class called Shape with attributes color and filled. Create a subclass called Rectangle that inherits from Shape and adds attributes width and height. Create a method in Rectangle called get_area() that returns the area of the rectangle.

class Shape{
  String color;
  String filled;
}
class Rectangle extends Shape{
  float width;
  float height;
  
  float getArea(){
    float area=width*height;
    return area;
  }
}

 class Shapemain{
  public static void main(String args[]){
    Rectangle rec=new Rectangle();
    rec.color="blue";
    rec.filled="yes";

    float area=rec.getArea();

    System.out.println("Area is"+area);

    
  }
}

