
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
       Triangulo t1 = new Triangulo(3, 4 );
       Cuadrado s1 = new Cuadrado(3);
       Circulo c1 = new Circulo(3);
       t1.calculaArea();
       s1.calculaArea();
       c1.calculaArea();
       System.out.println(" El area del triangulo es = " + t1.accedeArea());
       System.out.println(" El area del cuadrado es = " + s1.accedeArea());
       System.out.println(" El area del circulo es = " + c1.accedeArea());
   }
}
