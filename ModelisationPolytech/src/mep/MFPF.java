package mep;


public final class MFPF extends ModeFinancement {
    private String nomEntreprise;

    public MFPF(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public String getNomEntreprise() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nomEntreprise;
    }

    public void setNomEntreprise(String nom) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nomEntreprise = nom;
    }

    /*l'eleve doit faire son stage dans son entreprise*/
    public  boolean verifieStage(String nomEnt)
    {
    	if (this.getNomEntreprise().compareTo(nomEnt) == 0)
    		return true;
    	else 
    		return false;
    }
}
