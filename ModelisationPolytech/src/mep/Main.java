package mep;


import java.time.LocalDate;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
	
	/*********************************** Ce qui suit consite � la cr�ation d'une base de donn�es test ***************************** */	
		
		/*************** creation de diff�rentes origines ***************/
		OCyclePrepa opeip1 = new OCyclePrepa("Lycee Mansart", "Bac S");
		OCyclePrepa opeip2 = new OCyclePrepa("Lycee Pergot", "Bac S");
		
		OEtranger oe1 = new OEtranger("University of Cork", "License informatique", "Irlande");
		OEtranger oe2 = new OEtranger("University of Berlin", "License informatique", "Allemagne");
		
		OCycleIng oi1 = new OCycleIng("IUT d'Orsay", "DUT en informatique");
		OCycleIng oi2 = new OCycleIng("Lycee Vaubert", "Prepa Math Sup");
		
		OPostMaitrise opm1 = new OPostMaitrise("Unniversite Paris Sud", "Maitrise en informatique");
		OPostMaitrise opm2 = new OPostMaitrise("Unniversite Paris Ouest", "Maitrise en optronique");
		
		
		/*************** cr�ation de modes de financement ***************/
		MFPF mfpf1 = new MFPF("Peugeot");
		MFCIF mfcif1 = new MFCIF("Organisme de gestion Fran�ais", "Bull");
		MFDE mfde1 = new MFDE();
		MFI mfi1 = new MFI();
		
		/*************** cr�ation de D�partements ***************/
		Departement info = new Departement ("Informatique", true, true, true);
		Departement elec = new Departement ("Electronique", true, false, true);
		Departement fcTest = new Departement ("Formation Continue Departement Test", false, true, false);
		
		/*************** cr�ation de statuts ***************/
		
		/* Statuts prepa integre*/
		StatutPeip speip1 = new StatutPeip(opeip1);
		StatutPeip speip2 = new StatutPeip(opeip2);
		
		/* Statuts etudiant en formation classique */
		StatutET seti1 = new StatutET(oe1, info);
		StatutET seti2 = new StatutET(oi1, info);
		StatutET seti3 = new StatutET(opm1, info);
		StatutET seti4 = new StatutET(oe2, info);
		StatutET seti5 = new StatutET(oi2, info);
		StatutET seti6 = new StatutET(opm2, info);
		
		StatutET sete1 = new StatutET(oe1, elec);
		StatutET sete2 = new StatutET(oi1, elec);
		StatutET sete3 = new StatutET(opm1, elec);
		StatutET sete4 = new StatutET(oe2, elec);
		StatutET sete5 = new StatutET(oi2, elec);
		StatutET sete6 = new StatutET(opm2, elec);

		// normalement impossible (definition du departement)
		StatutET setfc1 = new StatutET(oe1, fcTest); 
		
		/* Statuts etudiant en apprentissage */
		StatutAPP sappi1 = new StatutAPP(oe1, info, "Lego");
		StatutAPP sappi2 = new StatutAPP(oi1, info, "MSI");
		StatutAPP sappi3 = new StatutAPP(opm1, info, "Hachette");
		StatutAPP sappi4 = new StatutAPP(oe2, info, "Yamaha");
		StatutAPP sappi5 = new StatutAPP(opm2, info, "Bungie");
		StatutAPP sappi6 = new StatutAPP(opm2, info, "Sony");
		
		StatutAPP sappe1 = new StatutAPP(oe1, elec, "Google");
		StatutAPP sappe2 = new StatutAPP(oi1, elec, "Windows");
		StatutAPP sappe3 = new StatutAPP(opm1, elec, "Apple");
		StatutAPP sappe4 = new StatutAPP(oe2, elec, "Samsung");
		StatutAPP sappe5 = new StatutAPP(opm2, elec, "Robots");
		StatutAPP sappe6 = new StatutAPP(opm2, elec, "LG");
		
		// normalement impossible (definition du departement)
		StatutAPP sappfc1 = new StatutAPP(oe1, fcTest, "Lego");
		
		/* Statut etudiant en formation continu */
		StatutFC sfci1 = new StatutFC(info, mfpf1);
		StatutFC sfci2 = new StatutFC(info, mfcif1);
		StatutFC sfci3 = new StatutFC(info, mfde1);
		StatutFC sfci4 = new StatutFC(info, mfi1);
		
		// normalement impossible (definition du departement)
		StatutFC sfce1 = new StatutFC(elec, mfpf1);
		
		StatutFC sfcf1 = new StatutFC(fcTest, mfpf1);
		StatutFC sfcf2 = new StatutFC(fcTest, mfcif1);
		StatutFC sfcf3 = new StatutFC(fcTest, mfde1);
		StatutFC sfcf4 = new StatutFC(fcTest, mfi1);
		
		/********************* Creation des Etudiants ************************/
		
		
		/********** etudiant en peip **********/
		
		
		Etudiant e1 = new Etudiant("Tom", LocalDate.parse("2014-09-15"));
		e1.changeStatut(speip1);
		
		Etudiant e2 = new Etudiant("Tim", LocalDate.parse("2014-09-15"));
		e2.changeStatut(speip1);
		
		Etudiant e3 = new Etudiant("Tam", LocalDate.parse("2014-09-15"));
		e3.changeStatut(speip2);
		
		Etudiant e4 = new Etudiant("Tum", LocalDate.parse("2014-09-15"));
		e4.changeStatut(speip2);
		
		/********** etudiant en ing classique **********/
		Etudiant e5 = new Etudiant("Amin", LocalDate.parse("2013-09-15"));
		e5.changeStatut(seti1);
		
		Etudiant e6 = new Etudiant("Raph", LocalDate.parse("2013-09-15"));
		e6.changeStatut(seti2);
		
		Etudiant e7 = new Etudiant("Florian", LocalDate.parse("2013-09-15"));
		e7.changeStatut(seti3);
		
		Etudiant e8 = new Etudiant("Thomas", LocalDate.parse("2012-09-15"));
		e8.changeStatut(seti4);
		
		Etudiant e9 = new Etudiant("Jean", LocalDate.parse("2012-09-15"));
		e9.changeStatut(seti5);
		
		Etudiant e10 = new Etudiant("Kevin", LocalDate.parse("2012-09-15"));
		e10.changeStatut(seti6);
		
		Etudiant e11 = new Etudiant("Amirali", LocalDate.parse("2011-09-15"));
		e11.changeStatut(sete1);
		
		Etudiant e12 = new Etudiant("Suzette", LocalDate.parse("2011-09-15"));
		e12.changeStatut(sete2);
		
		Etudiant e13 = new Etudiant("Colette", LocalDate.parse("2011-09-15"));
		e13.changeStatut(sete3);
		
		Etudiant e14 = new Etudiant("Funes", LocalDate.parse("2010-09-15"));
		e14.changeStatut(sete4);
		
		Etudiant e15 = new Etudiant("Louis", LocalDate.parse("2011-09-15"));
		e15.changeStatut(sete5);
		
		Etudiant e16 = new Etudiant("Albert", LocalDate.parse("2011-09-15"));
		e16.changeStatut(sete6);
		
		/********** etudiant en ing apprentissage **********/
		Etudiant e17 = new Etudiant("Windy", LocalDate.parse("2014-09-15"));
		e17.changeStatut(sappi1);
		
		Etudiant e18 = new Etudiant("Chloe", LocalDate.parse("2014-09-15"));
		e18.changeStatut(sappi2);
		
		Etudiant e19 = new Etudiant("Peter", LocalDate.parse("2014-09-15"));
		e19.changeStatut(sappi3);
		
		Etudiant e20 = new Etudiant("Ryan", LocalDate.parse("2014-09-15"));
		e20.changeStatut(sappi4);
		
		Etudiant e21 = new Etudiant("David", LocalDate.parse("2013-09-15"));
		e21.changeStatut(sappi5);
		
		Etudiant e22 = new Etudiant("Nath", LocalDate.parse("2013-09-15"));
		e22.changeStatut(sappi6);
		
		Etudiant e23 = new Etudiant("Jamel", LocalDate.parse("2013-09-15"));
		e23.changeStatut(sappe1);
		
		Etudiant e24 = new Etudiant("Tristant", LocalDate.parse("2013-09-15"));
		e24.changeStatut(sappe2);
		
		Etudiant e25 = new Etudiant("Gaetan", LocalDate.parse("2012-09-15"));
		e25.changeStatut(sappe3);
		
		Etudiant e26 = new Etudiant("Xavier", LocalDate.parse("2012-09-15"));
		e26.changeStatut(sappe4);
		
		Etudiant e27 = new Etudiant("Emma", LocalDate.parse("2012-09-15"));
		e27.changeStatut(sappe5);
		
		Etudiant e28 = new Etudiant("Luc", LocalDate.parse("2012-09-15"));
		e28.changeStatut(sappe6);
		
		/********** etudiant en Formation continu **********/
		Etudiant e29 = new Etudiant("Kylo", LocalDate.parse("2013-09-15"));
		e29.changeStatut(sfci1);
		
		Etudiant e30 = new Etudiant("Jafar", LocalDate.parse("2013-09-15"));
		e30.changeStatut(sfci2);
		
		Etudiant e31 = new Etudiant("Aladin", LocalDate.parse("2013-09-15"));
		e31.changeStatut(sfci3);
		
		Etudiant e32 = new Etudiant("Foxy",	LocalDate.parse("2013-09-15"));
		e32.changeStatut(sfci4);
		
		Etudiant e33 = new Etudiant("Math", LocalDate.parse("2014-09-15"));
		e33.changeStatut(sfcf1);
		
		Etudiant e34 = new Etudiant("Shu", LocalDate.parse("2014-09-15"));
		e34.changeStatut(sfcf2);
		
		Etudiant e35 = new Etudiant("Zhang", LocalDate.parse("2014-09-15"));
		e35.changeStatut(sfcf3);
		
		Etudiant e36 = new Etudiant("Moi", LocalDate.parse("2014-09-15"));
		e36.changeStatut(sfcf4);
		
		/*************  creation de l'ecole ***************/
		HashSet<Etudiant> listEt = new HashSet<Etudiant> ();
		
		listEt.add(e1); listEt.add(e2); listEt.add(e3); listEt.add(e4); listEt.add(e5);
		listEt.add(e6); listEt.add(e7); listEt.add(e8); listEt.add(e9); listEt.add(e10);
		listEt.add(e11); listEt.add(e12); listEt.add(e13); listEt.add(e14); listEt.add(e15);
		listEt.add(e16); listEt.add(e17); listEt.add(e18); listEt.add(e19); listEt.add(e20);
		listEt.add(e21); listEt.add(e22); listEt.add(e23); listEt.add(e24); listEt.add(e25); 
		listEt.add(e26); listEt.add(e27); listEt.add(e28); listEt.add(e29); listEt.add(e30); 
		listEt.add(e31); listEt.add(e32); listEt.add(e33); listEt.add(e34); listEt.add(e35); 
		listEt.add(e36); 
		
		//PolytechPSUD ecole = new PolytechPSUD(listEt);
	}

}
