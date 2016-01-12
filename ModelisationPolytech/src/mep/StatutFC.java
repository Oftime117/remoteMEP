package mep;

import exceptions.StatutException;

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
    	return (this.getModeFinancement().verifieStage(nomEnt));
    }
    
    /*vérifie que toutes les données sont présente dans le statut*/
    public boolean verifStat() throws StatutException
    {
    	
		if(departement == null ||modeFinancement == null )
    		throw new StatutException("Statut non complet");

    	
    	return true;
    }


	@Override
	public String toString() {
		return "Formation Continue \n\tDepartement: " + departement 
				+ "\n\tMode de financement: " + modeFinancement;
	}

}
