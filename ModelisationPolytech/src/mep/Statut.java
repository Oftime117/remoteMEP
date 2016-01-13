package mep;

import exceptions.StatutException;

public abstract class Statut {
	public final static String NOMSTATUT = "STATUT";
	/* Variable valant vrai si l'étudiant à redoublé une fois */
    protected boolean redoublant = false;
    protected int anneeEntree;

    
    public boolean isRedoublant() {
        return this.redoublant;
    }
    

    public void setRedoublant(boolean value) {
        this.redoublant = value;
    }
    
    public boolean getRedoublant() {
    	return redoublant;
    }

    
    
    public abstract int getAnneeRestante() ;
    
    


	/*permet de valider un stage ou non*/
    public abstract boolean stageValable(String nomEnt);
    
    /*v�rifie que toutes les donn�es sont pr�sente dans le statut*/
    public abstract boolean verifStat() throws StatutException;
    
   
    
    @Override
	public boolean equals(Object obj) {
    	if(obj == null) return false;
    	if(obj == this) return true;
    	try {
    		Statut buff = (Statut) obj;
        	return (this.redoublant == buff.redoublant);
    	} catch(ClassCastException e) {
    		return false;
    	}
	}


	public boolean estCompatibleAvec(Statut stat){
    	if(stat == null) return false;
    	if(stat == this) return true;
    	return this.redoublant == stat.redoublant;
    }


	
    
    
}
