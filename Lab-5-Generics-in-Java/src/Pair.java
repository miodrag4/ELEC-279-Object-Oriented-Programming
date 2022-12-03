import java.util.Objects;

public class Pair<T> {
	T first;
	T second;
	
	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		return Objects.equals(first, other.first) && Objects.equals(second, other.second);
	}

	public String toString() {
		return "Wife's name: " + first + "; Husband's name: " + second;
	}
	
	
	
}
