package TP_Batiment;

public class Main {

    public static void main(String[] args)
    {
        Batiment b = new Batiment("18 rue du lion d'or");
        Maison m  = new Maison("15 impasse de la voie rouge", 6);

        System.out.println(m.toString());
    }
}
