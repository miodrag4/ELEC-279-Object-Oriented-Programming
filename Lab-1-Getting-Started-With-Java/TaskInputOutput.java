package Package3;
import java.util.Scanner;

public class TaskInputOutput {
	public int a,b;
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		TaskInputOutput obj = new TaskInputOutput();
		
		System.out.println("Enter first integer:");
		
		obj.a = input.nextInt();
		
		System.out.println("Enter second integer:");
		
		obj.b = input.nextInt();
		
		
		input.close();
		
		int result=obj.a*obj.b;
		//Output to user
		System.out.println("Product of the entered integers: " +result);
		result=obj.a+obj.b;
		System.out.println("Sum of the entered integers: " +result);
		
		
	}
}
