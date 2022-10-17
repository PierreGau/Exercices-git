package java_bases;

import java.util.*;

public class Fonction
{
    public static boolean isPrefix(String _first, String _second)
    {
        _first = _first.toLowerCase();
        _second = _second.toLowerCase();
        //_first.startsWith((_second)); true si la string commence par l'argument fourni.
        return _first.substring(0,_second.length()).equals(_second);
    }

    public static char[] alternatLowerCase(char[] _charTab)
    {

        for(int i = 0; i < _charTab.length; i++)
        {
            if(i % 2 == 0)
                _charTab[i] = Character.toLowerCase(_charTab[i]);
            else
                _charTab[i] = Character.toUpperCase(_charTab[i]);
        }

        return _charTab;
    }

    public static  int[] travel(String[] _directions)
    {
        int[] result = new int[]{0,0};

        for(String s : _directions)
        {
            s.toLowerCase();
            if(s.equals("haut"))
                result[0]+=1;
            else if (s.equals("bas"))
                result[0]-=1;
            if(s.equals("gauche"))
                result[1]-=1;
            else if (s.equals("droite"))
                result[1]+=1;
        }

        return result;
    }

    public static boolean isDoubleCharacter(String _toTest)
    {
        _toTest = _toTest.toLowerCase();

        boolean isDoubleChar = false;

        for(int i = 0; i < _toTest.length()-1; i++)
        {
            char a = _toTest.charAt(i);

            if(a == _toTest.charAt(i+1))
                isDoubleChar = true;
        }

        return isDoubleChar;
    }

    public static void main(String[] _args)
    {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Veuillez saisir un numero d'exercice : ");
        int iexercice = keyboardInput.nextInt();

        if(iexercice == 1)
        {
            System.out.println(isPrefix("Hugging","hug"));
            System.out.println(isPrefix("Bonjour","oui"));

        }
        else if(iexercice == 2)
        {
            char[] tab = new char[]{'a','b','c','d'};
            alternatLowerCase(tab);
            System.out.println(tab);
        }
        else if(iexercice == 3)
        {
            String[] s = new String[]{"haut", "haut", "gauche", "gauche", "bas"};

            System.out.printf("[%d , %d]", travel(s)[0], travel(s)[1]);
        }
        else if (iexercice == 4)
        {
            String toTest = "Llama";
            System.out.println(toTest);
            System.out.println("> " +  isDoubleCharacter(toTest));

            toTest = "Chats";
            System.out.println(toTest);
            System.out.println("> " +  isDoubleCharacter(toTest));

            toTest = "Chats !!";
            System.out.println(toTest);
            System.out.println("> " +  isDoubleCharacter(toTest));
        }
    }
}
