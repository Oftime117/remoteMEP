package mep;

import java.util.HashMap;

/* Classe représentant une promotion */
public class Promotion {
/* Année de sortie (de promotion) d'un élève */
    private int anneeSortie;
    private int anneeCourante;
    
  

	/* Liste des élèves dans la promotion (la clé est leur name) */
    private HashMap<String, Etudiant> etudiantsHM; 

	/* Nom de bapteme de la promotion */
    private String nomBapteme;

    public Promotion(int anneeSortie, int anneeCourante, String nomBapteme) {
        this.anneeSortie = anneeSortie;
        this.nomBapteme = nomBapteme;
        this.anneeCourante = anneeCourante;
        etudiantsHM = new HashMap<String, Etudiant>();
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
		etudiantsHM.values().stream().sorted().forEach(etudiant -> {
			
			buff.append(etudiant.getName());
			buff.append(", ");
		});
		return  nomBapteme 
				+ "( " + anneeSortie + " )" + "\nListes des élèves de la promo: " + buff.toString();
	}

	/**
	 * @return the etudiantsHM
	 */
	public HashMap<String, Etudiant> getEtudiantsHM() {
		return etudiantsHM;
	}
    
	
	public void addEtudiant(Etudiant e) {
		etudiantsHM.computeIfAbsent(e.getName(), etud -> e);
		
	}
    

}
