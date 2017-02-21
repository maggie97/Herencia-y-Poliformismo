
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
    public Triangulo(float h, float b)
    {
        base = b;
        altura = h;
    }
    public void calculaArea()
    {
        area = (base * altura) / 2;
    }
}
