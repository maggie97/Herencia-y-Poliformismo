
/**
 * Write a description of class Comision here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comision extends Empleado
{
    private float ventas;
    private float porcent;
    public Comision( float v, float p, String nomb){
        super(nomb, 0);
        ventas = v;
        porcent = p;
    }
    @Override
    public void calculaSalario()
    {
        super.Sueldo(ventas * porcent);
    }
    @Override 
    public void imprimeDatos()
    {
        System.out.println(super.daSueldo());
    }
}
