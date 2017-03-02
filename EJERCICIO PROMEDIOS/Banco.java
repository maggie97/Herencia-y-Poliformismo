import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Banco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banco
{
    private ArrayList <CuentaBancaria> coleccion;
    public Banco()
    {
       coleccion = new ArrayList<CuentaBancaria>();
    }
    public void addCuenta(CuentaBancaria nvo)
    {
        coleccion.add(nvo);
    }
    public float saldoPromedio()
    {
        float suma = 0; 
        Iterator <CuentaBancaria> it = coleccion.iterator();
        while( it.hasNext()){
            CuentaBancaria aux = it.next();
            suma += aux.daSaldo();
        }
        return (suma/coleccion.size());
    }
}
