import java.util.concurrent.Callable;

public class Loader
{
    public static void main(String[] args)
    {
        Cat kittenMurka = new Cat(1100.0, "Murka", "White");
        System.out.println("Kitten " +kittenMurka.getName() +" weight = " +kittenMurka.getWeight() +" color " +kittenMurka.getColor());
        Cat kittenBonya = new Cat(1100.0,"Bonya", "Black");
        System.out.println("Kitten " +kittenBonya.getName() +" weight = " +kittenBonya.getWeight() +" color " +kittenBonya.getColor());
        Cat kittenPushok = new Cat(1100.0, "Pushok", "Grey");
        System.out.println("Kitten " +kittenPushok.getName() +" weight = " +kittenPushok.getWeight() +" color " +kittenPushok.getColor());

    }
}