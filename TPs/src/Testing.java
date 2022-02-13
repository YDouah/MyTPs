import java.util.Set;
import java.util.TreeSet;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> id = new TreeSet<>((a,b) -> a.length()-b.length());
		id.add("A200");
		id.add("A400");
		id.add("A300");
		id.forEach(a->System.out.println(a));
	}

}
