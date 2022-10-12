import java.util.Scanner;

public class keyboardInput
{
    public static void main(String[] _args)
    {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Entrez votre nom : ");
        String nom = keyboardInput.nextLine();

        System.out.print("Entrez votre prenom : ");
        String prenom = keyboardInput.nextLine();

        System.out.print("Entrez votre age : ");
        int age = keyboardInput.nextInt();

        System.out.print("Entrez votre poid : ");
        double poid = keyboardInput.nextDouble();

        System.out.printf("\nNom : %s \nPrenom : %s \nage : %d\npoid : %.1f", nom,prenom,age,poid);
    }
}
