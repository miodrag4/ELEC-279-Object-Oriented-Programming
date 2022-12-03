import java.util.Scanner;

public class Lab1Task4 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the interger: ");
		 int num = scan.nextInt();
		 scan.close();
		 System.out.println("The Number Entered is: "+num);
		 int i, j;
			for(i = 1; i <= num; i++)
				{
				for(j = 1; j <= 20; j++)
				{
					System.out.print(i * j + "\t");
				}
				System.out.println();
			}
		}
	}