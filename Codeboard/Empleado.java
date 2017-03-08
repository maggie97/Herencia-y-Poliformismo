
/**
 * Write a description of class Empleado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Empleado implements Comparable
{
    private String nombre;
    private float sueldo;
    public Empleado(String n, float s)
    {
        nombre = n;
        sueldo = s;
    }
    public void Sueldo(float s)
    {  
        sueldo = s; 
    }
    @Override
    public int compareTo(Object other)
    {
        Empleado tmp = (Empleado)other;
        int ret = 0;
        if(this.nombre == tmp.nombre)
            ret = 1;
        return ret;
    }
    @Override
    public String toString()
    {
        return "El empleado " + nombre+ " gana " + sueldo;
    }
    public float daSueldo(){ return sueldo;}
    public String daNombre(){ return nombre;}
    public abstract void imprimeDatos();
    public abstract void calculaSalario();
    
}
