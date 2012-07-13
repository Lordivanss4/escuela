import org.junit.*;
import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

	@Test
    public void alta() {
        alumno a= new alumno("ivan","zambrano","majalca").save();
        materia ma= new materia("español",10).save();
    }
    
    @Test
    public void buscar() {
        alumno a= alumno.find("byNombre","ivan").first();
        materia ma= materia.find("byMateria", "español").first();
        System.out.println("el nombre es: " + a.nombre);
        System.out.println("la materia es: " +ma.materia);
    }
    
    @Test
    public void cambio() 
    {
    	alumno a= alumno.find("byNombre","ivan").first();
    	a.nombre="erika";
    	a.save();
    	
    	materia ma= materia.find("byMateria","español").first();
    	ma.materia="matematicas";
    	ma.save();
    	
    	System.out.println("el nombre es: "+ a.nombre);
    	System.out.println("la materia es: "+ma.materia);
    	
        
    }
    @Test
    public void zel() 
    {
    	alumno a= alumno.find("byNombre","erika").first();
    	a.delete();
    	materia ma= materia.find("byMateria","matematicas").first();
    	ma.delete();
        
    }

}
