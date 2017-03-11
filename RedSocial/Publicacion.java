import java.util.ArrayList;
import java.text.Format;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
/**
 * Write a description of class Publicacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Publicacion
{
    private String Usuario;
    private String MarcaTemp;
    private ArrayList <Comentario> c;
    private int DisLikes;
    private int Likes;
    private String Fecha;
    public Publicacion(String Us, String T)
    {
        
        Usuario = Us;
        c = new ArrayList<Comentario>();
        DisLikes = 0;
        Likes = 0;
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("hh:mm:ss");
        MarcaTemp = formateador.format(ahora);
        Fecha = ahora.toString();
    }
    public void AddComent(String us, String text)
    {
        Comentario a = new Comentario(text, us);
        c.add(a);
    }
    public int Puntuacion(int l)
    {
        if(l>0)
        {
            this.Likes = this.Likes + l;
        }
        else 
        {
            this.DisLikes = this.DisLikes + l;
        }
        return Likes;
    }
    
    public String HoraActual(){ return MarcaTemp; }
    public String daFecha() { return Fecha; }
    public String daUsuario() {  return Usuario; }
    public ArrayList <Comentario> daComentarios(){ return c;}
    public int daLikes(){ return Likes; }
    public int daDisLikes(){ return DisLikes; }
    
    
}

