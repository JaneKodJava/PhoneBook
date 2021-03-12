import java.util.concurrent.Callable;

public class Loader
{
    public static void main(String[] args)
    {
        //Loader.getKitten().setName("Murka");
        Cat kitten = getKitten();
        kitten.setWeight(1100.0);
        System.out.println(kitten.getWeight());


    }

    private static Cat getKitten(){
        return new Cat();
    }

}