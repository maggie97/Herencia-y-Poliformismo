
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
      CuentaBancaria cB1 = new CuentaBancaria(100);
      CuentaBancaria cB2 = new CuentaBancaria(200);
      CuentaBancaria cB3 = new CuentaBancaria(300);
      b.addCuenta(cB1);b.addCuenta(cB2);b.addCuenta(cB3);
      //b.saldoPromedio();
      System.out.println(b.saldoPromedio());
      
   } 
}
