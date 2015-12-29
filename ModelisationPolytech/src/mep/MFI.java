package mep;


public final class MFI extends ModeFinancement {
    public void MFI() {
    }

    /*l'eleve n'a pas de contraintes particuliere pour son stage*/
    public  boolean verifieStage(String nomEnt)
    {
    	return true;
    }
}
