import javax.swing.*;


public class Main extends JFrame{
    public Main(){
        setTitle("Geometry Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocation(400,400);
        add(new MyDrawPanel());


        setVisible(true);
    }


    public static void main(String[] args) {

        Main nw = new Main();

        GeometryCalculator geometryCalculator = new GeometryCalculator();
        System.out.println(geometryCalculator.getCircleSquare(20.0));

        System.out.println(geometryCalculator.getSphereVolume(20.0));

        System.out.println(geometryCalculator.getTriangleSquare(1.5,2.0,3.0));

    }
}
