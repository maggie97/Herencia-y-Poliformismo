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
    @Override
    public void dibuja(Graphics2D g2)
    {
        int x_ = super.DevolverX();
        int y_ = super.DevolverY();
        int []a = {x_, x_ +(int)base/2, x_-(int)base/2}; int b[] = {y_, y_+(int)altura, y_+(int)altura};
            //50, 50, 80}; int []b = {50, 100, 100};
        g2.drawPolygon(a, b, 3);
    }
}
