package mep;


public final class MFDE extends ModeFinancement {
    public MFDE() {
    }

    /*l'eleve n'a pas de contraintes particuliere pour son stage*/
    public  boolean verifieStage(String nomEnt)
    {
    	return true;
    }
}
