package Java_poo;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
//        User patoche = new User("Pierre", "Gauthier", "p.gauthier@gmail.com", "zeiubgiauz", false, 27, 88.00);
//        System.out.println(patoche.getFirstName());
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Entrez un numero d'exercice : ");
        int iexercice = keyboardInput.nextInt();

        if(iexercice == 1)
        {
            Rectangle rectangle1 = new Rectangle(5,7);
            System.out.println("Périmètre : " + rectangle1.getPerimeter());
            System.out.println("Aire : " + rectangle1.getArea());

            System.out.printf("\n");
            rectangle1.setHeight(10);
            System.out.println("Périmètre : " + rectangle1.getPerimeter());
            System.out.println("Aire : " + rectangle1.getArea());

            Rectangle rectangle2 = new Rectangle(rectangle1);
            System.out.println(rectangle1.equals(rectangle2));

            rectangle2.setHeight(200);
            System.out.println(rectangle1.equals(rectangle2));

        }
        else if(iexercice == 2)
        {
            Patient patient1 = new Patient("Pierre", "Gauthier", 27, 1.80, 88);
            System.out.printf("IMC : %.2f\n", patient1.calculateImc());
            System.out.printf("\n");

            System.out.println(patient1);

        }
        else if(iexercice == 3)
        {
            enum Actions
            {
                afficher,
                secouer,
                remplir,
                vider,
                puiser,
                calculerSolde,
                stop,
                none
            };

            int iaction = 0;
            Actions actions = Actions.none;
            Tirelire tirelire = new Tirelire();

            do
            {
                System.out.println("Voici le menu des actions : ");
                System.out.printf("1 Afficher\n2 Secouer\n3 Remplir\n4 Vider\n5 Puiser\n6 Calculer solde\n7 Stopper\n");
                System.out.printf("Quelle action souhaitez vous effectuer : ");
                iaction = keyboardInput.nextInt();

                System.out.printf("\n");
                if(iaction >= 1 && iaction<= 7)
                {
                    actions = Actions.values()[iaction-1];

                    switch (actions)
                    {
                        case afficher:
                            tirelire.afficher();
                            break;
                        case secouer:
                            tirelire.secouer();
                            break;
                        case remplir:
                            System.out.printf("Combien voullez vous ajouter à la tirelire : ");
                            double montant = keyboardInput.nextDouble();
                            tirelire.remplir(montant);
                            break;
                        case vider :
                            tirelire.vider();
                            break;
                        case puiser :
                            System.out.printf("Combien voullez vous retirer à la tirelire : ");
                            double prelevement = keyboardInput.nextDouble();
                            tirelire.puiser(prelevement);
                            break;
                        case calculerSolde:
                            System.out.printf("Quel est le montant de vos vacances : ");
                            double budget = keyboardInput.nextDouble();
                            double solde = tirelire.calculerSolde(budget);
                            if(solde != tirelire.getMontant())
                                System.out.printf("Vous êtes assez riche pour partir en vacances ! il vous restera %.2f$ à la rentrée\n", solde);
                            else
                                System.out.printf("il vous manque %.2f$ pour partir en vacances\n", budget - solde);
                            break;
                    }
                }
                else
                    actions = Actions.none;

                System.out.printf("\n");

            }while(actions != Actions.stop);
        }
    }
}
