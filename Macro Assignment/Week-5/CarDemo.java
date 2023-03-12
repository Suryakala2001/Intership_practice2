 import java.util.Scanner;
 class Car{
   String make;
   String model;
   int year;
   Car(String m,String mo,int y){
     make=m;
     model=mo;
     year=y;
   }
   void  display(){
     System.out.println(make+" "+model+" "+year);
   }
 }
   public class CarDemo{
     public static void main(String args[]){
       System.out.println("enter car details");
       Scanner sc=new Scanner(System.in);
       Car c[]=new Car[2];

       for(int i=0;i<2;i++){
         System.out.println("enter car"+(i+1)+"details");
         System.out.println("enter make");
         String make=sc.next();
         System.out.println("enter model");
         String model=sc.next();
         System.out.println("enter year");
         int year=sc.nextInt();
         c[i]=new Car(make,model,year);
       }

       
       }
     }
   
 