package mep;

import exceptions.StatutException;

public abstract class StatutFI extends Statut {
    protected Origin origin;
    
    public final static String NOMSTATUT = Statut.NOMSTATUT + "FI"; 
    
    public StatutFI(Origin o) {
    	this.origin = o;
    }

    public Origin getOrigin() {
        return this.origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }
        
    
}
