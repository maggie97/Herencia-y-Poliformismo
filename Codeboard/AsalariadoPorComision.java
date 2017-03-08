
/**
 * Write a description of class AsalariadoXComision here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AsalariadoPorComision extends Empleado
{
    private float ventas;
    private float porcent;
    public AsalariadoPorComision(float s, float v, float p, String nomb){
        super(nomb, s);
        ventas = v;
        porcent = p;
    }
    @Override
    public void calculaSalario()
    {
        super.Sueldo(super.daSueldo() + (ventas*porcent));
    }
    @Override 
    public void imprimeDatos()
    {
        System.out.println(super.daSueldo());
    }
    
}
