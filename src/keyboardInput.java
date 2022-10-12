import java.util.Scanner;

public class keyboardInput
{
    public static void main(String[] _args)
    {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Entrez votre nom : ");
        String nom = keyboardInput.nextLine();
        System.out.printf("Nom : %s", nom);
    }
}
