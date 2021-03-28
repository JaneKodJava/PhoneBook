package ru.skillbox;

public class Screen {
    private static final double DIAGONAL = 31.5; //''
    private static final String TYPE = "TFT IPS";
    private static final int WEIGHT = 15300;//g

    //private static double diagonalLaptop;

    //public Screen(double diagonalLaptop){
    //    this.diagonalLaptop = diagonalLaptop;
    //}
    //public double getDiagonalLaptop() {
    //    return diagonalLaptop;
    //}

    //public void setDiagonalLaptop(double diagonalLaptop) {
    //    this.diagonalLaptop = diagonalLaptop;
    //}

    public static double getDIAGONAL() {
        return DIAGONAL;
    }

    public static String getTYPE() {
        return TYPE;
    }

    public static int getWEIGHT() {
        return WEIGHT;
    }
//public Screen(int DIAGONAL, String TYPE, int WEIGHT){
    //    this.DIAGONAL = DIAGONAL;
    //    this.TYPE = TYPE;
    //    this.WEIGHT = WEIGHT;
    //}
}
