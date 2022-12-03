package DateApp;
import java.util.Date;

public class DateApptask {
	
	public static void main(String[] args) {
		int min = 10, max = 20, average = 5;
		String myrole = "Driver";
		byte myfirstByte = 22;
		double pi = 3.14159;
		char mychar = 'N';
		
		System.out.println("I am now the " +myrole);
		System.out.println("Our minimum socre is " +min);
		System.out.println("We have a byte " +myfirstByte);
		System.out.println("And double type is " +pi);
		System.out.println("A char looks like " +mychar);
		
		Date todaysdate = new Date();
		
		int count = 1;
		while (count<=10) {
			System.out.println(todaysdate);
			count++;
		}
		
		for (count=1; count<=25;count++) {
			System.out.println(todaysdate);
		}
		
		for(int row = 1; row<=5; row++) {
			for(int column = 1; column <= 10; column++) {
				System.out.print(row * column + "\t");
			}
			System.out.println();
		}
	}

}
