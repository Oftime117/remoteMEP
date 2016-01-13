package mep;

import exceptions.StatutException;

public abstract class Statut {
	public final static String NOMSTATUT = "STATUT";
	/* Variable valant vrai si l'étudiant à redoublé une fois */
	protected boolean redoublant;

	public boolean isRedoublant() {
		// Automatically generated method. Please delete this comment before
		// entering specific code.
		return this.redoublant;
	}

	public void setRedoublant(boolean value) {
		// Automatically generated method. Please delete this comment before
		// entering specific code.
		this.redoublant = value;
	}

	/* permet de valider un stage ou non */
	public abstract boolean stageValable(String nomEnt);

	/* v�rifie que toutes les donn�es sont pr�sente dans le statut */
	public abstract boolean verifStat();

	/* Permet de changer de département */
	public abstract void setDep(Departement dep) throws StatutException;
	
	/* Permet de récupérer le département*/
	public abstract Departement getDepartement() throws StatutException;
}
