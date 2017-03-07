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
    public float calculaPromedio()
    {
        CuentaBancaria [] arrCuentas = new CuentaBancaria [coleccion.size()];
        for(int i = 0; i<coleccion.size(); i++)
        {
            arrCuentas[i] = coleccion.get(i);
        }
        // arrCuentas = coleccion.toArray(arrCuentas);
        return Utileria.calculaPromedio(arrCuentas);
    }
}
