package JavaHeritage;

public class Guerrier extends Classe
{
    String arme;

    public Guerrier(String nom, int dureeDeVie, String arme) {
        super(nom);
        super.setDureeDeVie(dureeDeVie);
        this.arme  = arme;
    }

    public String getArme() {
        return arme;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }

    public void rencontrer()
    {
        super.rencontrer();
        System.out.printf("Je suis un guerrier doté de %d points de vie et armé d'une %s\n", this.getDureeDeVie(), arme);
    }
}
