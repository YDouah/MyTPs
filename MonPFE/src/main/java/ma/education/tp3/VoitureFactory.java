package ma.education.tp3;

public class VoitureFactory {
	
	private static VoitureFactory instance;
	
	private VoitureFactory() {
		
	}
	
	public static VoitureFactory getInstance() {
		
		if(instance == null)
			instance = new VoitureFactory();
		return 
				instance;
	}
	
	
	public Voiture getVoiture(int vitesse) {
		if(vitesse < 60)
			return new PoidLourd();
		
		if(vitesse > 60 && vitesse != 300)
			return new PoidLeger();
		
		if(vitesse == 300)
			return new Express();
		
		return null;
		
	}

}
