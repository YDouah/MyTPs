package ma.education.tp2.reflection;

import ma.education.tp1.introduction.Salle;

public class TestReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class salleClass = Salle.class;
		
		System.out.println(salleClass.getName());
		System.out.println(salleClass.getFields());
	}
	 
	 

}
