package mep;

import exceptions.StatutException;

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
    
    
}
