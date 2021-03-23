package ru.skillbox;


public class Product {
    private final String name;
    private final String barCode;
    private int price;

    public Product(String name, int price, String barCode){
        this.name = name;
        this.barCode = barCode;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public String getBarCode(){
        return barCode;
    }
    public String toString(){
        return name + " - " + price + " - " + getBarCode();
    }
    public void print(){
        String info = name + " - " + price + " - " + getBarCode();
        System.out.println(info);
    }

}
