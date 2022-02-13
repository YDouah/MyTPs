package ma.education.tp1.introduction;

public class TestHeritage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salle s1 = new SalleCours(1, "Salle 1", 20);
		SalleCours s2 = new SalleCours(2,"Salle 2", 20);
		SalleCours s3 =  (SalleCours) s1; 
		// object s3 was expecting attributes (long/String/byte) and we gave (long/String/int)
		// cast Explecite est valide dans ce cas
		SalleCours s4 = s2;
		
		Salle s5 = new Laboratoire(2,"LABO","CHIMIE");
		SalleCours s6 = new SalleCours(2,"Salle 2 ",20);
		SalleCours s7 = (SalleCours) s5;
		// object s7 was expecting attribute (long/String/String) and we gave (long/String/int)
		// cast Explecite n'est pas valide dans ce cas
		SalleCours s8 = s6;
		
		
	}

}
 