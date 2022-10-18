package JavaHeritage;

public class Classe
{
    private String nom;
    private int dureeDeVie;

    public Classe(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }

    public void setDureeDeVie(int dureeDeVie) {
        this.dureeDeVie = dureeDeVie;
    }

    public void rencontrer()
    {
        System.out.println("Bonjour je suis " + nom);
    }
}
