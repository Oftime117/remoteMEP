package mep;

import exceptions.StatutException;

public class StatutAPP extends StatutIng {

	public final static String NOMSTATUT = StatutIng.NOMSTATUT + "APP";

	private String nomEntreprise;

	public StatutAPP(Origin o, Departement dep, String ent) {
		super(o, dep);
		nomEntreprise = ent;
		anneeEntree = 3;
	}
	
	
	 
    @Override
	public int getAnneeRestante() {
		// TODO Auto-generated method stub
		return origin.getAnneeRestante();
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
    
    /*v�rifie que toutes les donn�es sont pr�sente dans le statut*/
    public boolean verifStat() throws StatutException
    {
    	try{
    		if(departement != null)
        		if(origin != null)
        			if(nomEntreprise != null)
        				return true;
        	
        	return false;
    	}
    	catch(NullPointerException n){
    		throw new  StatutException("le statut est incomplet");
    	}
    	
    }

	@Override
	public String toString() {
		return "Apprenti \n\tNom de L'entreprise : " + nomEntreprise
				+ "\n\tDepartement : " + departement
				+ "\n\tOrigine : " + origin;
	}

	@Override
	public boolean estCompatibleAvec(Statut stat) {
		if(!(stat instanceof StatutAPP)) return false;
		return super.estCompatibleAvec(stat);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(obj == this) return true;
		try {
			StatutAPP buff = (StatutAPP) obj;
			if(buff.departement.equals(obj)) return false;
			return super.equals(obj);
		}
		catch(NullPointerException e) {
			return false;
		}
		
	}
	
	
}
