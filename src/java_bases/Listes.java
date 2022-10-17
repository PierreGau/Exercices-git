package java_bases;

import java.util.*;

public class Listes
{
    public static void main(String[] _args)
    {
        Scanner keyboardImput = new Scanner(System.in);
        System.out.print("Entrez le numero de l'exercice : ");
        int iExercice = keyboardImput.nextInt();



        if(iExercice==1)
        {

            List<String> langages = new ArrayList<String>();
            System.out.print("Créez une liste de Langages.\n\n");
            boolean bisDone = false;

            keyboardImput = new Scanner(System.in);

            while(!bisDone)
            {
                System.out.print("Saisissez le langage à ajouter : ");
                String languageToAdd = keyboardImput.nextLine();

                langages.add(languageToAdd);

                System.out.print("\nAppuyez sur entrée pour continuer, n pour arrêter : ");
                String a = keyboardImput.nextLine();

                if(a.equals("n"))
                    bisDone = true;
            }

            System.out.println(langages);

            bisDone = false;

            while(!bisDone)
            {

                System.out.print("Saisissez le langage à retirer : ");
                String laguageToRemove = keyboardImput.nextLine();

                if(langages.contains(laguageToRemove))
                {
                    langages.remove(laguageToRemove);
                }
                else
                {
                    System.out.println("Le langage demandé n'est pas présent dans la liste");
                }

                System.out.print("appuyez sur entrée pour continuer, n pour arrêter : ");
                String a = keyboardImput.nextLine();

                if(a.equals("n"))
                    bisDone = true;
            }
            System.out.println(langages);
        }
        else if(iExercice == 2)
        {
            List<String> emails = new ArrayList<String>(Arrays.asList("christian.lisangola@gmail.com","christian.lisangola@wanadoo.fr","jean.paul@gmail.com","alain@gmail.com","josephine.lajoie@yahoo.fr","lydie@yahoo.fr","luise@hotmail.fr","philemon.turion@gmail.com","jules@hotmail.fr"));


            HashMap<String, Integer> domainCount = new HashMap<String, Integer>();
            int i;

            for(i = 0; i< emails.size(); i++)
            {
                String temp = emails.get(i);
                //String domain = temp.split("@")[1];
                String domain = temp.substring(temp.indexOf("@")+1,temp.length());

                if(i==0 || !domainCount.containsKey(domain))
                {
                    domainCount.put(domain,1);
                }
                else
                {
                    domainCount.replace(domain,domainCount.get(domain)+1);
                }
            }

            System.out.printf("il y a %d types d'adresses différentes.\n", domainCount.size());
            for(String s : domainCount.keySet())
            {
                double percent = ((double)domainCount.get(s)*100)/i;
                System.out.printf("Il y a %.2f pourcent d'adresses %s\n",percent , s);
            }
        }
    }
}
