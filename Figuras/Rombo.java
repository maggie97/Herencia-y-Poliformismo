import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class Rombo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rombo extends Poligono
{
    int lado;
    /** Constructor for objects of class Rombo*/
    public Rombo(int x, int y, int l)
    {
        super(x, y);
        lado = l;
    }
    @Override
    public void dibuja(Graphics2D g2)
    { 
        int x_ = super.DevolverX();
        int y_ = super.DevolverY();
        int ladoY = (int)lado*10/12;
        int ladoX = (int)lado*5/12;
        int []a = {x_, x_+ladoX , x_, x_-ladoX}; int []b = {y_, y_+ladoY , y_+ladoY*2, y_+ladoY};
        g2.drawPolygon(a, b, 4);
    }
    
}
