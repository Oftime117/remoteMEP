package mep;

import exceptions.StatutException;

public abstract class StatutIng extends StatutFI {
	public final static String NOMSTATUT = StatutFI.NOMSTATUT + "ING"; 
	
	protected Departement departement;
	
	public StatutIng(Origin o, Departement dep) {
		super(o);
		departement = dep;
	}


    public Departement getDepartement() {
        return this.departement;
    }

    public void setDepartement(Departement dept) {
        this.departement = dept;
    }
    
    /*permet de valider un stage ou non*/
    public abstract boolean stageValable(String nomEnt);
    
    /*v�rifie que toutes les donn�es sont pr�sente dans le statut*/
    public abstract boolean verifStat() throws StatutException;


	@Override
	public boolean estCompatibleAvec(Statut stat) {
		if(this.equals(stat)) return true;
		try {
			StatutIng buff = (StatutIng) stat;
			if(buff.departement != null) 
				if(this.departement != null) {
					if(!departement.equals(buff.departement)) return false;
				} else return false; 
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
    		StatutIng buff = (StatutIng) obj;
    		return ((this.departement == buff.departement) && 
    				(super.equals(obj)));
    	} catch (ClassCastException e) {
    		return false;
    	}
	}
    
    
}
