import java.awt.Graphics;
import java.awt.Rectangle;
/**
 * Write a description of class Pelota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelota
{
    private int posX;
    private int posY;
    private int radio;
    private int incx;
    private int incy;
    
    public Pelota (int x, int y, int r)
    {
        posX = x;
        posY = y;
        radio = r;
        incx = 10;
        incy = 10;
    }
    public void dibujate(Graphics g)
    {
        g.drawOval(posX, posY, radio*2, radio*2);
    }
    public void muevete(Rectangle r)
    {
        posX += incx;
        posY += incy;
        System.out.println(" y = " + incy + " x = " + incx + "radio = " + radio);
        if (posY < radio||  posY > r.getHeight() - radio){
            incy *= -1;
            System.out.println(" y1 = " + incy);
        }
        else if(posX < radio|| posX > r.getWidth() - radio*2){
            incx *= -1;
        }
        
    }
}
