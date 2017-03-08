
/**
 * Write a description of class Empleado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Empleado
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
    public float daSueldo(){ return sueldo;}
    public abstract void imprimeDatos();
    public abstract void calculaSalario();
}
