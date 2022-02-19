package ma.education.tp3;

public class Configuration {
	static String url;
	String password;
	String user;
	private static Configuration instance;
	
	
	public static Configuration getInstance(String password, String user, String u) {
		if(instance == null) 
			instance = new Configuration(password, user, u);
		return 
				instance;
				
	}
	
	private Configuration(String password, String user, String u) {
		super();
		this.password = password;
		this.user = user;
		Configuration.url += u;
	}

	void method1() {
		System.out.println(url);
		System.out.println(password);
		System.out.println(user);
	}
	
	static void methode2() {
		System.out.println(Configuration.url);
		
	}
}

