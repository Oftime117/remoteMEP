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

}
