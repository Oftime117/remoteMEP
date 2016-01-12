package mep;


public final class MFCIF extends ModeFinancement {
	public final static String TYPEMF = ModeFinancement.TYPEMF + "CIF";
    private String orgaGest;

    private String nomEntreprise;

    public MFCIF(String orgaGest, String nomEntreprise) {
        this.orgaGest = orgaGest;
        this.nomEntreprise = nomEntreprise;
    }

    public String getOrgaGest() {
    	return this.orgaGest;
    }

    public void setOrgaGest(String orga) {
    	this.orgaGest = orga;
    }

    public String getNomEntreprise() {
        return this.nomEntreprise;
    }

    public void setNomEntreprise(String nom) {
        this.nomEntreprise = nom;
    }
    
    /*l'eleve doit prendre un stage en dehors de son entreprise*/
    public  boolean verifieStage(String nomEnt)
    {
    	if (this.getNomEntreprise().compareTo(nomEnt) == 0)
    		return false;
    	else 
    		return true;
    }

	@Override
	public String toString() {
		return "Congé individuel de Formation\n\t\tOrganisme Gestionnaire: " + orgaGest 
				+ "\n\t\tNom de l'entreprise: " + nomEntreprise;
	}

}
