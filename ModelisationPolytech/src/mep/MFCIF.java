package mep;


public final class MFCIF extends ModeFinancement {
    private String orgaGest;

    private String nomEntreprise;

    public MFCIF(String orgaGest, String nomEntreprise) {
        this.orgaGest = orgaGest;
        this.nomEntreprise = nomEntreprise;
    }

    public String getOrgaGest() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.orgaGest;
    }

    public void setOrgaGest(String orga) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.orgaGest = orga;
    }

    public String getNomEntreprise() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nomEntreprise;
    }

    public void setNomEntreprise(String nom) {
        // Automatically generated method. Please delete this comment before entering specific code.
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

}
