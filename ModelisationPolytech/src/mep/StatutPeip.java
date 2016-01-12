package mep;


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
    public boolean verifStat()
    {
    	if(origin != null)
    		return true;
    	return false;
    }
    /*accorde la possibilite d'un changement de statut ou non*/
    public  boolean changementStatut(Statut newStatut)
    {
		if(newStatut instanceof StatutIng)
			return true;
		else 
			return false;
    }
    
    
    /*v�rifie si le d�partement existe dans le cursus*/
    public boolean verifDep(Departement d)
    {
    	/* pas de d�partement pour les peip*/
    	return false;
    }
}
