package mep;


public class Origin {
	public final static String TYPEORIGIN = "O";
	
    protected String etabOrigin;

/* Diplome d'origine avant l'arrivée à Polytech (on suppose que les post bacs ont eu le Baccalauréat */
    protected String diplome;

    public Origin(String etabOrigin, String diplome) {
        this.etabOrigin = etabOrigin;
        this.diplome = diplome;
    }

    public String getEtabOrigin() {
        return this.etabOrigin;
    }

    public void setEtabOrigin(String etabOrigin) {
        this.etabOrigin = etabOrigin;
    }

    public String getDiplome() {
        return this.diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

}
