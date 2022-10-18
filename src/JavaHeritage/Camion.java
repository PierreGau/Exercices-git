package JavaHeritage;

public class Camion extends Vehicule
{
    public Camion(String modele,  int année, double prix) {
        super(modele, année, prix);
    }

    @Override
    public void demarer()
    {
        System.out.println("BROUM BROUM vous démarrez le camion");
        this.setIsOn(true);
    }

    @Override
    public void accelerer()
    {
        if(this.isOn())
            System.out.println("BROUM BROUM vous accélérez mais pas trop vite quand même");
        else System.out.println("Démare avant !");
    }
}
