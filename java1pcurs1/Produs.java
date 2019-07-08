import java.io.*;
public class Produs implements Serializable{
    public final static long serialVersionUID=1;
    double pret;
    String nume;
    transient String categorie;
    String culoare;
    public Produs(String nume, double pret, String categorie){
        this.nume = nume;
        this.pret = pret;
        this.categorie = categorie;
    }
}