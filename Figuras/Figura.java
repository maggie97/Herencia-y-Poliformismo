
/**
 * Write a description of class Figuras here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Figura
{
   protected float area;
   public Figura()
   {
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
   
}