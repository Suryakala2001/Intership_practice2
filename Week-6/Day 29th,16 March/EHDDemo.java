// ArrayIndexoutofBoundException
class EHDDemo{
  public static void main(String args[]){
    System.out.println("Surya");
    int a[]={1,2,3,4,5};
    try{
      System.out.println(a[10]);
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println(e);
    }
    for(int i=0;i<4;i++){
      System.out.println(a[i]);
    }
  }
}