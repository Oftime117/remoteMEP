package mep;


public abstract class Statut {
/* Variable valant vrai si l'Ã©tudiant Ã  redoublÃ© une fois */
    protected boolean redoublant;

    public boolean isRedoublant() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.redoublant;
    }

    public void setRedoublant(boolean value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.redoublant = value;
    }
    
    /*permet de valider un stage ou non*/
    public abstract boolean stageValable(String nomEnt);
    
    /*accorde la possibilite d'un changement de statut ou non*/
    public abstract boolean changementStatut(Statut newStatut);
    
    /*vérifie que toutes les données sont présente dans le statut*/
    public abstract boolean verifStat();

}
