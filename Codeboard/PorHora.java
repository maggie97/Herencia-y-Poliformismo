
/**
 * Write a description of class PorHora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PorHora extends Empleado
{
    private int horas;
    
    public PorHora(int h, float s, String nomb){
        super(nomb, s);
        horas = h;
    }
    @Override
    public void calculaSalario()
    {
        int aux = 0;
        if(horas>40)
        {
            aux = horas - 40;
            super.Sueldo(super.daSueldo()*40 + super.daSueldo()*aux*2);
        }
        else 
        {
            super.Sueldo(super.daSueldo()*horas);
        }
    }
    @Override 
    public void imprimeDatos()
    {
        System.out.println(super.daSueldo());
    }
}
