package JavaHeritage;

public class Main
{
    public static void main(String[] args)
    {
        Guerrier jean = new Guerrier("Jean", 50, "Epee longue");
        jean.rencontrer();

        Sorcier jose = new Sorcier("José");
        jose.rencontrer();

        var psyduck = new Magicien("Psyduck");
        psyduck.rencontrer();
    }
}
