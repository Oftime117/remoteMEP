package ghaziperrin;

import mep.*;

public class MainMethod {


	public static void main(String[] args) {
		Departement departement = new Departement("Informatique", true, true, true);
		ModeFinancement modeFinancement = new MFCIF("caca", "boudin");
		StatutFC fc = new StatutFC(departement, modeFinancement);
		System.out.println(fc.toString());
		
		PolytechPSUD polytech = PolytechPSUD.getInstance();
		
	}

}
