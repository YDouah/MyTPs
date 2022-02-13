package ma.education.tp2.statickeyword;

public class TestStatic {

	public static void main(String[] args) {
		
		Etudiant e1 = new Etudiant(1, "AHMED", 20);
		Etudiant e2 = new Etudiant(1, "SAID", 30);
		
		System.out.println(e1.toString() + " " + Etudiant.nbEtudiants);
		System.out.println(e2.toString() + " " + Etudiant.nbEtudiants);
	}

}
