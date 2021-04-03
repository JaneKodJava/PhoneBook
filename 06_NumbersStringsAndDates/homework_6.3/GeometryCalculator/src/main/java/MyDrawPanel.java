import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    public MyDrawPanel(){
        setBackground(Color.lightGray);
        repaint();
    }

    protected void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        g2.drawOval(70, 70, 200,200);
        String str = "Площадь круга = 1256.64";
        g.setColor(Color.BLACK);
        g.drawString(str,90, 40);
        String str2 = "Радиус = 20";
        g.setColor(Color.BLACK);
        g.drawString(str2,120,60);
    }
}
