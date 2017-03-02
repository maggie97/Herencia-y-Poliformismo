import java.awt.Graphics;
import java.awt.Graphics2D;
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
    public Circulo(int x, int y, float r)
    {
        super(x, y);
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
    @Override
    public void dibuja(Graphics2D g2)
    {
        g2.drawOval(super.DevolverX(), super.DevolverY(), (int)radio*2, (int)radio*2);
    }
        
}
