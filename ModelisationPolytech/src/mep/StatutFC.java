package mep;


public class StatutFC extends Statut {
    private Departement departement;

    private ModeFinancement modeFinancement;

    public StatutFC(Departement departement, ModeFinancement modeFinancement) {
        this.modeFinancement = modeFinancement;
        this.departement = departement;
    }

    public Departement getDepartement() {
        return this.departement;
    }

    public void setDepartement(Departement dept) {
        this.departement = dept;
    }

    public ModeFinancement getModeFinancement() {
        return this.modeFinancement;
    }

    public void setModeFinancement(ModeFinancement mode) {
        this.modeFinancement = mode;
    }

    public  boolean stageValable(String nomEnt)
    {
    	return false;
    }
}
