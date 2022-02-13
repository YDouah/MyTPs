
public class Processs {

	 int memory;
	static String type = "";
		
	{
		System.out.println(memory++);
	}
	
	static {
		type += "A";
		System.out.println(type);
	}
	
	{
		System.out.println(++memory);
	}
	
	 Processs(int memory){
		this.memory = memory++;
		System.out.println(this.memory);
	}
	 
	
	
			
}
