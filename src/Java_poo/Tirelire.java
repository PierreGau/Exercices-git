package Java_poo;

public class Tirelire
{
    private double argent;

    public Tirelire(double argent)
    {
        if(argent > 0)
            this.argent = argent;
        else
            this.argent = 0;
    }

    public Tirelire()
    {
        this(0);
    }

    public void afficher()
    {
        if(argent == 0)
            System.out.println("Vous êtes sans le sou");
        else
            System.out.printf("Vous avez : %.2f$ dans votre tirelire\n", argent);
    }

    public double getMontant()
    {
        return argent;
    }

    public void secouer()
    {
        if(argent>0)
            System.out.println("bing bing");
    }

    public void remplir(double montant)
    {
        if(montant > 0)
            argent+=montant;
    }

    public void vider()
    {
        argent = 0;
    }

    public void puiser(double montant)
    {
        if(montant > 0)
        {
            argent -= montant;

            if(argent < 0)
                argent = 0;
        }
    }

    public double calculerSolde(double montant)
    {
        double reste = argent - montant;

        if(reste >= 0)
            return reste;

        return argent;
    }

}
