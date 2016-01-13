package mep;

import exceptions.StatutException;

public abstract class StatutIng extends StatutFI {
	public final static String NOMSTATUT = StatutFI.NOMSTATUT + "ING"; 
	
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
        
    /*Permet de changer de département*/
    @Override
	public void setDep(Departement dep) throws StatutException {
    	departement = dep;
    }
}
