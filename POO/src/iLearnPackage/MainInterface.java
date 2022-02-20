package iLearnPackage;

public class MainInterface {

	public static void main(String[] args) {
		
		Rabbit rabbit = new Rabbit();
		rabbit.flee();
		
		Eagle eagle = new Eagle();
		eagle.hunt();
		
		Fish fish = new Fish();
		fish.hunt();
		fish.flee();

	}

}
