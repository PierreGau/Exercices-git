package JavaHeritage;

import java.util.Date;

public abstract class Vehicule
{
    private String modele;
    private int matricule;
    private int annee;
    private double prix;
    private boolean isOn;
    private static int vehiculeNumber = 0;

    public Vehicule(String modele, int année, double prix) {
        this.modele = modele;
        this.matricule = vehiculeNumber;
        this.annee = année;
        this.prix = prix;
        isOn = false;
        vehiculeNumber++;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public int getAnnée() {
        return annee;
    }

    public void setAnnée(int année) {
        this.annee = année;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public static int getVehiculeNumber() {
        return vehiculeNumber;
    }

    public static void setVehiculeNumber(int vehiculeNumbre) {
        Vehicule.vehiculeNumber = vehiculeNumbre;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setIsOn(boolean on) {
        isOn = on;
    }

    public abstract void demarer();
    public abstract void accelerer();

    public String toString()
    {
        return String.format("Modèle : %s\nAnnée : %d\nMatricule : %s\nPrix : %.2f$",modele, annee,matricule,prix);
    }
}
