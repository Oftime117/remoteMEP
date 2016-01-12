package ghaziperrin;

import java.util.ArrayList;

import mep.*;

public class MainMethod {


	public static void main(String[] args) {
		
		ArrayList<String> depForm = new ArrayList<String>(3);
		
		
		Departement departement = Departement.addNewDepartement("Informatique", depForm);
		ModeFinancement modeFinancement = new MFCIF("caca", "boudin");
		StatutFC fc = new StatutFC(departement, modeFinancement);
		System.out.println(fc.toString());
		
		PolytechPSUD polytech = PolytechPSUD.getInstance();
		
		
		
		System.out.println("\n\n\n");
		//new Departement("Matériaux", true, false, false);
		Departement.printAllDepts();
	}

}
