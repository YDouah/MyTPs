package ma.education.tp.abstractkeyword;

public abstract class FormeGeoTypeA extends FormeGeometrique{

	public abstract double calculerSurface();
	
	public void afficherSurface() {
		System.out.println(this.surface);
	}
}
