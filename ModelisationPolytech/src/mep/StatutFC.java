package mep;

import exceptions.StatutException;

public class StatutFC extends Statut {
	
	public final static String NOMSTATUT = Statut.NOMSTATUT + "FC"; 
    private Departement departement;

    private ModeFinancement modeFinancement;

    public StatutFC(Departement departement, ModeFinancement modeFinancement) {
        this.modeFinancement = modeFinancement;
        this.departement = departement;
    }

    
    
    @Override
	public int getAnneeRestante() {
		// TODO Auto-generated method stub
		return 2;
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
		return "Formation Continue \n\tDepartement : " + departement 
				+ "\n\tMode de financement : " + modeFinancement;
	}

	@Override
	public boolean estCompatibleAvec(Statut stat) {
		if(stat == null) return false;
		if(stat == this) return true;
		try {
			StatutFC buff = (StatutFC) stat;
			if(buff.departement != null){
				if(this.departement != null) {
					if(! (this.departement.equals(buff.departement))) return false;
				} else return false;
			}
			if(buff.modeFinancement != null){
				if(this.modeFinancement!= null) {
					if(! (this.modeFinancement.equals(buff.modeFinancement))) return false;
				} else return false;
			}
			return super.estCompatibleAvec(stat);
		} catch(ClassCastException e) {
			return false;
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(obj == this) return true;
		try {
			StatutFC buff = (StatutFC) obj;
			if(buff.departement.equals(obj)) return false;
			return super.equals(obj);
		}
		catch(NullPointerException e) {
			return false;
		}
	}
}
