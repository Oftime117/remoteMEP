package mep;

import exceptions.StatutException;

public abstract class StatutIng extends StatutFI {
	public final static String NOMSTATUT = StatutFI.NOMSTATUT + "ING"; 
	
	protected Departement departement;
	
	public StatutIng(Origin o, Departement dep) {
		super(o);
		departement = dep;
	}


	@Override
    public Departement getDepartement() throws StatutException {
        return this.departement;
    }
        
    /*Permet de changer de département*/
    @Override
	public void setDep(Departement dep) throws StatutException {
    	departement = dep;
    }
    
    /*
	 * permet de savoir si un étudiant peut rentrer en Ing.
	 */
	public abstract boolean admissionFIIng();
}
