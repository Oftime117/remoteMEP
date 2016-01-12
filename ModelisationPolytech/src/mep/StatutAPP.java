package mep;


public class StatutAPP extends StatutIng {

	public final static String NOMSTATUT = StatutIng.NOMSTATUT + "APP";

	private String nomEntreprise;

	public StatutAPP(Origin o, Departement dep, String ent) {
		super(o, dep);
		nomEntreprise = ent;
	}
	 
    public String getNomEntreprise() {
        return this.nomEntreprise;
    }

    public void setNomEntreprise(String nom) {
        this.nomEntreprise = nom;
    }
    
    /* permet de verifier le stage de 5 eme ann�e*/
    public  boolean stageValable(String nomEnt)
    {
    	if(nomEnt.compareTo(nomEntreprise) == 0)
    		return true;
    	else
    		return false;
    }
    
    /*vérifie que toutes les données sont présente dans le statut*/
    public boolean verifStat()
    {
    	if(departement != null)
    		if(origin != null)
    			if(nomEntreprise != null)
    				return true;
    	
    	return false;
    }

	@Override
	public String toString() {
		return "Apprenti \n\tNom de L'entreprise : " + nomEntreprise
				+ "\n\tDepartement: " + departement
				+ "\n\tOrigine: " + origin;
	}
}
