import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Planeta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Planeta
{
    private ArrayList <Pais> p;
    public Planeta()
    {
        p = new ArrayList<Pais>();
    }
    
    public void addPais(Pais nvo)
    {
        p.add(nvo);
    }
    public float habPromPais()
    {
        float suma = 0; 
        Iterator <Pais> it = p.iterator();
        while( it.hasNext()){
            Pais aux = it.next();
            suma += aux.daHabitantes();
        }
        return (suma/p.size());
    }
}
