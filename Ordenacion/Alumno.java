
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno implements Comparable
{
    private int creditos;
    public Alumno ( int c)
    {
        creditos = c;
    }
    @Override
    public int compareTo(Object other)
    {
        Alumno tmp = (Alumno)other;
        int ret = 0;
        if(this.creditos == tmp.creditos)
            ret = 0;
        if(this.creditos < tmp.creditos)
            ret = -1;
        if(this.creditos > tmp.creditos)
            ret = 1;
        return ret;
        //Version economica 
        // return creditos - ((Alumnos)other).creditos)
    }
}
