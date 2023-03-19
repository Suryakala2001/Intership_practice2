class Person{
  protected String name;
  public int age;
}
class Student extends Person{
  void display(){
    System.out.println(name);
  }
}

class AccessSpcifierMain{
  public static void main(String args[]){
    Student s=new Student();
    s.name="surya";
    s.display();
  }
}