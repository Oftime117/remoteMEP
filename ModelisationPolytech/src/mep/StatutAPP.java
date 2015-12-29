package mep;


public class StatutAPP extends StatutIng {
    private String nomEntreprise;

    public StatutAPP() {
    }

    public String getNomEntreprise() {
        return this.nomEntreprise;
    }

    public void setNomEntreprise(String nom) {
        this.nomEntreprise = nom;
    }
    
    public  boolean stageValable(String nomEnt)
    {
    	if(nomEnt.compareTo(nomEntreprise) == 0)
    		return true;
    	else
    		return false;
    }

}
