package ru.skillbox;

public class Main {

    public static void main(String[] args) {

        Country russiaCountry = new Country("Россия");
        russiaCountry.setCapitalCountry("Москва");
        russiaCountry.setCountryArea(17098246);
        russiaCountry.setPopulationSize(146.24);
        russiaCountry.setAccessToSee(13);
        russiaCountry.print("Россия");

        Country japanCountry = new Country("Япония");
        japanCountry.setCapitalCountry("Токио");
        japanCountry.setCountryArea(377944);
        japanCountry.setPopulationSize(125.62);
        japanCountry.setAccessToSee(5);
        japanCountry.print("Япония");
    }
}
