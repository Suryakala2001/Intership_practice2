class ERDemo{
  public static void main(String args[]){
    System.out.println("Surya");
    String str="bhoomi@13";
    try{
      int num=Integer.parseInt(str);
  }
    catch(NumberFormatException e){
      System.out.println(e);
    }
    System.out.println(str.length());
}
}