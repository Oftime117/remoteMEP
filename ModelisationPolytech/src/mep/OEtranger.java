package mep;


public class OEtranger extends Origin {

	/* Pays d'origine */
    private String pays;

    
    public OEtranger(String etabOrigin, String diplome, String p) {
		super(etabOrigin, diplome);
		this.pays = p;
	}
    
    public String getPays() {
        return this.pays;
    }

    public void setPays(String p) {
        this.pays = p;
    }

}
