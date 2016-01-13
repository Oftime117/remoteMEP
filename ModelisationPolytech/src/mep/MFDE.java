package mep;


public final class MFDE extends ModeFinancement {
	public final static String TYPEMF = ModeFinancement.TYPEMF + "DE";
    public MFDE() {
    }

    /*l'eleve n'a pas de contraintes particuliere pour son stage*/
    @Override
    public  boolean verifieStage(String nomEnt)
    {
    	return true;
    }

	@Override
	public String toString() {
		return "Demandeur d'emploi";
	}
	
	/*permet de vérifier les modes de financement*/
	@Override
	public  boolean verifModeFinance(){
		/*il n'y a pas de vérification particulière à faire*/
		return true;
	}
}
