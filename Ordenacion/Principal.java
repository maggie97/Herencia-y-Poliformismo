import java.util.ArrayList;
import java.util.Arrays;
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
    public static void main ( String [] args)
    {
        ArrayList <Alumno> alumnos;
        alumnos = new ArrayList<Alumno>();
        alumnos.add(new Alumno(150));
        alumnos.add(new Alumno(75));
        alumnos.add(new Alumno(80));
        alumnos.add(new Alumno(250));
        alumnos.add(new Alumno(200));
        //Transforma el array list en un arreglo 
        Alumno [] arrAlumnos;
        arrAlumnos = new Alumno[alumnos.size()];
        arrAlumnos = alumnos.toArray(arrAlumnos);
        Arrays.sort(arrAlumnos); //ordena de menor a mayor 
        System.out.println("Contenido del Array List");
        for(Alumno a: alumnos)
            System.out.println(a);
        System.out.println("Contenido del arreglo ");
        for(Alumno a: alumnos)
            System.out.println(a);
        
    }
}
