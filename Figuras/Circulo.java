
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circulo extends Figura
{
    private float radio;
    public float pi = (float)3.14;
    public Circulo(float r)
    {
        radio = r;
    }
    public void calculaArea()
    {
        area = pi*(float)Math.pow(radio, 2);
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Circulo) 
        {
            return this.radio == ((Circulo)obj).radio;
        }
        else 
        {
            return false;
        }
    }
}
