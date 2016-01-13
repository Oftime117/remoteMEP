package mep;

import exceptions.StatutException;

public class StatutPeip extends StatutFI {

	public final static String NOMSTATUT = StatutFI.NOMSTATUT + "PEIP";

	public StatutPeip(Origin o) {
		super(o);
	}

	/*
	 * un etudiant en peip n'a pas de stage en 5 annee... il n'est pas en 5 eme
	 * annee...
	 */
	@Override
	public boolean stageValable(String nomEnt) {
		return false;
	}

	@Override
	public String toString() {
		return "Élève PeiP \n\tOrigine" + origin;
	}

	/* v�rifie que toutes les donn�es sont pr�sente dans le statut */
	@Override
	public boolean verifStat() {
		if (origin == null)
			return false;

		return true;
	}

	/* Permet de changer de département */
	@Override
	public void setDep(Departement dep) throws StatutException {
		throw new StatutException("un Peip n'a pas de departement");
	}

	/* Permet de récupérer le département */
	@Override
	public Departement getDepartement() throws StatutException {
		throw new StatutException("un Peip n'a pas de departement");
	}

	/*
	 * permet de savoir si un étudiant peut rentrer en Peip en fonction de sa
	 * note au concour.
	 */
	public boolean admissionFIBac(double noteConcour) {
		if (noteConcour > 14)
			return true;
		return false;
	}
}
