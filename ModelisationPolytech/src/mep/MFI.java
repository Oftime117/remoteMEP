package mep;


public final class MFI extends ModeFinancement {
    public MFI() {
    }

    /*l'eleve n'a pas de contraintes particuliere pour son stage*/
    public  boolean verifieStage(String nomEnt)
    {
    	return true;
    }
	@Override
	public String toString() {
		return "Individuel";
	}
}
