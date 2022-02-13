
public class Processing {
	private long time;
	private static String job="job";
	
	{
		time += 10;
		System.out.println("A="+time);
	}
	
	static {
		job +="1";
		System.out.println("B= "+job);
	}
	
	{
		time += 30;
		System.out.println("C "+time);
	}
	
	public Processing(long time) {
		this.time += time;
		System.out.println("D "+this.time);
	}

}
