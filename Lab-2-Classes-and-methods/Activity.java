
public class Activity {
	private int day;
	private int month;
	private int year;

	public Activity() {
		super();
		day = 1;
		month = 1;
		year = 1;
	}

	public Activity(int dayIn, int monthIn, int yearIn) {
		super();
		if (yearIn >= 1)
			year = yearIn;
		else {
			System.out.println("Error");
			year = 1;
		}
		if (monthIn >= 1 && monthIn <= 12)
			month = monthIn;
		else {
			System.out.println("Error");
			month = 1;
		}
		if (dayIn >= 1 && dayIn <= 31)
			day = dayIn;
		else {
			System.out.println("Error");
			day = 1;
		}
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void setDate(int dayIn, int monthIn, int yearIn) { 
		if (yearIn >= 1) 
			year = yearIn; 
		else { 
			System.out.println("Error"); 
		} 

		if (monthIn == 1 || monthIn == 3 || monthIn == 5 || monthIn == 7 || monthIn == 8 || monthIn == 10 || monthIn == 12) { 
			month = monthIn; 
			if (dayIn >= 1 && dayIn <= 31) 
				day = dayIn; 
			else { 
				System.out.println("Error"); 
			} 
		} 

		else if (monthIn == 4 || monthIn == 6 || monthIn == 9 || monthIn == 11){ 
			month = monthIn;
			if (dayIn >= 1 && dayIn <= 30) 
				day = dayIn; 
			else { 
				System.out.println("Error"); 
			} 
		} 

		else if (monthIn == 2) { 
			month = monthIn; 
			if (dayIn >= 1 && dayIn <= 29) 
				day = dayIn; 
			else { 
				System.out.println("Error"); 
			} 
		} 
		else {
			if (dayIn <= 29) 
				day = dayIn; 
			System.out.println("Error");		 
		}
	} 

	public void printDate() {
		System.out.println("The Date is " + day + "." + month + "." + year);
	}

}
