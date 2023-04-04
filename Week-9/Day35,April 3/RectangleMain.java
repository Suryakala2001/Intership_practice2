//Write a Java class called Rectangle that has fields for the rectangle's width and height. Write a custom Comparator implementation called AreaComparator that sorts Rectangle objects in ascending order based on their area (i.e., width x height). Then, modify the Rectangle class to implement the Comparable interface, so that Rectangle objects are sorted in ascending order based on their perimeter (i.e., 2 x width + 2 x height). Test your implementation by creating a list of Rectangle objects and sorting them using both the AreaComparator and the Comparable implementation.

import java.util.ArrayList;
import java.util.*;

class Rectangle implements Comparable<Rectangle>{
  int width;
  int height;

  public Rectangle(int width,int heigth){
   this.width=width;
   this.height=height; 
  }

  public int getArea(){
    return width*height;
  }
  public int getPerimeter(){
    return 2*width+2*hight;
  }
  class AreaComparator implements comparator<Rectangle>{
    public int compare(Rectangle r1,Rectangle r2){
      if(r1.getArea()<r2.getArea()){
        return -1;
      }
      else if(r1.getArea()>r2.getArea()){
        return 1;
      }
      else{
        return 0;
      }
    }
  }
  }



class RectangleMain{
  public static void main(String args[]){
    ArrayList<Rectangle> rectangle=new ArrayList<Rectangle>();
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<4;i++){
      rectangle.add(new Rectangle(sc.nextInt(),sc.nextInt()));
      
    }
    Collection.sort(rectangle,new AreaComparator());
    System.out.println("area");
    for(Rectangle r:rectangle){
      System.out.println(r.getArea());
    }
    Collection.sort(rectangle);
    System.out.println("area");
    for(Rectangle r:rectangle){
      System.out.println(r.getPerimeter());
    }
    
  }
}

  