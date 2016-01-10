package mep;

import java.util.HashSet;
import java.util.List;

public class PolytechPSUD {
    private HashSet<Etudiant> etudiants = new HashSet<Etudiant> ();

    public PolytechPSUD(HashSet<Etudiant> etudiants) {
    }
    /*
    public void changementDAnnee(HashSet<Etudiant> [] nonRedoublant)
    {
    	HashSet<Etudiant> redoublant = etudiants;
    	int taille = nonRedoublant.length;
    	if(taille != 5) 
    	{
    		System.err.println("Tableau non conforme à la définition");
    		return;
    	}
    	
    	for (int i =0; i< taille; i++)
    	{
    		for(Etudiant a : nonRedoublant[i] )
    		{
    			redoublant.remove(a);
    		}
    	}
    	
    	for(Etudiant a : redoublant)
    	{
    		
    	}
    }*/

}
