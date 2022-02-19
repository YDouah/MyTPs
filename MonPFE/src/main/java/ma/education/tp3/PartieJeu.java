package ma.education.tp3;

public class PartieJeu {
	
	public static void main(String[] args) {
		
		VoitureFactory f = VoitureFactory.getInstance();
		Voiture v = f.getVoiture(300);
		v.accelerer();
	}

}
