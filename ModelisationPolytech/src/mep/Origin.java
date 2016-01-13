package mep;


public abstract class Origin {
	public final static String TYPEORIGIN = "O";
	
    protected String etabOrigin;

/* Diplome d'origine avant l'arrivée à Polytech (on suppose que les post bacs ont eu le Baccalauréat */
    protected String diplome;

    public Origin(String etabOrigin, String diplome) {
        this.etabOrigin = etabOrigin;
        this.diplome = diplome;
    }

    public String getEtabOrigin() {
        return this.etabOrigin;
    }

    public void setEtabOrigin(String etabOrigin) {
        this.etabOrigin = etabOrigin;
    }

    public String getDiplome() {
        return this.diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }
    
    public boolean estCompatibleAvec(Origin origin) {
    	if(this.equals(origin)) return true;
    	if(origin == null) return false;
    	if(origin.getDiplome() != null) {
    		if(this.diplome != null) {
    			if(origin.getDiplome().compareTo(this.diplome) != 0) {return false;}
    		} 
    		else return false;
    	}
    	if(origin.getEtabOrigin() != null) {
    		if(this.getEtabOrigin() != null) {
    			if(origin.getEtabOrigin().compareTo(this.etabOrigin) != 0) return false;
    		} else return false;
    	}
    	return true;
    }



	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Origin))
			return false;
		Origin other = (Origin) obj;
		if (diplome == null) {
			if (other.diplome != null)
				return false;
		} else if (!diplome.equals(other.diplome))
			return false;
		if (etabOrigin == null) {
			if (other.etabOrigin != null)
				return false;
		} else if (!etabOrigin.equals(other.etabOrigin))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "(Diplome: " + diplome + ", Établissement d'origine: " + etabOrigin +")";
	}
    
	public abstract int getAnneeRestante() ;
   
}
