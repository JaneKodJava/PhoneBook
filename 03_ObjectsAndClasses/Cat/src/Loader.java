import java.util.concurrent.Callable;

public class Loader
{
    public static void main(String[] args)
    {
        //Cat kitten = getKitten();
        //kitten.setWeight(1100.0);
        //System.out.println(kitten.getWeight());

        Cat murka = new Cat(2500.0, "Murka", "Red");
        System.out.println("Вес Мурки: " +murka.getWeight() + ", имя: " +murka.getName() + ", цвет: " +murka.getColor());
        Cat vasya = new Cat(murka.getWeight(), murka.getName(), murka.getColor());
        System.out.println("Вес Васьки: " +vasya.getWeight() + ", имя: " + vasya.getName() + ", цвет: " +vasya.getColor());





    }

    //private static Cat getKitten(){
     //   return new Cat();
    //}

}