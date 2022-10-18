package JavaHeritage;

public class Sorcier extends Magicien
{
    String batonMagique;

    public Sorcier(String nom,int dureeDeVie, String baguetteMagique ,String batonMagique) {
        super(nom,dureeDeVie,baguetteMagique);
        this.batonMagique = batonMagique;
    }

    public String getBatonMagique() {
        return batonMagique;
    }

    public void setBatonMagique(String batonMagique) {
        this.batonMagique = batonMagique;
    }

    public void rencontrer()
    {
        System.out.printf("tu es un sorcier %s\n", this.getNom());
    }
}
