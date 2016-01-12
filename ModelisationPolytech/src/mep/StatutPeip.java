package mep;

import exceptions.StatutException;

public class StatutPeip extends StatutFI {

	public final static String NOMSTATUT = StatutFI.NOMSTATUT + "PEIP"; 
	
    public StatutPeip(Origin o) {
		super(o);
	}

	/* un etudiant en peip n'a pas de stage en 5 annee... il n'est pas en 5 eme annee...*/
    public  boolean stageValable(String nomEnt)
    {
    	return false;
    }

	@Override
	public String toString() {
		return "Élève PeiP \n\tOrigine" + origin;
	}

    
    /*v�rifie que toutes les donn�es sont pr�sente dans le statut*/
    public boolean verifStat() throws StatutException
    {
    	if(origin == null)
    		throw new StatutException("mauvaise origine");
    		
    	return true;
    }

    
    /*v�rifie si le d�partement existe dans le cursus*/
    public boolean verifDep(Departement d)
    {
    	/* pas de d�partement pour les peip*/
    	return false;
    }
}
