package JavaHeritage;

public class Magicien extends Classe
{
    String baguetteMagique;

    public Magicien(String nom, int dureeDdeVie, String baguetteMagique) {
        super(nom,dureeDdeVie);
        this.baguetteMagique = baguetteMagique;
    }

    public String getBaguetteMagique() {
        return baguetteMagique;
    }

    public void setBaguetteMagique(String baguetteMagique) {
        this.baguetteMagique = baguetteMagique;
    }

    @Override
    public void rencontrer() {
        System.out.println("Je suis un Magicien et je m'appelle " + this.getNom());
    }
}
