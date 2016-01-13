package mep;


public class OCyclePrepa extends Origin {
	public final static String TYPEORIGIN = Origin.TYPEORIGIN + "PEIP";
	public OCyclePrepa(String etabOrigin, String diplome) {
		super(etabOrigin, diplome);
	}
	@Override
	public boolean estCompatibleAvec(Origin origin) {
		if(!(origin instanceof OCyclePrepa) || origin == null) return false;
		return super.estCompatibleAvec(origin);
	}
	@Override
	public int getAnneeRestante() {
		// TODO Auto-generated method stub
		return 5;
	}

}
