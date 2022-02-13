package ma.education.tp1.introduction;

public class SalleCours extends Salle{
	byte nbPlaces;
	
	SalleCours(long id, String nom, int nbPlaces){
		super(id, nom);
		this.nbPlaces = (byte) nbPlaces;
	}
}
