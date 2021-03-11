import java.util.concurrent.Callable;

public class Loader
{
    public static void main(String[] args)
    {
        Loader.getKitten().setName("Murka");
        System.out.println("Weight Kitten Murka= " +Cat.getWeight());
        Loader.getKitten().setName("Alisa");
        System.out.println("Weight Kitten Alisa= " +Cat.getWeight());
        Loader.getKitten().setName("Begemot");
        System.out.println("Weight Kitten Begemot= " +Cat.getWeight());
        System.out.println("Number of cats = " +Cat.getCount());

    }

    private static Cat getKitten(){
        return new Cat();
    }

    //Cat murka = new Cat();






}