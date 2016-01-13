package mep;

import exceptions.StatutException;

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

	/* permet de verifier le stage de 5 eme ann�e */
	@Override
	public boolean stageValable(String nomEnt) {
		if (nomEnt.compareTo(nomEntreprise) == 0)
			return true;
		else
			return false;
	}

	/* v�rifie que toutes les donn�es sont pr�sente dans le statut */
	@Override
	public boolean verifStat() {
		if (departement != null || origin != null || nomEntreprise != null)
			return true;

		return false;
	}

	@Override
	public String toString() {
		return "Apprenti \n\tNom de L'entreprise : " + nomEntreprise + "\n\tDepartement: " + departement
				+ "\n\tOrigine: " + origin;
	}
	
	/*
	 * permet de savoir si un étudiant peut rentrer en Ing.
	 */
	public  boolean admissionFIIng(){
		/*Doit avoir une entreprise*/
		if(nomEntreprise == null || nomEntreprise.isEmpty())
			return false;
		return true;
	}
}
