package ghaziperrin;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

import javax.sound.midi.MidiDevice.Info;

import org.omg.Messaging.SyncScopeHelper;

import exceptions.EtudiantException;
import mep.Departement;
import mep.Etudiant;
import mep.MFCIF;
import mep.MFDE;
import mep.MFI;
import mep.MFPF;
import mep.ModeFinancement;
import mep.OCycleIng;
import mep.OCyclePrepa;
import mep.OEtranger;
import mep.OPostMaitrise;
import mep.PolytechPSUD;
import mep.Statut;
import mep.StatutAPP;
import mep.StatutET;
import mep.StatutFC;
import mep.StatutPeip;

public class MainMethod {


	public static void main(String[] args) {
	
		ArrayList<String> depForm = new ArrayList<String>(3);
		
		

		

		/*********************************** Ce qui suit consite à la création d'une base de données test ***************************** */	
			
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
			Departement info = Departement.addNewDepartement ("Informatique", depForm);
			Departement elec = Departement.addNewDepartement ("Electronique", depForm);
			Departement fcTest = Departement.addNewDepartement ("Formation Continue Departement Test", depForm);
			
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
			Etudiant e1, e2, e3, e4, e5, e6,
			e7, e8, e9, e10, e11, e12, e13,
			e14, e15, e16, e17, e18, e19, e20,
			e21, e22, e23, e24, e25, e26, e27,
			e28, e29, e30, e31, e32, e33, e34,
			e35, e36;
			
			
			
			try{
				/********** etudiant en peip **********/
				
				e1 = new Etudiant("Tom", LocalDate.parse("2014-09-15"), speip1);
				
				 e2 = new Etudiant("Tim", LocalDate.parse("2014-09-15"), speip1);
				
				 e3 = new Etudiant("Tam", LocalDate.parse("2014-09-15"), speip2);
				
				 e4 = new Etudiant("Tum", LocalDate.parse("2014-09-15"), speip2);
				
				/********** etudiant en ing classique **********/
				 e5 = new Etudiant("Amin", LocalDate.parse("2013-09-15"), seti1);
				
				 e6 = new Etudiant("Raph", LocalDate.parse("2013-09-15"), seti2);
				
				 e7 = new Etudiant("Florian", LocalDate.parse("2013-09-15"), seti3);
				
				 e8 = new Etudiant("Thomas", LocalDate.parse("2012-09-15"), seti4);
				
				 e9 = new Etudiant("Jean", LocalDate.parse("2012-09-15"), seti5);
				
				 e10 = new Etudiant("Kevin", LocalDate.parse("2012-09-15"), seti6);
				
				 e11 = new Etudiant("Amirali", LocalDate.parse("2011-09-15"), sete1);
				
				 e12 = new Etudiant("Suzette", LocalDate.parse("2011-09-15"), sete2);
				
				 e13 = new Etudiant("Colette", LocalDate.parse("2011-09-15"), sete3);
				
				 e14 = new Etudiant("Funes", LocalDate.parse("2010-09-15"), sete4);
				
				 e15 = new Etudiant("Louis", LocalDate.parse("2011-09-15"), sete5);
				
				 e16 = new Etudiant("Albert", LocalDate.parse("2011-09-15"), sete6);
				
				/********** etudiant en ing apprentissage **********/
				 e17 = new Etudiant("Windy", LocalDate.parse("2014-09-15"), sappi1);
				
				 e18 = new Etudiant("Chloe", LocalDate.parse("2014-09-15"), sappi2);
				
				 e19 = new Etudiant("Peter", LocalDate.parse("2014-09-15"), sappi3);
				
				 e20 = new Etudiant("Ryan", LocalDate.parse("2014-09-15"), sappi4);
				
				 e21 = new Etudiant("David", LocalDate.parse("2013-09-15"), sappi5);
				
				 e22 = new Etudiant("Nath", LocalDate.parse("2013-09-15"), sappi6);
				
				 e23 = new Etudiant("Jamel", LocalDate.parse("2013-09-15"), sappe1);
				
				 e24 = new Etudiant("Tristant", LocalDate.parse("2013-09-15"), sappe2);
				
				 e25 = new Etudiant("Gaetan", LocalDate.parse("2012-09-15"), sappe3);
				
				 e26 = new Etudiant("Xavier", LocalDate.parse("2012-09-15"), sappe4);
				
				 e27 = new Etudiant("Emma", LocalDate.parse("2012-09-15"), sappe5);
				
				 e28 = new Etudiant("Luc", LocalDate.parse("2012-09-15"), sappe6);
				
				/********** etudiant en Formation continu **********/
				 e29 = new Etudiant("Kylo", LocalDate.parse("2013-09-15"), sfci1);
				
				 e30 = new Etudiant("Jafar", LocalDate.parse("2013-09-15"), sfci2);
				
				 e31 = new Etudiant("Aladin", LocalDate.parse("2013-09-15"), sfci3);
				
				 e32 = new Etudiant("Foxy",	LocalDate.parse("2013-09-15"), sfci4);
				
				 e33 = new Etudiant("Math", LocalDate.parse("2014-09-15"), sfcf1);
				
				 e34 = new Etudiant("Shu", LocalDate.parse("2014-09-15"), sfcf2);
				
				 e35 = new Etudiant("Zhang", LocalDate.parse("2014-09-15"), sfcf3);
				
				 e36 = new Etudiant("Moi", LocalDate.parse("2014-09-15"), sfcf4);
				 
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
					
					
				
			}
			catch (EtudiantException e) {
				
			}
			
	}
	
}
