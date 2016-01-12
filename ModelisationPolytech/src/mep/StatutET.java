package mep;


public class StatutET extends StatutIng {
	
	public final static String NOMSTATUT = StatutIng.NOMSTATUT + "ET"; 

	public StatutET(Origin o, Departement dep) {
		super(o, dep);
	}

	/* un etudiant en cursus initial et non alternant 
	 * peux aller dans n'importe qu'elle entreprise
	 * il faut juste v�rifier qu'il est en 5 ann�e*/
	public  boolean stageValable(String nomEnt)
	{
		return true;
	}

	@Override
	public String toString() {
		return "Étudiant \n\tDepartement: " + departement + "\n\tOrigine: " + origin;
	}
	
	/* vérifie que toutes les données sont présente dans le statut */
    public boolean verifStat()
    {
    	if(departement != null)
    		if(origin != null)
    			return true;
    	
    	return false;
    }
}
