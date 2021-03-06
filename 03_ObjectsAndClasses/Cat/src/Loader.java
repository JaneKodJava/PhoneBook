import java.util.concurrent.Callable;

public class Loader
{
    public static void main(String[] args)
    {
        Cat murka = new Cat();
        Cat pusha = new Cat();
        Cat barsik = new Cat();
        Cat vasya = new Cat();
        Cat bonifaciy = new Cat();

        System.out.println("Murka: " +murka.getStatus());
        System.out.println("Murka weight: " +murka.getWeight());
        murka.meow();
        System.out.println("Murka weight: " +murka.getWeight());
        murka.feed(200.0);
        System.out.println("Murka weight: " +murka.getWeight());
        System.out.println("Murka: " +murka.getStatus());
        System.out.println("======================================================");

        System.out.println("Pusha: " +pusha.getStatus());
        System.out.println("Pusha weight: " +pusha.getWeight());
        pusha.feed(150.50);
        System.out.println("======================================================");

        System.out.println("Barsik: " +barsik.getStatus());
        System.out.println("Barsik weight: " +barsik.getWeight());
        System.out.println("======================================================");

        System.out.println("Vasya: " +vasya.getStatus());
        System.out.println("Vasya weight: " +vasya.getWeight());
        vasya.feed(10000.0);
        System.out.println("Vasya: " +vasya.getStatus());
        System.out.println("Vasya weight: " +vasya.getWeight());
        System.out.println("======================================================");

        System.out.println("Bonifaciy weight: " +bonifaciy.getWeight());
        System.out.println("Bonifaciy weight: " +bonifaciy.getWeight());
        while (bonifaciy.getWeight() > 999){
            bonifaciy.meow();
        }
        System.out.println("Bonifaciy : " +bonifaciy.getStatus());
        System.out.println("======================================================");
    }
}