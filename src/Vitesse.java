public class Vitesse
{
    public static void main(String[] _args)
    {
        float dist, temp;
        dist = 1000;
        temp = 60;


        System.out.println("vitesse : " + dist/temp + "m/s");
        System.out.printf("vitesse = %.1f / %.1f = %.1f m/s",dist,temp,dist/temp);
    }
}
