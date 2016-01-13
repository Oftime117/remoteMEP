package mep;


public class OPostMaitrise extends Origin {
	public final static String TYPEORIGIN = Origin.TYPEORIGIN + "O";
	public OPostMaitrise(String etabOrigin, String diplome) {
		super(etabOrigin, diplome);
	}
	@Override
	public boolean estCompatibleAvec(Origin origin) {
		if(!(origin instanceof OPostMaitrise) || origin == null) return false;
		return super.estCompatibleAvec(origin);
	}
	@Override
	public int getAnneeRestante() {
		// TODO Auto-generated method stub
		return 2;
	}
	
	
}
