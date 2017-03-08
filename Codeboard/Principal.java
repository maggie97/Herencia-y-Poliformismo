
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
    private static void main(String [] agrs)
    {
        Nomina a = new Nomina();
        Asalariado As= new Asalariado( 800, "Jack");
        Comision C = new Comision(10000, 6/100, "Phill");
        AsalariadoPorComision AC = new AsalariadoPorComision(300, 5000, 4/100, "Mitchell");
        PorHora H = new PorHora(42, (float)(16.75), "Luke");
        a.addEmp(As); a.addEmp(C); a.addEmp(AC); a.addEmp(H);
        System.out.println(a.calculaSueldos());
        
    }
}
