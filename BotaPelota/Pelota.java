import java.awt.Graphics;
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
    public Pelota (int x, int y, int r)
    {
        posX = x;
        posY = y;
        radio = r;
    }
    public void dibujate(Graphics g)
    {
        g.drawOval(posX, posY, radio*2, radio*2);
    }
    /*public void muevete(Rectangle r)
    {
        int x; int y;
        posX += x;
        posY += y;
        if (posY+radio>= r.Height()){
            y *= -1;
        }
        else if( posY+radio<= r.Height()){
            y *= -1;
        }
        else if(posX+radio>= r.Weight){
            x *= -1;
        }
        
    }*/
}
