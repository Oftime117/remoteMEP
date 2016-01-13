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
    /*permet de valider un stage ou non*/
    public abstract boolean stageValable(String nomEnt);
    
    @Override
    public boolean estCompatibleAvec(Statut stat) {
    	if(!(stat instanceof StatutFI)) return false;
    	if(this.equals(stat)) return true;
    	try {
    		StatutFI buff = (StatutFI) stat;
    		if(buff.origin != null){
    			if(this.origin != null) {
    				if(buff.getOrigin().estCompatibleAvec(this.origin) == false) return false;
    			}else return false;
    		}
    		return super.estCompatibleAvec(stat);
    		
    	} catch(ClassCastException e) {
    		return false;
    	}
    }

	@Override
	public boolean verifStat() throws StatutException {
		// TODO Auto-generated method stub
		return false;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
    	if(obj == this) return true;
    	try {
    		StatutFI buff = (StatutFI) obj;
    		return ((this.origin.equals(buff.origin)) && 
    				(super.equals(obj)));
    	} catch (ClassCastException e) {
    		return false;
    	}
	}
    
    
    
}
