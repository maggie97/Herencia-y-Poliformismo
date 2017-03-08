
/**
 * Write a description of class PorHora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PorHora extends Empleado
{
    private float horas;
    
    public PorHora(float h, float s, String nomb){
        super(nomb, s);
        horas = h;
    }
    @Override
    public void calculaSalario()
    {
        super.Sueldo(super.daSueldo()*horas);
    }
    @Override 
    public void imprimeDatos()
    {
        System.out.println(super.daSueldo());
    }
}
