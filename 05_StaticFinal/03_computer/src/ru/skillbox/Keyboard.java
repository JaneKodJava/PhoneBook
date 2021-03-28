package ru.skillbox;

public class Keyboard {
    private static final String TYPE= "мембранная";
    private static final String BACKLIT = "есть";
    private static final int WEIGHT = 950;//g

    public static String getTYPE() {
        return TYPE;
    }

    public static String getBACKLIT() {
        return BACKLIT;
    }

    public static int getWEIGHT() {
        return WEIGHT;
    }
//public Keyboard(){
    //    this.TYPE = TYPE;
    //    this.BACKLIT = BACKLIT;
    //    this.WEIGHT = WEIGHT;
    //}
}
