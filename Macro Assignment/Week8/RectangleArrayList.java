//Create a class called "Rectangle" with attributes "length" and "width". Create an ArrayList of Rectangle objects and add 4 rectangles to it. Print the length and width of each rectangle. Calculate and print the area of each rectangle.

import java.util.*;
class Rectangle{
  double length,width;

  Rectangle(double length,double width){
    this.length=length;
    this.width=width;
  }
  double calculateArea(){
    return length*width;
  }
}
class RectangleArrayList{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    ArrayList<Rectangle> rec=new ArrayList<Rectangle>();
    System.out.println("enter 4 rectangle details");
    for(int i=0;i<4;i++){
     rec.add(new Rectangle(sc.nextDouble(),sc.nextDouble())); 
    }
    for(Rectangle rectangle:rec){
      System.out.println("Area is"+rectangle.calculateArea());
    }
  }
}