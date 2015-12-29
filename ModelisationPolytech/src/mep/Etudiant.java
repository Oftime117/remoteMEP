package mep;

import java.util.Date;

//Classe abstraite représentant les Étudiants
public class Etudiant {
/* Date d'entrée dans l'école */
    private Date dateEntree;

    private String name;
    private boolean redoublant;

   

	public Statut statut;
    

    private Promotion promotion;

    public Etudiant(String name, Date dateEntree) {
        this.name = name;
        this.dateEntree = dateEntree;
        this.redoublant = false;
    }

    public Date getDateEntree() {
        return this.dateEntree;
    }

    public void setDateEntree(Date date) {
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
    
    /* permet de savoir si l'entreprise demande par l'etudiant est correcte ou non face a son cursus*/
    public boolean validationStage(String entreprise)
    {
    	return this.getStatut().stageValable(entreprise);
    }
}
