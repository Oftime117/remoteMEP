package mep;

import exceptions.StatutException;

public class StatutET extends StatutIng {
	
	public final static String NOMSTATUT = StatutIng.NOMSTATUT + "ET"; 

	public StatutET(Origin o, Departement dep) {
		super(o, dep);
	}

	
	
	@Override
	public int getAnneeRestante() {
		// TODO Auto-generated method stub
		return origin.getAnneeRestante();
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
		return "Étudiant \n\tDepartement: " + departement + "\n\tOrigine : " + origin;
	}
	
	/*v�rifie que toutes les donn�es sont pr�sente dans le statut*/
    public boolean verifStat() throws StatutException
    {
    	try{
    		if(departement != null)
        		if(origin != null)
        			return true;
        	return false;

    	}
    	catch (NullPointerException n)
    	{
    		throw new  StatutException("le statut est incomplet");
    	}
    	
    }
    
	@Override
	public boolean estCompatibleAvec(Statut stat) {
		if(!(stat instanceof StatutET)) return false;
		return super.estCompatibleAvec(stat);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
    
    
}
