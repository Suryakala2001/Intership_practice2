class TwodimensionalArray{
  public static void main(String args[]){
    int a[][]={{10,20},{30,40},{50,60}};
    System.out.println("enter two dimensional element");
    for(int i=0;i<3;i++){
      for(int j=0;j<2;j++){
        System.out.println(a[i][j]);
      }
    }
  }
}