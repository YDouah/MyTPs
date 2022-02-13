package ma.education.tp6.annotations;

public class TestReflectionAnnoration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c = Calculatrice.class;
		Programmer programmer = (Programmer) c.getAnnotation(Programmer.class);
		
		System.out.println(programmer.id() + ":" + programmer.name());
	}

}
