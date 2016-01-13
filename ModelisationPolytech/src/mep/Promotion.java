package mep;

import java.util.HashMap;

/* Classe représentant une promotion */
public class Promotion {
/* Année de sortie (de promotion) d'un élève */
    private int anneeSortie;
    private int anneeCourante;
    

	/* Liste des élèves dans la promotion */
    private HashMap<String, Etudiant> etudiantsHT; 

	/* Nom de bapteme de la promotion */
    private String nomBapteme;

    public Promotion(int anneeSortie, String nomBapteme) {
        this.anneeSortie = anneeSortie;
        this.nomBapteme = nomBapteme;
    }

    public int getAnneeSortie() {
        return this.anneeSortie;
    }

    public void setAnneeSortie(int annee) {
        this.anneeSortie = annee;
    }
    
    public int getAnneeCourante() {
  		return anneeCourante;
  	}

  	public void setAnneeCourante(int anneeCourante) {
  		this.anneeCourante = anneeCourante;
  	}


    public String getNomBapteme() {
        return this.nomBapteme;
    }

    public void setNomBapteme(String nom) {
        this.nomBapteme = nom;
    }

	@Override
	public String toString() {
		StringBuilder buff = new StringBuilder();
		etudiantsHT.values().stream().sorted().forEach(etudiant -> buff.append(etudiant.getName()));
		return "Promotion: " + nomBapteme 
				+ "( " + anneeSortie + " )" + "\nListes des élèves de la promo: " + buff.toString();
	}

	/**
	 * @return the etudiantsHT
	 */
	public HashMap<String, Etudiant> getEtudiantsHT() {
		return etudiantsHT;
	}
    
	
	public void addEtudiant(Etudiant e) {
		etudiantsHT.computeIfAbsent(e.getName(), etud -> e);
		
	}
    

}
