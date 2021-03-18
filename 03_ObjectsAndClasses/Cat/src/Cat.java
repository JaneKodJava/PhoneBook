
public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private String name;
    private static int count = 0;
    private final Colors type;

    //public Cat()
    //{
        //Cat.weight = 1100.0; //1500.0 + 3000.0 * Math.random();
        //originWeight = Cat.weight;
        //minWeight = 1000.0;
        //maxWeight = 9000.0;
        //count++;

    // }
    public Cat(Double weight, String name, Colors type){
        //this();
        this.weight = weight;
        this.name = name;
        this.type = type;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public static int getCount(){
        return count;
    }

    //public void setColor(String color){
     //   this.color = color;
    //}

    public Colors getColors(){
        return type;
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