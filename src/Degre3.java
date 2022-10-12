import java.util.Scanner;

public class Degre3
{
    public static void main(String[] _args)
    {
        Scanner keyboardImput = new Scanner(System.in);

        System.out.print("a : ");
        int a = keyboardImput.nextInt();
        System.out.print("b : ");
        int b = keyboardImput.nextInt();
        System.out.print("c : ");
        int c = keyboardImput.nextInt();

        System.out.print("x : ");
        double x = keyboardImput.nextDouble();


        double polynome = ((float)(a+b)/2)*Math.pow(x,3) + (a+b) * 2 * Math.pow(x,2) + a + b +c;


        System.out.println(polynome);
        System.out.println(Math.pow(x,3));
    }
}
