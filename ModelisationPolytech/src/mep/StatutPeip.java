package mep;


public class StatutPeip extends StatutFI {

    public StatutPeip(Origin o) {
		super(o);
	}

	/* un etudiant en peip n'a pas de stage en 5 annee... il n'est pas en 5 eme annee...*/
    public  boolean stageValable(String nomEnt)
    {
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
}
