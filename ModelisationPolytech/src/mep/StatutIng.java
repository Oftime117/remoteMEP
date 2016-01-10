package mep;


public abstract class StatutIng extends StatutFI {
    
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
    
    /*accorde la possibilite d'un changement de statut ou non*/
    public  boolean changementStatut(Statut newStatut)
    {
    	/*un eleve ne peut pas changer de statut*/
    	return false;
    }

    /*vérifie que toutes les données sont présente dans le statut*/
    public abstract boolean verifStat();
}
