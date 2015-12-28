package mep;


public abstract class StatutFI extends Statut {
    protected Origin origin;

    public Origin getOrigin() {
        return this.origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

}
