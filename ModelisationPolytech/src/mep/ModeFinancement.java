package mep;


public abstract class ModeFinancement {
	public final static String TYPEMF = "MF";
	/*permet de verifier le stage de l'eleve en fonction de son mode de financement*/
	public abstract boolean verifieStage(String nomEnt);
}
