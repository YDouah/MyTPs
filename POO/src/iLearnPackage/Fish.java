package iLearnPackage;

public class Fish implements Prey, Predator{

	@Override
	public void hunt() {
		System.out.println("this fish is hunting");
		
	}

	@Override
	public void flee() {
		System.out.println("this fish is a Prey");
		
	}
	
	

}
