import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class Figuras here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Figura
{
   protected float area;
   private int posx; 
   private int posy;
   public Figura(int x, int y)
   {
       posx = x; 
       posy = y;
       area = 0;
   }
   public float accedeArea()
   {
       return area;
   }
   public void calculaArea()
   {
       System.out.println("Ups!");
   }
   @Override
   public boolean equals(Object obj)
   {
       return this.area == ((Figura)obj).area;
   }
   public abstract void dibuja(Graphics g);
   public int DevolverX()
    { return posx; } 
    public int DevolverY()
    { return posy; } 
}
