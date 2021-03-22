package ru.skillbox;

public class Main {

    public static void main(String[] args) {

        Bicycle haroBicycle = new Bicycle("BMX Haro Shredder Pro 20");
        haroBicycle.setWheelDiameter(20);
        haroBicycle.setFrameMaterial("Сталь");
        haroBicycle.setTypeBrakes("Ободные");
        haroBicycle.setBrandCountry("Америка");
        haroBicycle.setShockAbsorbingFork("Сталь, безрезьбовая, 1-1/8");
        haroBicycle.setBrakes("Tektro");
        haroBicycle.setPrice(28000);
        haroBicycle.print();
    }
}
