package mep;


public abstract class StatutFI extends Statut {
    protected Origin origin;
    
    public StatutFI(Origin o) {
    	this.origin = o;
    }

    public Origin getOrigin() {
        return this.origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }
    /*permet de valider un stage ou non*/
    public abstract boolean stageValable(String nomEnt);
    
    /*accorde la possibilite d'un changement de statut ou non*/
    public abstract boolean changementStatut(Statut newStatut);
}
