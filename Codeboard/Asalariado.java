
/**
 * Write a description of class Asalariado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asalariado extends Empleado
{
    public Asalariado(float s, String nomb){
        super(nomb, s);
    }
    @Override
    public void calculaSalario()
    {
        super.daSueldo();
    }
    @Override 
    public void imprimeDatos()
    {
        System.out.println(super.daSueldo());
    }
    
}
