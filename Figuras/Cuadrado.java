import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * Write a description of class Cuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cuadrado extends Poligono
{
    private float lado;
    public Cuadrado(int x, int y, float l)
    {
        super(x, y);
        lado = l;
    }
    public void calculaArea()
    {
        area = (float)Math.pow(lado, 2);
    }
    @Override
    public void dibuja(Graphics2D g2)
    {
        g2.drawRect(super.DevolverX(), super.DevolverY(), (int)lado, (int)lado);
    }
}
