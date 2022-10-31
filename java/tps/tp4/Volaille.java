package java.tps.tp4;

public abstract class Volaille{
    private double prix;
    private double poidVolailleDonnee;
    private double poidAbat;

    private int id;

    public Volaille(int id, double prix, double poidVolailleDonnee, double poidAbat){
        this.id = id;
        this.prix = prix;
        this.poidVolailleDonnee = poidVolailleDonnee;
        this.poidAbat = poidAbat;
    }
    
}
