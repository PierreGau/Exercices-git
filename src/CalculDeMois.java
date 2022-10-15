import java.util.Scanner;

public class CalculDeMois
{
    public static void main(String[] _args)
    {
        Scanner keyboardImput = new Scanner(System.in);

        System.out.print("Mois : ");
        int mois = keyboardImput.nextInt();

        if(mois < 1 || mois > 12)
            System.out.println("Résultat invalide");
        else if(mois == 1)
            System.out.println("Janvier");
        else if(mois == 2)
            System.out.println("Février");
        else if(mois == 3)
            System.out.println("Mars");
        else if(mois == 4)
            System.out.println("Avril");
        else if(mois == 5)
            System.out.println("Mai");
        else if(mois == 6)
            System.out.println("Juin");
        else if(mois == 7)
            System.out.println("Juillet");
        else if(mois == 8)
            System.out.println("Aout");
        else if(mois == 9)
            System.out.println("Septembre");
        else if(mois == 10)
            System.out.println("Octobre");
        else if(mois == 11)
            System.out.println("Novembre");
        else if(mois == 12)
            System.out.println("Décembre");

    }
}
