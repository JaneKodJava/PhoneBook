package ru.skillbox;

public class Bicycle {
    private String name;
    private int wheelDiameter;
    private String frameMaterial;
    private String typeBrakes;
    private String brandCountry;
    private String shockAbsorbingFork;
    private String brakes;
    private int price;

    public Bicycle(String name){
        this.name = name;
        this.wheelDiameter = wheelDiameter;
        this.frameMaterial = frameMaterial;
        this.typeBrakes = typeBrakes;
        this.brandCountry = brandCountry;
        this.shockAbsorbingFork = shockAbsorbingFork;
        this.brakes = brakes;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public void setWheelDiameter(int wheelDiameter){
        this.wheelDiameter = wheelDiameter;
    }
    public int getWheelDiameter(){
        return wheelDiameter;
    }
    public void setFrameMaterial(String frameMaterial){
        this.frameMaterial = frameMaterial;
    }
    public String getFrameMaterial(){
        return frameMaterial;
    }
    public void setTypeBrakes(String typeBrakes){
        this.typeBrakes = typeBrakes;
    }
    public String getTypeBrakes(){
        return typeBrakes;
    }
    public void setBrandCountry(String brandCountry){
        this.brandCountry = brandCountry;
    }
    public String getBrandCountry(){
        return brandCountry;
    }
    public void setShockAbsorbingFork(String shockAbsorbingFork){
        this.shockAbsorbingFork = shockAbsorbingFork;
    }
    public String getShockAbsorbingFork(){
        return shockAbsorbingFork;
    }
    public void setBrakes(String brakes){
        this.brakes = brakes;
    }
    public String getBrakes(){
        return brakes;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public void print(){
        System.out.println("Название велосипеда: " +getName());
        System.out.println("Диаметр колеса: " +getWheelDiameter() + " дюймов");
        System.out.println("Тип тормозов: " +getTypeBrakes());
        System.out.println("Страна брэнда: " +getBrandCountry());
        System.out.println("Амортизационная вилка: " +getShockAbsorbingFork());
        System.out.println("Тормоза: " +getBrakes());
        System.out.println("Цена: " +getPrice() + " рублей");
        System.out.println("\n==================================\n");
    }
}
