package mep;


public class OCycleIng extends Origin {
	public final static String TYPEORIGIN = Origin.TYPEORIGIN + "ING";
	public OCycleIng(String etabOrigin, String diplome) {
		super(etabOrigin, diplome);
	}

	@Override
	public boolean estCompatibleAvec(Origin origin) {
		if(!(origin instanceof OCycleIng) || origin == null) return false;
		return super.estCompatibleAvec(origin);
	}

	@Override
	public int getAnneeRestante() {
		// TODO Auto-generated method stub
		return 3;
	}
	
	
}
