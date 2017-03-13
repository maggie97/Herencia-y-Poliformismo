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
        int rand = (int)(Math.random()*2)-1;
        if(rand == 0){
            rand = -1;
        }
        incx = 10*rand;
        incy = 10*rand;
    }
    public void dibujate(Graphics g)
    {
        g.drawOval(posX, posY, radio*2, radio*2);
    }
    public void muevete(Rectangle r)
    {
        posX += incx;
        posY += incy;
        if (posY < radio||  posY > r.getHeight() /*- radio*/){
            incy *= -1;
        }
        else if(posX < radio|| posX > r.getWidth() - radio*2){
            incx *= -1;
        }
    }
}
