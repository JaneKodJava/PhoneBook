package ru.skillbox;

public class Laptop {
    private String name;
    private double diagonal;
    private String nameProcessor;
    private int numberOfCores;
    private int frequency;
    private String typeOfRamMemory;
    private int amountOfRam;
    private String typeHardDrive;
    private int spaceHardDrive;
    private String keyboardBacklit;
    private int weight;

    public String getName() {
        return name;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String getNameProcessor() {
        return nameProcessor;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public int getFrequency() {
        return frequency;
    }

    public String getTypeOfRamMemory() {
        return typeOfRamMemory;
    }

    public int getAmountOfRam() {
        return amountOfRam;
    }

    public String getTypeHardDrive() {
        return typeHardDrive;
    }

    public int getSpaceHardDrive() {
        return spaceHardDrive;
    }

    public String getKeyboardBacklit() {
        return keyboardBacklit;
    }

    public int getWeight() {
        return weight;
    }

    public Laptop(String name, double diagonal, String nameProcessor,
                  int numberOfCores, int frequency, String typeOfRamMemory,
                  int amountOfRam, String typeHardDrive, int spaceHardDrive, String keyboardBacklit, int weight){
        this.name = name;
        this.diagonal = diagonal;
        this.nameProcessor = nameProcessor;
        this.numberOfCores = numberOfCores;
        this.frequency = frequency;
        this.typeOfRamMemory = typeOfRamMemory;
        this.amountOfRam = amountOfRam;
        this.typeHardDrive = typeHardDrive;
        this.spaceHardDrive = spaceHardDrive;
        this.keyboardBacklit = keyboardBacklit;
        this.weight = weight;
    }

    public void printLaptop(){
        System.out.println("\nНазвание ноутбука" +getName());
        System.out.println("Диагональ: " +getDiagonal() +" дюймов");
        System.out.println("Название процессора: " +getNameProcessor());
        System.out.println("Количество ядер: " +getNumberOfCores());
        System.out.println("Тактовая частота: " +getFrequency() +" МГц");
        System.out.println("Тип оперативной памяти: " +getTypeOfRamMemory());
        System.out.println("Объем оперативной памяти: " +getAmountOfRam() + " ГБ");
        System.out.println("Тип жесткого диска: " +getTypeHardDrive());
        System.out.println("Объем жесткого диска: " +getSpaceHardDrive() + " ГБ");
        System.out.println("Наличие подстветки: " +getKeyboardBacklit());
        System.out.println("Вес: " +getWeight() + " г");
    }
}
