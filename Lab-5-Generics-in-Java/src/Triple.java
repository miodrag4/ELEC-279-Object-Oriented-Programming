import java.util.Objects;

public class Triple<T,Y> {
	T first;
	Y second;
	T third;
	
	public Triple(T first, Y second, T third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triple other = (Triple) obj;
		return Objects.equals(first, other.first) && Objects.equals(second, other.second)
				&& Objects.equals(third, other.third);
	}

	public String toString() {
		return "Departure city: " + first + "; Distance: " + second + "; Arrival city: " + third;
	}
	
	
	
	
	
}
