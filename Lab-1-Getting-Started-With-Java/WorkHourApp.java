package src;

import java.util.Scanner;


public class WorkHourApp {
	
			
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hoursperday = 0;
		int numdays = 0;
		
		System.out.println("Enter a how many hours you work daily below:");
		hoursperday = scanner.nextInt();
		
		System.out.println("Enter a how many days you've worked for below:");
		numdays = scanner.nextInt();
		
		int totalhours = hoursperday;
		for (int i = 1; i <= numdays; i++) {
			System.out.println("Total Hours worked on day " + i + " is " + totalhours + ".");
			totalhours += hoursperday;
		}
		

	}

}
