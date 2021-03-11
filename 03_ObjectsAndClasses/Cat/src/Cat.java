
public class Cat
{
    private static double originWeight;
    private static double weight;

    private static double minWeight;
    private static double maxWeight;
    private static int count = 0;

    public Cat()
    {
        Cat.weight = 1500.0 + 3000.0 * Math.random();
        originWeight = Cat.weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;

    }

    public static int getCount(){
        return count;
    }

    public static void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public static void feed(Double amount)
    {
        weight = weight + amount;
    }

    public static void drink(Double amount)
    {
        weight = weight + amount;
    }

    public static Double getWeight()
    {
        return weight;
    }

    public static String getStatus()
    {
        if(weight < minWeight) {
            count--;
            return "Dead";
        }
        else if(weight > maxWeight) {
            count--;
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}