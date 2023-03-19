class Student
{
  public void read()
  {
    System.out.println("the name of pen is pilot");
      }
  public void read(String name)
  {
    System.out.println("the name of pen is:"+name);
  }
  public void read(int price)
  {
    System.out.println("the price of pen is:"+price);
  }
}

class StudentMain{
  public static void main(String args[]){
    Student st=new Student();
    st.read();
    st.read("pilot");
    st.read(50);
  }
}
      
  
