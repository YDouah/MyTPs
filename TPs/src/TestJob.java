import java.util.HashSet;
import java.util.Set;

public class TestJob {

	public static void main(String[] args) {
		
		Set <Job> jobs = new HashSet<>();
		
		jobs.add( new Job(1, "ABC"));
		jobs.add( new Job(2, "EFD"));
		jobs.add( new Job(3, "AE"));
		jobs.add( new Job(4, "AB"));
		jobs.add( new Job(5, "AC"));
		
		System.out.println(jobs);

	}

}
