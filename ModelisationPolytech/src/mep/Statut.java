package mep;


public abstract class Statut {
/* Variable valant vrai si l'étudiant à redoublé une fois */
    protected boolean redoublant;

    public boolean isRedoublant() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.redoublant;
    }

    public void setRedoublant(boolean value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.redoublant = value;
    }
    
    public abstract boolean stageValable(String nomEnt);

}
