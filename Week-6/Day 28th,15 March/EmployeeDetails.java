class Developer implements Employee
  {
    private String name;
    private int age;
    private String designation;
    private double salary;
    
    public Developer(String name, int age, double salary) {
      this.name = name;
      this.age = age;
      this.designation = "Developer";
      this.salary = salary;
    }
    
   public void calculateSalary() {
     this.salary = this.salary + (this.salary * 0.1); 
    }
    
   
    public void displayEmployeeDetails() {
      System.out.println("Name: " + this.name);
      System.out.println("Age: " + this.age);
      System.out.println("Designation: " + this.designation);
      System.out.println("Salary: " + this.salary);
    }
}
