package mep;

import java.time.LocalDate;

import exceptions.EtudiantException;
import exceptions.StatutException;

//Classe représentant les Étudiants
public class Etudiant implements Comparable<Etudiant> {


/* Date d'entrée dans l'école */
    private LocalDate dateEntree;

    private String name;
    private boolean redoublant;   

	protected Statut statut;    
    private Promotion promotion;

    public Etudiant(String name, LocalDate dateEntree, Statut s) throws EtudiantException {   
    	try{
    		  /* si le statut est incomplet*/
        	if(s.verifStat() == false) {
        		throw new EtudiantException("Statut incorrecte");
        	}
        	
    	}
    	catch (StatutException StatEx){
    		throw new EtudiantException(StatEx.getMessage());
    	}
        	
    		if(name == null || name.isEmpty()){
    			throw new EtudiantException("Nom incorrect");
    		}
    		
    		if(dateEntree == null || dateEntree.getYear() < 2000){
    			throw new EtudiantException("Date d'entrée incorrect");
    		}
    		
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
		// TODO Auto-generated method stub
		return name.compareTo(o.getName());
	}
    
    
    /* permet de savoir si l'entreprise demande par l'etudiant est correcte ou non face a son cursus*/
    public boolean validationStage5A(String entreprise)
    {
    	/* on verifie d'abords que l'eleve est en 5 eme annee.*/
    	if ( this.getPromotion().getAnneeCourante() == 5)
    		return this.getStatut().stageValable(entreprise);
    	else 
    		return false;
    }

    /*permet de changer de statut pour un peip*/
    public void changeStatutPeip (Statut newStatut) throws EtudiantException
    {
    	try{
    		newStatut.verifStat();
    		//if ()
    		// TODO
    	}
    	catch (StatutException c){
    		throw new EtudiantException(c.getMessage());
    	}
    }
    
  
}
