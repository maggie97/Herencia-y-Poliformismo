import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class Rombo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rombo extends Figura
{
    int lado;
    /** Constructor for objects of class Rombo*/
    public Rombo(int x, int y, int l)
    {
        super(x, y);
        lado = l;
    }
    @Override
    public void dibuja(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        int []a = {50, 100, 150, 100}; int []b = {100, 50, 100, 150};
        g2.drawPolygon(a, b, 4);
    }
    
}
