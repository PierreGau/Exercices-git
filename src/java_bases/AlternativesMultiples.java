package java_bases;

import java.util.Scanner;
public class AlternativesMultiples
{
    public static void main(String[] _args)
    {
        var keyboardInput=new Scanner(System.in);
        System.out.print("Votre pays : ");
        var pays=keyboardInput.nextLine();
        if(pays.equals("france")){
            System.out.println("Bonjour");
        }else if(pays.equals("usa")){
            System.out.println("Hello");
        } else if (pays.equals("espagne")) {
            System.out.println("Holla");
        }else if(pays.equals("allemagne")){
            System.out.println("Guten tag");
        }else{
            System.out.println("Pays existant!!!");
        }

    }
}
