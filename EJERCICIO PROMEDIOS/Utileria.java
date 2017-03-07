import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Utileria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Utileria
{
   
    public static float calculaPromedio(Medible [] colecc)
    {
        float suma = 0;
        for(Medible aux: colecc)
        {
            suma += aux.obtenerMedida();
        }
        if(colecc.length >0) { return suma/colecc.length;}
        else {  return 0;} 
    }
}
