
public class Student extends Person{
	private int class_num;
	private String[] class_name;
	private int[] grades;
	private static int max_class = 20;
	
	public Student(String name, String address, int idNum) {
		super(name, address, idNum);
		this.class_num = 0;
		this.class_name = new String[max_class];
		this.grades = new int[max_class];
	}

	@Override
	public String toString() {
		return "Student: " + super.toString();
	}
	
	public void addGrade(String cc, int grade) {
		class_name[class_num] = cc;
		grades[class_num] = grade;
		class_num++;
	}
	public void printGrades() {
		for( int  i = 0; i < class_num; i++ ) {
			System.out.println( class_name[i] + ": " + grades[i]);
		}
	}
}
