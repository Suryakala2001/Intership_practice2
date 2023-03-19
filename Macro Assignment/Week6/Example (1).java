//Create a class called Person with attributes name and age. Create a subclass called Employee that inherits from Person and adds attributes salary and position. Create two subclasses, Manager and Engineer, that both inherit from Employee. Add an attribute num_reports to Manager and an attribute specialization to Engineer. Create a method in Manager called hire_employee() that increments the num_reports attribute. Create a method in Engineer called solve_problem() that prints out "Problem solved!".

import java.util.*;

class Person {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

class Employee extends Person {
  double salary;
  String position;

  Employee(String name, int age, double salary, String position) {
    super(name, age);
    this.salary = salary;
    this.position = position;
  }
}

class Manager extends Employee {
  protected int num_reports;

  Manager(String name, int age, double salary, String position, int num_reports) {
    super(name, age, salary, position);
    this.num_reports = num_reports;
  }

  public void hire_employee() {
    num_reports++;
  }
}

class Engineer extends Employee {
  protected String specialization;

  Engineer(String name, int age, double salary, String position, String specialization) {
    super(name, age, salary, position);
    this.specialization = specialization;
  }

  public void solve_problem() {
    System.out.println("Problem solved!");
  }
}

public class HybridInheritence {
  public static void main(String[] args) {
    Manager manager = new Manager("Surya", 26, 90000.0, "Manager", 50);
    Engineer engineer = new Engineer("bhoomi", 35, 70000.0, "Engineer", "Software Development");

    manager.hire_employee();
    engineer.solve_problem();
  }
}