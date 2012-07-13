package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void alta(String nombre, String apaterno, String amaterno,String materia,int creditos) 
    {
    	alumno a=null;
    	materia ma=null;
    	if(nombre!=null && apaterno!=null && amaterno!=null && materia!=null)
    	{
    		a=new alumno(nombre,apaterno,amaterno).save();
    		ma=new materia(materia,creditos).save();
    	}
        render(a, ma);
    }

    public static void cambio(String nombre1, String nombre2,String materia1,String materia2) 
    {
    	alumno a=null;
    	materia ma=null;
    	if(nombre1!=null && !nombre1.equals("") && materia1!=null && !materia1.equals(""))
    	{
    		a= alumno.find("byNombre", nombre1).first();
    		if(a!=null)
    		{
    			a.nombre=nombre2;
    			a.save();
    		}
    		ma= materia.find("byMateria", materia1).first();
    		if(ma!=null)
    		{
    			ma.materia=materia2;
    			ma.save();
    		}
    	}
        render(a,ma);
    }
    
    public static void del(String nombre, String materia) 
    {
    	alumno a=null;
    	materia ma=null;
    	if(nombre!=null && !nombre.equals("") && materia!=null && !materia.equals(""))
    	{
    		a= alumno.find("byNombre", nombre).first();
    		if(a!=null)
    		{
    			
    			a.delete();
    		}
    		ma= materia.find("byMateria", materia).first();
    		if(ma!=null)
    		{
    			
    			ma.delete();
    		}
    		
    	}
        render(a,ma);
    }


}