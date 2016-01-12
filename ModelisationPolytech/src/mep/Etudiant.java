package mep;

import java.time.LocalDate;

//Classe représentant les Étudiants
public class Etudiant implements Comparable<Etudiant> {


/* Date d'entrée dans l'école */
    private LocalDate dateEntree;

    private String name;
    private boolean redoublant;

	private Statut statut;
    private Promotion promotion;

    
    public Etudiant(String name, LocalDate dateEntree) {

        this.name = name;
        this.dateEntree = dateEntree;
        this.redoublant = false;
    }

    public LocalDate getDateEntree() {
        return this.dateEntree;
    }

    public void setDateEntree(LocalDate date) {
        this.dateEntree = date;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String nom) {
        this.name = nom;
    }
    
    public boolean isRedoublant() {
		return redoublant;
	}

	public void setRedoublant(boolean redoublant) {
		this.redoublant = redoublant;
	}

    public Promotion getPromotion() {
        return this.promotion;
    }

    public void setPromotion(Promotion promo) {
        this.promotion = promo;
    }

    public Statut getStatut() {
        return this.statut;
    }

	@Override
	public String toString() {
		return name + "\n\tDate d'entrée: " + dateEntree
				+ "\n\tStatut : " + statut 
				+ "\n\tPromotion : " + promotion
				+ "\n\tEst un redoublant : " + redoublant;
	}

	@Override
	public int compareTo(Etudiant o) {
		return name.compareTo(o.getName());
	}
    
    
    
    /* permet de savoir si l'entreprise demande par l'etudiant est correcte ou non face a son cursus*/
    public boolean validationStage5A(String entreprise)
    {
    	/* on verifie d'abords que l'eleve est en 5 eme annee.*/
//    	if ( this.getPromotion().anneeCourante == 5)
//    		return this.getStatut().stageValable(entreprise);
//    	else 
    		return false;
    }
    
    /*permet de changer de statut*/
    public boolean changeStatut (Statut newStatut)
    {
    	/* si le statut est incomplet*/
    	if(newStatut.verifStat() != true) return false;
 
    	/*premiere inscription dans l'ecole*/
    	if(statut == null)
    	{
    			statut = newStatut;
    			return true;
    	}
    	else
    	{
    		boolean res = getStatut().changementStatut(newStatut);
        	
        	if(res)
        		statut = newStatut;
        	return res;
    	}
    	
    }
}
