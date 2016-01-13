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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nomEntreprise == null) ? 0 : nomEntreprise.hashCode());
		result = prime * result
				+ ((orgaGest == null) ? 0 : orgaGest.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof MFCIF))
			return false;
		
		try {
			MFCIF buff = (MFCIF) obj;
			if (nomEntreprise == null) {
				if (buff.nomEntreprise != null)
					return false;
			} else if (!nomEntreprise.equals(buff.nomEntreprise))
				return false;
			if (orgaGest == null) {
				if (buff.orgaGest != null)
					return false;
			} else if (!orgaGest.equals(buff.orgaGest))
				return false;
			return true;
		}
		catch(NullPointerException e) {
			return false;
		}
	}

	
	
}
