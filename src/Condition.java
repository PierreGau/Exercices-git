import java.util.Scanner;

public class Condition
{
    public static void main(String[] _args)
    {
        Scanner keyboardImput = new Scanner(System.in);

        System.out.print("Entrez votre age : ");
        int age = keyboardImput.nextInt();

        boolean estEtudiant = true;
        boolean estMilitaire = false;
        boolean estMajeur = age>=18;

        System.out.print("\n");

        if(estMajeur)
            System.out.print("Vous êtes majeur.");
        else
            System.out.print("Vous êtes mineur.");

    }
}
