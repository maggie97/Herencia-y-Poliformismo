
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
      //b.saldoPromedio();
      System.out.println(b.saldoPromedio());
      Pais p1 = new Pais(25);
      Pais p2 = new Pais(32);
      Pais p3 = new Pais(94);
      P.addPais(p1);P.addPais(p2);P.addPais(p3);
      System.out.println(P.habPromPais());
   } 
}
