package pro1;
import java.util.Scanner;
public class program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = scanner.nextInt();
        if(score<0 || score>100) {
        	System.out.println("Invalid score! Please enter a value between 0 and 100.");
        }
        else {
        	if(score>=90) {
        		System.out.println("Your grade is: A");
        	}
        	else if(score>=75) {
        		System.out.println("Your grade is: B");
        	}
        	else if(score>=60) {
        		System.out.println("Your grade is: C");
        	}
        	else if(score>=40) {
        		System.out.println("Your grade is: D");
        	}
        	else {
        		System.out.println("Your grade is: Fail");
        	}
        }
    }
}