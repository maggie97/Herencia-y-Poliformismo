import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Lienzo here.
 * 
 * @author MaggieMendez 
 * @version (a version number or a date)
 */
public class Lienzo extends JPanel
{
    @Override 
    public void paintComponent(Graphics g)
    {
        int []a = {50, 50, 80}; int []b = {50, 100, 100};
        Graphics2D g2 = (Graphics2D) g;
        Circulo c = new Circulo(60, 70, 20);
        Triangulo t = new Triangulo(100, 100, 50, 20);
        Cuadrado s = new Cuadrado(200,200,30);
        ArrayList <Figura> f = new ArrayList <Figura>();
        
        f.add(c);
        f.add(t);
        f.add(s);
        Iterator <Figura> it = f.iterator();
        while(it.hasNext())
        {
            Figura fig = it.next();
            fig.dibuja(g);
        }
    }
}