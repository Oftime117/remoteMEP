package mep;


public class StatutET extends StatutIng {
	

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
	
	/*v�rifie que toutes les donn�es sont pr�sente dans le statut*/
    public boolean verifStat()
    {
    	if(departement != null)
    		if(origin != null)
    			return true;
    	
    	return false;
    }
    

}
