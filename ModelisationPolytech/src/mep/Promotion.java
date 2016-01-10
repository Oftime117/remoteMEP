package mep;


/* Classe représentant une promotion */
public class Promotion {
/* Année de sortie (de promotion) d'un élève */
    private int anneeSortie;
    public int anneeCourante;

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

    public String getNomBapteme() {
        return this.nomBapteme;
    }

    public void setNomBapteme(String nom) {
        this.nomBapteme = nom;
    }

}
