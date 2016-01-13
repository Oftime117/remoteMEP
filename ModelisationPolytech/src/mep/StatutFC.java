package mep;

import exceptions.StatutException;

public class StatutFC extends Statut {

	public final static String NOMSTATUT = Statut.NOMSTATUT + "FC";
	private Departement departement;

	private ModeFinancement modeFinancement;

	public StatutFC(Departement departement, ModeFinancement modeFinancement) {
		this.modeFinancement = modeFinancement;
		this.departement = departement;
	}

	@Override
	public Departement getDepartement() throws StatutException{
		return this.departement;
	}

	public ModeFinancement getModeFinancement() {
		return this.modeFinancement;
	}

	public void setModeFinancement(ModeFinancement mode) {
		this.modeFinancement = mode;
	}

	@Override
	public boolean stageValable(String nomEnt) {
		return (this.getModeFinancement().verifieStage(nomEnt));
	}

	/* vérifie que toutes les données sont présente dans le statut */
	@Override
	public boolean verifStat() {

		if (departement == null || !(modeFinancement.verifModeFinance()) )
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "Formation Continue \n\tDepartement: " + departement + "\n\tMode de financement: " + modeFinancement;
	}

	/* Permet de changer de département */
	@Override
	public void setDep(Departement dep) throws StatutException {
		departement = dep;
	}
	
	/*
	 * permet de savoir si un étudiant peut rentrer en Formation continu.
	 */
	public  boolean admissionFC(){
		
		return modeFinancement.verifModeFinance();
	}

}
