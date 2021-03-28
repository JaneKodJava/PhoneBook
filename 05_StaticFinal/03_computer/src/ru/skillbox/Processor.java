package ru.skillbox;

public class Processor {

    private static final int FREQUENCY = 2900; // MHz
    private static final int NUMBER_OF_CORES = 6;
    private static final String VENDOR = "Intel";
    private static final int WEIGHT = 300;// g

    public static int getFREQUENCY() {
        return FREQUENCY;
    }

    public static int getNumberOfCores() {
        return NUMBER_OF_CORES;
    }

    public static String getVENDOR() {
        return VENDOR;
    }

    public static int getWEIGHT() {
        return WEIGHT;
    }



//public Processor( int frequency, int NUMBER_OF_CORES, String MANUFACTURER, int WEIGHT) {
    //    this.FREQUENCY = frequency;
    //    this.NUMBER_OF_CORES = NUMBER_OF_CORES;
    //    this.MANUFACTURER = MANUFACTURER;
    //    this.WEIGHT = WEIGHT;
    //}
}
