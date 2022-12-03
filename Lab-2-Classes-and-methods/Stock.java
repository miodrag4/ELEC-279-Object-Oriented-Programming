
public class Stock {
	private int day;
	private int month;
	private int year;
	private String name;
	private int[] values = new int[7];

	public Stock() {
		super();
		day = 1;
		month = 1;
		year = 1;
		name = "";
		for (int i = 0; i < 7; i++)
			values[i] = 0;
	}

	public Stock(int dayIn, int monthIn, int yearIn, String nameIn, int[] valIn) {
		super();
		day = dayIn;
		month = monthIn;
		year = yearIn;
		name = nameIn;
		// Check all values of valIn are positive
		boolean correctStockVal = true;
		for (int i = 0; i < valIn.length; i++) {
			if (valIn[i] < 0)
				correctStockVal = false;
		}

		// Set correctly if all inputs are valid
		if (correctStockVal == true && valIn.length == 7) {
			for (int i = 0; i < 7; i++)
				values[i] = valIn[i];
		} else {
			System.out.println("Error");
			for (int i = 0; i < 7; i++)
				values[i] = 0;
		}
	}

	public String getName() {
		return name;
	}

	public int getValue(int ind) {
		if (ind >= 0 && ind < 7)
			return values[ind];
		else {
			System.out.println("Error");
			return -1;
		}
	}

	public void setName(String nameIn) {
		name = nameIn;
	}

	public void setValue(int val, int ind) {
		if (val < 0 || ind < 0 || ind >= 7)
			System.out.println("Error");
		else
			values[ind] = val;
	}

	public void printStock() {
		System.out.println(name + ": " + day + "." + month + "." + year + " values:");
		for (int i = 0; i < 7; i++)
			if ( i != 6)
				System.out.print(values[i] + ", ");
			else System.out.print(values[i]);
		System.out.println("\n");
	}

	public int getMean() {
		int sum = 0;
		for (int i = 0; i < values.length; i++)
			sum = sum + values[i];
		int average = sum / values.length;
		return average;

	}

}
