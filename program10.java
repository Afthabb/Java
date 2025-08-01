package pro1;
import java.util.Scanner;
class Student{
	String name;
	int age;
	void displayDetails() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}
public class program10 {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.name="Rohan";
		student1.age=19;
		student1.displayDetails();
	}

}
