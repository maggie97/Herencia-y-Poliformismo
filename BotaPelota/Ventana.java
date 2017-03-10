
import javax.swing.JFrame;

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
    public Ventana(int ancho, int alto)
    {
        this.setSize(ancho, alto);
        dibujo = new Lienzo();
        //dibujo.addKeyListener(dibujo);
        this.add(dibujo);
        EscuchadorTeclado esT = new EscuchadorTeclado();
        this.addKeyListener(esT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    class EscuchadorTeclado implements KeyListener
    {
        
    
        @Override 
        public void keyPressed(KeyEvent e)
        {
            System.out.println("keyPressed : " + e.getKeyChar());
            if(e.getKeyChar() == 'd' ){
                //detener timer
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
}
