interface Employee 
{
  public void calculateSalary();
  public void displayEmployeeDetails();
}
class Manager implements Employee {
  private String name;
  private int age;
  private String designation;
  private double salary;
  
  public Manager(String name, int age, double salary)
  {
    this.name = name;
    this.age = age;
    this.designation = "Manager";
    this.salary = salary;
  }
  public void calculateSalary()
  {
    this.salary = this.salary + (this.salary * 0.2); 
  }
  public void displayEmployeeDetails() 
  {
    System.out.println("Name: " + this.name);
    System.out.println("Age: " + this.age);
    System.out.println("Designation: " + this.designation);
    System.out.println("Salary: " + this.salary);
  }
}