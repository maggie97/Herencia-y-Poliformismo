import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

/**
 * Write a description of class Ventana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ventana extends JFrame
{
    private Lienzo dibujo;
    private Timer tiempo;
    public Ventana(int ancho, int alto)
    {
        this.setSize(ancho, alto);
        dibujo = new Lienzo();
        this.add(dibujo);
        //dibujo.addKeyListener(dibujo);
        
        EscuchadorTeclado esT = new EscuchadorTeclado();
        this.addKeyListener(esT);
        
        EscuchadorTiempo escuchador = new EscuchadorTiempo();
        tiempo = new Timer (100, escuchador);
        tiempo.start();
        
        this.setSize(ancho, alto);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    class EscuchadorTeclado implements KeyListener
    {
        
        @Override 
        public void keyPressed(KeyEvent e)
        {
            System.out.println("keyPressed : " + e.getKeyChar());
            if (e.getKeyChar() == 'd'){
                tiempo.stop();
            }
            else if (e.getKeyChar() == 'i') {
                tiempo.start();
            }
        }
    
        @Override 
        public void keyReleased(KeyEvent e)
        {
            System.out.println("keyReleased: " + e.getKeyChar());
        }
    
        @Override 
        public void keyTyped(KeyEvent e)
        {
            System.out.println("keyTyped: " + e.getKeyChar());
        }
    }
    
    class EscuchadorTiempo implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            System.out.println("Hola pelota");
            dibujo.actua();
        }
    }
}
