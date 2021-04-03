import javax.swing.*;

public class GeometryCalculator {
    public static double radius;
    public static double circleSquare;
    public static double sphereVolume;
    public static double triangleSquare;
    public static double p;

    public GeometryCalculator(){
        this.radius = radius;
        this.circleSquare = circleSquare;
        this.sphereVolume = sphereVolume;
    }


    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {
        circleSquare = Math.PI * Math.pow(radius, 2);
        return circleSquare;
    }



    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {
        sphereVolume = (4 * Math.PI * Math.abs(Math.pow(radius, 3)))/ 3;
        return sphereVolume;
    }



    public static boolean isTrianglePossible(double a, double b, double c) {

        if (a <= 0 || b <= 0 || c <= 0){
            return false;
        }
        if (a + b > c && b + c > a && a + c > b){
            return true;
        }
        else {
        return false;}
    }


    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        if (isTrianglePossible(a,b,c)){
            p = (a + b + c) / 2;
            triangleSquare = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        }
        else {
            triangleSquare = -1;
        }
        return triangleSquare;

    }
}
