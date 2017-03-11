
/**
 * Write a description of class Comentario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comentario
{
    private String Usuario;
    private String Comentario;
    
    public Comentario(String u, String c)
    {
        Usuario = u;
        Comentario = c;
    }
    
    public String daUsuario()
    {
        return Usuario;
    }
    
    public String daComent()
    {
        return  Comentario;
    }
}