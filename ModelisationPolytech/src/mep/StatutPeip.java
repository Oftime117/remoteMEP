package mep;


public class StatutPeip extends StatutFI {
    public StatutPeip() {
    }

    /* un etudiant en peip n'a pas de stage*/
    public  boolean stageValable(String nomEnt)
    {
    	return false;
    }

}
