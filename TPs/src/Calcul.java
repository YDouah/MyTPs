
public class Calcul {

	public static Object process;

	static void add(Integer a, Integer b) {
		System.out.println("process Integer");
	}
	
	static void add(long a, long b) {
		System.out.println("process long");
	}
	
	static void add(int...a) {
		System.out.println("process int...");
	}
}
