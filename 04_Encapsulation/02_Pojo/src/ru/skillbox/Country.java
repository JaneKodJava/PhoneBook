package ru.skillbox;

public class Country {
    private String nameCountry;
    private double populationSize;
    private int countryArea;
    private String capitalCountry;
    private int accessToSee;

    public Country(String nameCountry){
        this.nameCountry = nameCountry;
        this.capitalCountry = capitalCountry;
        this.countryArea = countryArea;
        this.populationSize = populationSize;
        this.accessToSee = accessToSee;
    }
    public void setCountryArea(int countryArea){
        this.countryArea = countryArea;
    }
    public int getCountryArea(){
        return countryArea;
    }
    public void setCapitalCountry(String capitalCountry){
        this.capitalCountry = capitalCountry;
    }
    public String getCapitalCountry(){
        return capitalCountry;
    }
    public String getNameCountry(){
        return nameCountry;
    }
    public void setPopulationSize(double populationSize){
        this.populationSize = populationSize;
    }
    public double getPopulationSize(){
        return populationSize;
    }
    public void setAccessToSee(int accessToSee){
        this.accessToSee = accessToSee;
    }
    public int getAccessToSee(){
        return accessToSee;
    }

    public void print(String title){
        System.out.println(title);
        System.out.println("Название страны: " +getNameCountry());
        System.out.println("Численность населения: " +getPopulationSize()+ " млн человек");
        System.out.println("Площадь страны: " +getCountryArea() + " кв км");
        System.out.println("Название столицы: "+getCapitalCountry());
        System.out.println("Наличие выхода к морю: " +getAccessToSee());
        System.out.println("\n==================================\n");
    }
}
