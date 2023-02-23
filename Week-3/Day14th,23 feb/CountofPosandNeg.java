import java.util.Scanner;
class CounterPosandNeg{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5],pcount=0,ncount=0,zcount=0;
    System.out.println("Enter tha array values");
    for(int i=0;i<5;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<5;i++){
      if(a[i]>0){
        pcount++;
      
      }
      else{
        ncount++;
      }
    }
    System.out.println("positive Count:"+pcount);
    System.out.println("Negative count;"+ncount);
    System.out.println("Zero count:"+zcount);
  }
}