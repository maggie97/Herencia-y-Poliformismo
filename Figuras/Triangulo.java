import java.awt.Graphics;
import java.awt.Graphics2D;
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
    public Triangulo(int x, int y, float h, float b)
    {
        super(x, y);
        base = b;
        altura = h;
    }
    public void calculaArea()
    {
        area = (base * altura) / 2;
    }
    public void dibuja(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        int []a = {50, 50, 80}; int []b = {50, 100, 100};
        g2.drawPolygon(a, b, 3);
    }
}
