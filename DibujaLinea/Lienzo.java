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
        Graphics2D g2 = (Graphics2D) g;
        g2.drawString("Hola Mundo", 100, 200);
        g2.drawRect(50, 50, 200, 50);
        g2.drawLine(50,50, 100, 50);
    }
}