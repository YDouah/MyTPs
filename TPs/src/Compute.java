
public class Compute {
	
	static void process(Integer a, Integer b) {
		
		System.out.println("Process Integer");
	}
	
   static void process(long a, long b) {
		
		System.out.println("Process long");
	}

	static  void process(int... a) {
	
	System.out.println("Process int...");
}

}
