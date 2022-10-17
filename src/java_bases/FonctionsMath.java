package java_bases;

import java.util.Scanner;

public class FonctionsMath
{
    public static void main(String[] _args)
    {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Entrez Diamètre ");
        float diametre = keyboardInput.nextFloat();

        float rayon = diametre/2;
        double surface = Math.pow(rayon,2) * Math.PI;

        System.out.printf("\nRayon = %f \nSurface = %f",rayon,surface);

    }
}
