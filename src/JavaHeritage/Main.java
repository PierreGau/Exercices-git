package JavaHeritage;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Guerrier jean = new Guerrier("Jean", 50, "Epee longue");
        jean.rencontrer();

        Sorcier jose = new Sorcier("José", 28, "Baguette de frêne", "Bâton de pouvoir");
        jose.rencontrer();

        var psyduck = new Magicien("Psyduck", 30, "Baguette en chêne");
        psyduck.rencontrer();

        Voiture mazda = new Voiture("Mazda Mx5", 1994, 20000);
        Voiture Honda = new Voiture("Honda Civic", 2014, 25000);
        Voiture Renault = new Voiture("Renault Clio", 2011, 10000);

        Camion tutut = new Camion("Renault Transport", 2004, 50000);

        System.out.println(tutut.toString());
        System.out.println(mazda.toString());
        System.out.println(Honda.toString());
        System.out.println(Renault.toString());

        tutut.demarer();
    }
}
