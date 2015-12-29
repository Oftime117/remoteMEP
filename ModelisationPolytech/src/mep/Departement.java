package mep;


public class Departement {
    private String nomDept;

/* Peut disposer d'élèves en ET */
    private boolean dispoET;

/* Peut disposer d'élèves en formation continue */
    private boolean dispoFC;

/* Peut disposer d'élèves en apprentissage */
    private boolean dispoAPP;

    public Departement(String nomDept, boolean dispoET, boolean dispoFC, boolean dispoAPP) {
        this.nomDept = nomDept;
        this.dispoET = dispoET;
        this.dispoFC = dispoFC;
        this.dispoAPP = dispoAPP;
    }

    public String getNomDept() {
        return this.nomDept;
    }

    public void setNomDept(String nom) {
        this.nomDept = nom;
    }

    public boolean isDispoET() {
        return this.dispoET;
    }

    public void setDispoET(boolean dispoET) {
        this.dispoET = dispoET;
    }

    public boolean isDispoFC() {
        return this.dispoFC;
    }

    public void setDispoFC(boolean dispoFC) {
        this.dispoFC = dispoFC;
    }

    public boolean isDispoAPP() {
    	return this.dispoAPP;
    }

    public void setDispoAPP(boolean dispoAPP) {
        this.dispoAPP = dispoAPP;
    }

}
