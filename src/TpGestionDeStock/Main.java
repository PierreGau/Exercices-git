package TpGestionDeStock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        enum Actions
        {
            RefSearch,
            Add,
            refDelete,
            refModifier,
            NameSearch,
            PriceGapSearch,
            PrintAll,
            Quit,
            None,
        }
        Scanner keyboardInput = new Scanner(System.in);
        Actions action = Actions.None;
        HashMap<Integer, Articles> articles = new HashMap<Integer, Articles>();

        do
        {
            System.out.printf("Voici le menu des actions : \n" +
                    "1 - Rechercher par Reference\n" +
                    "2 - Ajouter un article\n" +
                    "3 - Supprimer par reference\n" +
                    "4 - Modifier par reference\n" +
                    "5 - Rechercher par nom\n" +
                    "6 - Rechercher par intervale de prix\n" +
                    "7 - Afficher tout\n" +
                    "8 - Quitter\n");
            System.out.printf("Choisissez une action : ");
            int actionIndex = keyboardInput.nextInt();

            if(actionIndex > 0 && actionIndex < Actions.values().length )
            {
                action = Actions.values()[actionIndex-1];
                switch (action)
                {
                    //Cherche dans la liste articles le produit correspondant à la clef fournie
                    case RefSearch :
                        System.out.printf("Entrez la référence du produit : ");
                        int ref = keyboardInput.nextInt();
                        if(articles.containsKey(ref))
                            System.out.println(articles.get(ref).toString());
                        else System.out.println("le produit demandé n'existe pas.");
                        break;
                    //Ajout un nouvel article dans la liste
                    case Add :
                        //L'utilisateur rentre les informations produit

                        System.out.printf("quel est le nom de l'article à ajouter : ");
                        keyboardInput.nextLine();
                        String name = keyboardInput.nextLine();
                        System.out.printf("\nquel est son prix : ");
                        double prix = keyboardInput.nextDouble();
                        System.out.printf("Combien voullez vous en ajouter : ");
                        int nombre = keyboardInput.nextInt();
                        System.out.printf("Entrez la clef du produit : ");
                        int key = keyboardInput.nextInt();

                        //Conditions d'éligibilités à l'ajout de l'article souhaité
                        if(!articles.containsKey(key))
                        {
                            boolean isOk = true;
                            for(int i : articles.keySet())
                            {
                                if(articles.get(i).getNom().equals(name))
                                {
                                    System.out.println("Un article avec se nom existe déjà : ");
                                    System.out.println(articles.get(i).toString());
                                    isOk = false;
                                }
                            }
                            if(isOk)
                            {
                                Articles article = new Articles(name,key,nombre,prix);
                                articles.put(key,article);
                            }
                        }
                        else
                        {
                            System.out.println("Un article a déjà cette référence : ");
                            System.out.println(articles.get(key).toString());
                        }

                        break;
                    case refDelete:
                        System.out.printf("Entrez la référence du produit à supprimer: ");
                        ref = keyboardInput.nextInt();
                        if(articles.containsKey(ref))
                        {
                            System.out.println(articles.get(ref).getNom() + " supprimé");
                            articles.remove(ref);
                        }
                        else
                            System.out.println("le produit recherché n'existe pas");
                        break;
                    case refModifier:
                        System.out.printf("Entrez la référence du produit : ");
                        ref = keyboardInput.nextInt();
                        if(articles.containsKey(ref))
                        {
                            Articles temp = articles.get(ref);
                            System.out.println("Voici votre produit : ");
                            System.out.println(temp.toString());

                            System.out.printf("\nquel est le nouveau prix de l'article : ");
                            temp.setPrix(keyboardInput.nextDouble());
                            System.out.printf("Quelle est sa nouvelle Quantitée : ");//en vrai il faudrais demander la quantitée à ajouter ou retirer
                            temp.setQuantite(keyboardInput.nextInt());

                            articles.replace(ref,temp);

                        }
                        else System.out.println("le produit demandé n'existe pas.");
                        break;
                    case NameSearch:
                        System.out.printf("Quel est le nom recherché : ");
                        keyboardInput.nextLine();
                        name = keyboardInput.nextLine();
                        int countResult = 0;
                        for(int i : articles.keySet())
                        {
                            if(articles.get(i).getNom().equals(name))
                            {
                                System.out.printf("-----------\n");
                                System.out.println(articles.get(i));
                                System.out.printf("\n--------------\n");
                                countResult++;
                            }
                            if(countResult == 0)
                                System.out.println("Aucun élément ne correspond à votre recherche");
                        }
                        break;
                    case PriceGapSearch:
                        System.out.printf("Quel est le montant minimum recherché : ");
                        double min = keyboardInput.nextDouble();
                        System.out.printf("Quel est le montant maximum recherché : ");
                        double max = keyboardInput.nextDouble();
                        countResult = 0;
                        for(int i : articles.keySet())
                        {
                            prix = articles.get(i).getPrix();
                            if(prix > min && prix < max)
                            {
                                System.out.printf("-----------\n");
                                System.out.println(articles.get(i));
                                System.out.printf("\n--------------\n");
                                countResult++;
                            }
                            if(countResult == 0)
                                System.out.println("Aucun élément ne correspond à votre recherche");
                        }
                        break;
                    case PrintAll:
                        for(int i : articles.keySet())
                        {
                            System.out.printf("-----------\n");
                            System.out.println(articles.get(i));
                            System.out.printf("\n--------------\n");
                        }
                        break;
                }
            }
            else
                System.out.println("Veuillez saisir un numero compris entre 1 et 8");
        }while (action!= Actions.Quit);

    }
}
