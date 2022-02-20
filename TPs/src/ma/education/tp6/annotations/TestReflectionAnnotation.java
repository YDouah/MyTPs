package ma.education.tp6.annotations;

public class TestReflectionAnnotation {
	public static void main(String[] args) {
		Class c = Calculatrice.class;;
		
		Programmer programmer = (Programmer) c.getDeclaredAnnotation(Programmer.class);
		System.out.println("");
		
	}
	

}
