import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Tabs
{
    public static void main(String[] args)
    {
        var keyboardInput = new Scanner(System.in);
        System.out.print("Veuiller saisir un numero d'exercice : ");
        int iExercice = keyboardInput.nextInt();


        if(iExercice == 1)
        {
            var nombreNotes = -1;

            do
            {
                System.out.print("Veuiller saisir le nombre de notes à entrer (supérieur à 0) : ");
                nombreNotes = keyboardInput.nextInt();
            }while(nombreNotes <= 1);

            var notesPhysique = new int[nombreNotes];

            for (int i = 0; i < notesPhysique.length; i++)
            {
                System.out.printf("Note[%d] : ", i);
                do
                {
                    notesPhysique[i] = keyboardInput.nextInt();
                }while(notesPhysique[i] < 0 || notesPhysique[i] > 20);
            }

            for (int note : notesPhysique)
            {
                System.out.println(note);
            }
        }
        else if(iExercice == 3)
        {
            System.out.print("Exercice 3 : Recherche dans un tableau : ");
            int[] iTab = new int[10];

            for(int i = 0; i<iTab.length; i++)
            {
                System.out.print("Entrez un entier : ");
                iTab[i] = keyboardInput.nextInt();
            }

            System.out.print("Entrez un entier à rechercher : ");

            int iToFind = keyboardInput.nextInt();
            int i;
            boolean bexist = false;

            for(i = 0; i< iTab.length; i++)
            {
                if(iTab[i] == iToFind)
                {
                    bexist = true;

                }
            }
            if(bexist)
                System.out.printf("Le nombre %d existe dans le tableau à l'index : %d.",iToFind, i);

        }
        else if(iExercice == 4)
        {
            int[] tabLargeMultiple=new int[50];

            List<Integer> tabMultiples = new ArrayList<Integer>();
            int[][] iTabs = new int[3][];

            int nbmultiple=0;
            int sommemultiple=0;

            for(int i=0;i<3;i++) {
                System.out.printf("Veuillez saisir combien vous voulez entrer de nombre dans le tableau %d : ",i);
                int jmax=keyboardInput.nextInt();

                iTabs[i] = new int[jmax];

                for(int j=0;j<jmax;j++) {
                    System.out.printf("Veuillez saisir le nombre n°%d : ",j);
                    int nombre=keyboardInput.nextInt();
                    iTabs[i][j] = nombre;

                    if(nombre%3==0)
                    {
                        tabMultiples.add(nombre);
                    }
                }
            }

            //AFFICHAGE ----------------------------------------------------------------------------------------------------

            for(int i = 0; i<3; i++)
            {
                System.out.printf("Tableau %d : [",i);
                for(int j = 0; j<iTabs[i].length;j++)
                {
                    if (j==iTabs[i].length-1){
                        System.out.println(iTabs[i][j]+"]");
                    }else{
                        System.out.print(iTabs[i][j]+", ");
                    }
                }
            }

            System.out.print("S = ");
            for(int i=0;i<=tabMultiples.size()-1;i++)
            {
                if (i==tabMultiples.size()-1)
                    System.out.print(tabMultiples.get(i) +" = ");
                else
                    System.out.print(tabMultiples.get(i) + "+");

                sommemultiple+=tabMultiples.get(i);
            }
            System.out.print(sommemultiple);
        }
    }
}
