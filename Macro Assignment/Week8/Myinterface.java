interface myInterface{
  public void method1();
  public void method2();
}
class callInterface implements myInterface{
  public void method1(){
    System.out.println("implementation of suryakala");
  }
  public void method2(){
    System.out.println("implementation of Bhoomika");
  }

  public static void main(String args[]){
    myInterface MI=new callInterface();
    MI.method1();
    MI.method2();
  }
}