package ma.education.tp3;

public class TestStatic {
	public static void main(String[] args) {
		
		
		Configuration c1 = Configuration.getInstance("123", "abc", "url1");
		Configuration c2 = Configuration.getInstance("123", "abc", "url1");
		System.out.println(c2.password);
		System.out.println(c2.user);
		
	}
}
