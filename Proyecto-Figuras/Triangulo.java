
/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangulo extends Figura
{
    private float base;
    private float altura;
    public Triangulo(float b, float h)
    {
        altura = h;
        base = b;
    }
    public void calculaArea()
    {
        area = (base * altura)/2;
    }
}
