
public class Job {
	String name;
	int nb;
	
	
	
	public Job(int nb, String name) {
		super();
		this.name = name;
		this.nb = nb;
	}
	
	@Override
	public String toString() {
		return "Job [name=" + name + ", nb=" + nb + "]";
	}

	public boolean equals (Object o) {
		Job j = (Job) o;
		return name.length() != j.name.length();
	}
	
	public int hashCode() {
		return nb % 2;
	}

}
