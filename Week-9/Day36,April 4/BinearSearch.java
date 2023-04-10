import java.util.Scanner;
class BinarySearch{
  int a[],first,last,key;
  int mid=(first+last)/2;
  While(first<=last){
  if(a[mid]<key){
  first=mid+1;
  }else if(a[mid]==key){
  System.out.println("Element is found"+mid);
  }else{
  last=mid-1;
  System.out.println("Element is not found");
  }
}
    

public static void main(String args[]){
  int a[]={10,20,30,40,50};
  int key=30;
  int last=a.length-1;
  binarySearch(a,0,last,key);
}
}