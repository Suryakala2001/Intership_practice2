interface Methods{
  void method1();
  void method2();
  
}
interface inf1{
  public void method1();
}
interface inf2 extends inf1{
  public void method2();
}
class Methods implements inf2{
  public void method1(){
    System.out.println("Suryakala");
  }
  public void method2(){
    System.out.println("Bhoomika");
  }
}
