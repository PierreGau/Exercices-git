package java_bases;

import java.util.Random;
import java.util.Scanner;

public class ExercicesBoucles
{
    public static void main(String[] _args)
    {
        var keyboardInput = new Scanner(System.in);

        System.out.print("Entrez un numero d'exercice : ");
        int iNumExo = keyboardInput.nextInt();

        System.out.printf("\n\n");

        if(iNumExo == 1)
        {
            System.out.print("Veuillez définir un code PIN : ");
            var codePin=keyboardInput.nextInt();

            // Essais de déverouillage de l'appareil
            int codePinATester;

            System.out.print("Veuillez entrer le code PIN pour déverouiller l'appareil :" +
                    " ");
            int iTry = 0;

            do{
                System.out.printf("vous avez : %d essai : ", (3-iTry));
                codePinATester=keyboardInput.nextInt();
                if(codePinATester==codePin){
                    System.out.println("Appareil déverouillé!!!!");
                    break;
                }
                System.out.print("Code PIN erroné, veuillez recommencer : ");
                iTry++;

                if(iTry ==3)
                    System.out.print("vous n'avez plus d'essai");

            } while (iTry<3);
        }
        else if(iNumExo == 2)
        {
            System.out.printf("Exercice 2 : Calculer la factorielle d'un entier donné \n");
            System.out.print("Entrez un entier : ");
            int iNombre = keyboardInput.nextInt();
            int iResult = iNombre;

            for(int i = iNombre-1; i > 0; i--)
            {
                iResult *= i;
            }
            System.out.printf("La factorielle de %d est : %d\n",iNombre, iResult);
        }
        else if(iNumExo == 3)
        {
            System.out.printf("Exercice 3 : Trouvez le nombre mystère \n");
            Random rRand = new Random();

            int iRand = rRand.nextInt(101);
            int iTry = 0;

            do
            {
                System.out.print("Entrez un entier : ");
                iTry = keyboardInput.nextInt();

                if(iTry > iRand)
                    System.out.println("C'est moins !");
                else if(iTry < iRand)
                    System.out.println("C'est plus !");

            }while(iTry != iRand);

            System.out.println("Bravo vous avez trouvé le nombre mystère");
        }
        else if(iNumExo == 4)
        {
            System.out.printf("Exercice 4 : Suite de 1 a N, attention aux multiples de 3 et 5 \n");

            System.out.print("Entrez un entier : ");
            int iNombre = keyboardInput.nextInt();

            for(int i = 1; i <= iNombre; i++)
            {
                String sText = "";

                boolean bMultiple3 = i % 3 == 0;
                boolean bMultiple5 = i % 5 == 0;

                if(!bMultiple3 && !bMultiple5)
                    sText = Integer.toString((i));
                else
                    sText += bMultiple3 ? bMultiple5 ? "fizzbuzz" :  "fizz" : "buzz";

//                if(bMultiple3)
//                    sText += "fizz";
//                if(bMultiple5)
//                    sText += "buzz";
//
//                if(sText.length()<=1)
//                    sText = Integer.toString((i));

                System.out.println(sText);
            }
        }
        else
            System.out.println("Cet exercice n'existe pas");
    }
}
