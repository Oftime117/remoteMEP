package mep;

import exceptions.StatutException;

public class StatutET extends StatutIng {

	public final static String NOMSTATUT = StatutIng.NOMSTATUT + "ET";

	public StatutET(Origin o, Departement dep) {
		super(o, dep);
	}

	/*
	 * un etudiant en cursus initial et non alternant peux aller dans n'importe
	 * qu'elle entreprise
	 */
	@Override
	public boolean stageValable(String nomEnt) {

		return true;
	}

	@Override
	public String toString() {
		return "Étudiant \n\tDepartement: " + departement + "\n\tOrigine: " + origin;
	}

	/* v�rifie que toutes les donn�es sont pr�sente dans le statut */
	@Override
	public boolean verifStat() {

		if (departement != null || origin != null)
			return true;
		return false;

	}

}
