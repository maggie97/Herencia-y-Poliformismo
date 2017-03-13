import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.util.LinkedList;
import java.awt.Rectangle;
/**
 * Write a description of class Lienzo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lienzo extends JPanel 
{
    private LinkedList<Pelota> pelotas ;
    
    public Lienzo()
    {
        pelotas = new LinkedList<Pelota>();
        pelotas.add(new Pelota(100,100,10));
        EscuchadorMouse escuchMouse = new EscuchadorMouse();
        this.addMouseListener(escuchMouse);
    }
    
    @Override 
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for(Pelota p: pelotas){
            p.dibujate(g);
        }
    }
    
    public void actua()
    {
        Rectangle r = this.getBounds();
        for(Pelota p: pelotas){
            p.muevete(r);
        }
        this.repaint();
    }
    class EscuchadorMouse extends MouseAdapter
    {
        @Override 
        public void mouseClicked(MouseEvent e)
        {   
            //  System.out.println(
            int tamRandom = 10+ (int)(Math.random()*20);
            pelotas.add(new Pelota(e.getX(), e.getY(), tamRandom));
            //pelotas.muevete());
        }
    }
}
