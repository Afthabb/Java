package pro1;
import java.util.Scanner;
class Employee{
	String name;
	int id;
	double salary;
	public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
	 public void displayEmployee() {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Employee ID: " + id);
	        System.out.println("Employee Salary: " + salary);
	    }
}
public class program11 {
	public static void main(String[] args) {
		Employee emp1 = new Employee("D", 101, 50000);
		Employee emp2 = new Employee("A", 102, 60000);
		emp1.displayEmployee();
		emp2.displayEmployee();
	}

}
