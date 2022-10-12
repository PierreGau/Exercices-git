public class DataTypes
{
    public static void main(String[] args)
    {
        int age=27;
        String nom="Gauthier";
        String prenom="Pierre";
        double poids=80.3;

        System.out.println("Nom : " + nom);
        System.out.println("Prenom : " + prenom);
        System.out.println("Age : " + age);
        System.out.println("Poid : " + poids);

        // %d = int, %f = float, %s = String
        System.out.printf("Je suis %s %s, et j'ai %d ans",prenom,nom,age);
    }

}
