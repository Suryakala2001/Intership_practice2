class InsertionSort{
  public static void main(String args[]){
    int a[]={64,25,12,90,11};
    int i,j,temp;
    int n=a.length;
    
    for( i=1;i<n-1;i++){
    for( j=i;j>0 && a[j-1]>a[j];j--){
      temp=a[j];
      a[j]=a[j-1];
      a[j-1]=temp;
    }
  }
  
  System.out.println(a[i]+"");
 
}
}