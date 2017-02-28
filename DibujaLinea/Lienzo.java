import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class Lienzo here.
 * 
 * @author MaggieMendez 
 * @version (a version number or a date)
 */
public class Lienzo extends JPanel
{
    @Override 
    public void paintComponent(Graphics g)
    {
        int []a = {50, 50, 80}; int []b = {50, 100, 100};
        Graphics2D g2 = (Graphics2D) g;
        g2.drawPolygon(a, b, 3);
        g2.drawOval(200, 150, 50, 50);
        g2.drawRect(150, 100, 50, 50);
    }
}