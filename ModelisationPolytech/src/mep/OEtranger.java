package mep;


public class OEtranger extends Origin {
public OEtranger(String etabOrigin) {
		super(etabOrigin);
	}

	/* Pays d'origine */
    private String pays;

    public String getPays() {
        return this.pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

}
