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
    
    public float calculaPromedio()
    {
        Pais [] arrPlanetas = new Pais [p.size()];
        
        arrPlanetas = p.toArray(arrPlanetas);
        return Utileria.calculaPromedio(arrPlanetas);
    }
        
}
