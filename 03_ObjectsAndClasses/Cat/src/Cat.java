
public class Cat
{
    private double originWeight;
    private static double weight;

    private double minWeight;
    private double maxWeight;
    public static String name;
    public static String color;

    public Cat(double w, String n, String c)
    {
        Cat.weight = w; //1500.0 + 3000.0 * Math.random();
        Cat.name = n;
        Cat.color = c;
        originWeight = Cat.weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }

    public static String getColor(){
        return color;
    }
    public static String getName(){
        return name;
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
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