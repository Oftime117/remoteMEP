package mep;


public final class MFI extends ModeFinancement {
	public final static String TYPEMF = ModeFinancement.TYPEMF + "FI";
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

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof MFI)) return false;
		return super.equals(obj);
	}
	
}
