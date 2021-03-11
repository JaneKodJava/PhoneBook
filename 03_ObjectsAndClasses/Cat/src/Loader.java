import java.util.concurrent.Callable;

public class Loader
{
    public static void main(String[] args)
    {
        Cat murka = new Cat();
        Cat vasya = new Cat();
        Cat barsik = new Cat();

        System.out.println("Number of cats " +Cat.getCount());
        while (vasya.getWeight() > 999){
            vasya.meow();
        }
        System.out.println("Vasya weight = " +vasya.getWeight());
        System.out.println("Vasya status = " +vasya.getStatus());
        System.out.println("Number of cats " +Cat.getCount());

        barsik.feed(10000.0);
        System.out.println("Barsic weight = " +barsik.getWeight());
        System.out.println("Barsic status = " +barsik.getStatus());
        System.out.println("Number of cats " +Cat.getCount());


    }
}