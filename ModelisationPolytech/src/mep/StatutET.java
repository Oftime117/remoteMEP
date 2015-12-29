package mep;


public class StatutET extends StatutIng {
	
	/* un etudiant en cursus initial et non alternant peux aller dans n'importe qu'elle entreprise*/
	public  boolean stageValable(String nomEnt)
	{
		return true;
	}
}
