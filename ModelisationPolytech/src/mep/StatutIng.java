package mep;


public abstract class StatutIng extends StatutFI {
    protected Departement departement;

    public Departement getDepartement() {
        return this.departement;
    }

    public void setDepartement(Departement dept) {
        this.departement = dept;
    }
    
    public abstract boolean stageValable(String nomEnt);

}
