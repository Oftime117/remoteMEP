package mep;

import java.util.Date;

//Classe abstraite représentant les Étudiants
public class Etudiant {
/* Date d'entrée dans l'école */
    private Date dateEntree;

    private String name;

	private Statut statut;

    private Promotion promotion;
    
    private boolean redoublant;
    
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

    public Promotion getPromotion() {
        return this.promotion;
    }

    public void setPromotion(Promotion promo) {
        this.promotion = promo;
    }

    public Statut getStatut() {
        return this.statut;
    }

}
