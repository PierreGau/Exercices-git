package JavaHeritage;

public class Voiture extends Vehicule
{
    public Voiture(String modele, int année, double prix) {
        super(modele,  année, prix);
    }

    @Override
    public void demarer()
    {
        System.out.println("Vroum vroum vous démarrez la voiture");
        this.setIsOn(true);
    }

    @Override
    public void accelerer()
    {
        if(this.isOn())
            System.out.println("Vroum vroum vous accélérez à fond les ballons");
        else
            System.out.println("Veuillez démarer le véhicule");
    }
}
