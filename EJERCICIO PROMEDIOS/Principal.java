
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
      Banco b = new Banco ();
      Planeta P = new Planeta();
      
      CuentaBancaria cB1 = new CuentaBancaria(100);
      CuentaBancaria cB2 = new CuentaBancaria(200);
      CuentaBancaria cB3 = new CuentaBancaria(300);
      b.addCuenta(cB1);b.addCuenta(cB2);b.addCuenta(cB3);
      //b.calculaPromedio();
      System.out.println(b.calculaPromedio());
      Pais p1 = new Pais(25);
      Pais p2 = new Pais(32);
      Pais p3 = new Pais(94);
      P.addPais(p1);P.addPais(p2);P.addPais(p3);
      System.out.println(P.calculaPromedio());
      
      /*Medible Datos;
      float promedioHab;
      float promedioCuentas;
      Medible [] Bank = new Medible[3];
      Medible [] Planet = new Medible[3];
      Bank[0] = new CuentaBancaria(100);
      Bank[1] = new CuentaBancaria(200);
      Bank[2] = new CuentaBancaria(300);
      
      Planet[0] = new Pais(25);
      Planet[1] = new Pais(32);
      Planet[2] = new Pais(94);*/
      
      //promedioHab = Datos.calculaPromedio(Planet);
      
      //promedioCuentas = Datos.calculaPromedio(Bank);
      
   } 
}
