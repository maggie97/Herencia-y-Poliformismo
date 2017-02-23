import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
   public static void main(String[] args)
   {
       //Figura [] fig = new Figura[3];
       ArrayList <Figura> fig = new ArrayList <Figura>();
       Triangulo t1 = new Triangulo(3, 4 );
       Cuadrado s1 = new Cuadrado(3);
       Circulo c1 = new Circulo(3);
       fig.add(t1);
       fig.add(s1);
       fig.add(c1);
       Iterator <Figura> aux1 = fig.iterator();
       Iterator <Figura> aux2 = fig.iterator();
       while(aux1.hasNext())
       {
           //Figura a = new aux1.next();   
           // a.calculaArea();
       }
       for(Figura a: fig)
       {
            System.out.println(" El area del triangulo es = " + a.accedeArea());
       }
   }
}
