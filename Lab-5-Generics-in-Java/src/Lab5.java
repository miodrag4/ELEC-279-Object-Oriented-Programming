import java.util.*;

public class Lab5 {

	public static void main(String[] args) {
		ArrayList<Integer> intArray = new ArrayList<Integer>(5);
		Random random = new Random();
		
		
		intArray.ensureCapacity(10);
		for (int i = 0; i < 10; i++) 
			intArray.add(random.nextInt(100));
		System.out.print("[");
		intArray.forEach((n) -> System.out.print(n + ", "));
		System.out.print("]\n");
		
		
		ArrayList<Integer> revArray = new ArrayList<Integer>(10);
		intArray.forEach((n) -> revArray.add(0, n));
		System.out.print("[");
		revArray.forEach((n) -> System.out.print(n + ", "));
		System.out.print("]\n");
		
		
		ArrayList<HourlyEmployee> hEmployee = new ArrayList<HourlyEmployee>(100);
		hEmployee.add(new HourlyEmployee("Joe",new Date("2020/10/1"), 5, 5));
		hEmployee.add(new HourlyEmployee("Moe",new Date("2000/7/10"), 5, 10));
		hEmployee.add(new HourlyEmployee("Bob",new Date("2010/11/12"), 3, 55));
		hEmployee.add(new HourlyEmployee("Mike",new Date("2022/1/3"), 7, 9));
		hEmployee.forEach((n) -> System.out.println(n.toString()));
		System.out.println("Size: " + hEmployee.size());
		
		HourlyEmployee mile = new HourlyEmployee("Mile", new Date("2002/10/10"), 10, 90);
		hEmployee.remove(0);
		hEmployee.add(0, mile);
		hEmployee.forEach((n) -> System.out.println(n.toString()));
		
		hEmployee.remove(2);
		hEmployee.trimToSize();
		System.out.println("Size: " + hEmployee.size());
		
		Pair<String> jt = new Pair<String>("Julia", "Tom");
		Pair<String> tj = new Pair<String>("Julia","Tom");
		Pair<String> judy = new Pair<String>("Judy","Tom");
		
		System.out.println("First pair ==> " + jt);
		System.out.println("Second pair ==> " + tj);
		System.out.println("Third pair ==> " + judy);
		
		System.out.println("First and second pair are equal? " + jt.equals(tj));	
		System.out.println("First and third pair are equal? " + jt.equals(judy));	
		
		Triple<String, Double> t1 = new Triple<String, Double>("Toronto",547.0, "Montreal");
		Triple<String, Double> t2 = new Triple<String, Double>("Toronto",547.0,"Montreal");
		Triple<String, Double> t3 = new Triple<String, Double>("Toronto", 264.5,"Kingston");
		
		System.out.println("First triple ==> " + t1);
		System.out.println("Second triple ==> " + t2);
		System.out.println("Third triple ==> " + t3);
		
		System.out.println("First and second triple are equal? " + t1.equals(t2));	
		System.out.println("First and third triple are equal? " + t1.equals(t3));	
	}

}
