
public class Test {

	public static void main(String[] args) {
		Person p1 = new Person("Jane", "181 University Ave", 123456);
		System.out.println(p1);
		Student s1 = new Student("John", "89 University Ave", 234567);
		s1.addGrade("ELEC 279", 97);
		s1.addGrade("ELEC 221", 68);
		System.out.println(s1);
		s1.printGrades();
	}

}
