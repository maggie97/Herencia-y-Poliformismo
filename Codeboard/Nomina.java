import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/**
 * Write a description of class Nomina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nomina 
{
    private ArrayList <Empleado> empleado;
    
    public Nomina ()
    {
        empleado = new ArrayList<Empleado>();
    }
    public void addEmp(Empleado e)
    {
        empleado.add(e);
    }
    public float calculaSueldos()
    {
        float suma = 0;
        for(Empleado e: empleado)
        {
            e.calculaSalario();
            suma = e.daSueldo();
        }
        return suma;
    }
    public Empleado busca(String Nomb)
    {
        for(Empleado e: empleado)
        {
            if (e.daNombre() == Nomb)
            {
                return e;
            }
        }
        return null;
    }
    @Override
    public String toString()
    {
        return " ";
    }
    public void elimina(int dato)
    {
        for(int i = 0; i < empleado.size(); i++)
        {
            Empleado e = empleado.get(i);
            if( e.daSueldo()<dato)
            {
                empleado.remove(i);
            }
        }
    }
}
