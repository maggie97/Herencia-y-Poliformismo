import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.Color;
/**
 * Write a description of class Lienzo here.
 * 
 * @author MaggieMendez 
 * @version (a version number or a date)
 */
public class Lienzo extends JPanel
{
    ArrayList <Figura> f;
    ArrayList <Color> Colores;
    Triangulo t;
    Circulo c ;
    Cuadrado s ;
    Rombo r ;
    Color azul = new Color(34, 193, 185);
    Color verde = new Color (124,252,0);
    Color rojo = new Color (	128,0,0);
    Color b = new Color(7, 48, 120);

    public Lienzo ()
    {
        
        f = new ArrayList<Figura>();
        Colores = new ArrayList <Color>();
        t = new Triangulo ( 240, 70, 50, 60);
        c = new Circulo (390,50, 60);
        s = new Cuadrado ( 350,50, 30);
        r = new Rombo(50, 150, 100);

    }
    @Override 
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        f.add(t); f.add(c); f.add(s); f.add(r);
        Colores.add (azul); Colores.add(verde); Colores.add(rojo);
        Colores.add(b);
        Iterator <Figura> it = f.iterator();
        Iterator <Color> iC = Colores.iterator();
        while(it.hasNext())
        {
            Color col = iC.next();
            Figura fig = it.next();
            fig.dibuja(g2);
            g.setColor(col);
        }    
    }
}