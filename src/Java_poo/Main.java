package Java_poo;

public class Main
{
    public static void main(String[] args)
    {
        User patoche = User.init("Pierre", "Gauthier", "p.gauthier@gmail.com", "zeiubgiauz");
        System.out.println(patoche.getFirstName());
    }
}
