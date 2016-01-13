package mep;


public class OEtranger extends Origin {
	public final static String TYPEORIGIN = Origin.TYPEORIGIN + "ETR";
	/* Pays d'origine */
    private String pays;

    
    public OEtranger(String etabOrigin, String diplome, String p) {
		super(etabOrigin, diplome);
		this.pays = p;
	}
    
    public String getPays() {
        return this.pays;
    }
    public void setPays(String p) {
        this.pays = p;
    }
    
    public boolean estCompatibleAvec(Origin origin) {
    	if(this.equals(origin)) return true;
    	if(origin == null) return false;
    	try {
        	OEtranger originBuff = (OEtranger) origin;
        	if(originBuff.getPays() != null) {
        		if(this.pays != null) {
        			if(originBuff.getPays().compareTo(this.pays) != 0) return false;
        		} else return false;
        	}
    	} catch(ClassCastException | NullPointerException e) {
    		return false;
    	}
    	return super.estCompatibleAvec(origin);
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof OEtranger))
			return false;
		OEtranger other = (OEtranger) obj;
		if (pays == null) {
			if (other.pays != null)
				return false;
		} else if (!pays.equals(other.pays))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return pays + super.toString();
	}

	@Override
	public int getAnneeRestante() {
		// TODO Auto-generated method stub
		return 2;
	}
    
	
    
}
