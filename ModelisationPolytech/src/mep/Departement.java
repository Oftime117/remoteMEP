package mep;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class Departement {
	private String nomDept;

	private ArrayList<String> formationsList;

	private final static ConcurrentHashMap<String, Departement> depHM = new ConcurrentHashMap<String, Departement>();

	private Departement(String nomDept, ArrayList<String> formationsList) {
		this.nomDept = nomDept;
		formationsList.forEach(name -> name = name.toUpperCase());
		this.formationsList = formationsList;
	}

	/* Seule façon de créer un nouveau département */
	public static Departement addNewDepartement(String nomDept,
			ArrayList<String> formationsList) throws NullPointerException,
			IllegalArgumentException { /*
									    * throws non obligatoire car unchecked
									    * exceptions
									    */

		/*
		 * Si le string nomDept est vaut null, on empêche sa création en jetant
		 * une exception, étant donné que HashMap n'accepte qu'une clé null, on
		 * décide nous de le refuser complétement
		 */
		if (nomDept == null) {
			throw new NullPointerException("Le nom du département est NULL");
		}

		/*
		 * Si le nom est vide ou le département existe déjà on renvoie une
		 * exception
		 */
		if (nomDept.isEmpty() || depHM.containsKey(nomDept.toUpperCase())) {
			throw new IllegalArgumentException(
					"Valeur du nom de département invalide");
		}

		/* Ajout du nouveau département dans la liste des départements */
		Departement newDept = new Departement(nomDept, formationsList);
		depHM.put(nomDept.toUpperCase(), newDept);

		return newDept;
	}

	/* Permet de récupérer l'unique instance de département avec le nom "nom" */
	public static Departement getDepartement(String nom)
			throws IllegalArgumentException {
		if (!depHM.containsKey(nom.toUpperCase())) {
			throw new IllegalArgumentException("Département non existant");
		}
		return depHM.get(nom.toUpperCase());
	}

	/* Affiche tous les départements à l'écran */
	public static void printAllDepts() {
		depHM.values()
				.stream()
				.sorted((Departement d1, Departement d2) -> d1.getNomDept()
						.compareTo(d2.getNomDept()))
				.forEach(dep -> System.out.println(dep));
	}

	public String getNomDept() {
		return this.nomDept;
	}

	public boolean isDispoFormation(String formationName) {
		return formationsList.contains(formationName);
	}

	@Override
	public String toString() {
		StringBuilder buff = new StringBuilder();
		if (formationsList.isEmpty())
			buff.append("Aucune");
		else
			formationsList.forEach(formName -> buff.append(formName));
		return nomDept + " (Formations : " + buff.toString() + ")";
	}

	@Override
	public boolean equals(Object obj) {
		return this == obj;
	}

	
}
