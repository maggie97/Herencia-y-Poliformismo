import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
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
   Color azul = new Color(34, 193, 185);
   Color verde = new Color (124,252,0);
   Color rojo = new Color (	128,0,0);
   Color b = new Color(7, 48, 120);
   
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
   //@Override
   abstract public void dibuja(Graphics2D g);
   public int DevolverX()
   { return posx; } 
   public int DevolverY()
   { return posy; } 
}
