package pro1;
import java.util.Scanner;
public class program4 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		for(int i=0; i<number+1; i++) {
			System.out.println(i);
		}
	}
	
}
