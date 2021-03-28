package ru.skillbox;

public class RAMmemory {

    private static final String TYPE = "DDR4";
    private static final int AMOUNT_OF_RAM = 32;//GB
    private static final int WEIGHT = 100;//g

    public static String getTYPE() {
        return TYPE;
    }

    public static int getAmountOfRam() {
        return AMOUNT_OF_RAM;
    }

    public static int getWEIGHT() {
        return WEIGHT;
    }
//public RAMmemory(String TYPE, int AMOUNT_OF_RAM, int WEIGHT) {
    //    this.TYPE = TYPE;
    //    this.AMOUNT_OF_RAM = AMOUNT_OF_RAM;
    //    this.WEIGHT = WEIGHT;
    //}
}


