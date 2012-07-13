package models;

import javax.persistence.Entity;

import play.db.jpa.Model;
@Entity
public class alumno extends Model
{
	public String nombre;
	public String apaterno;
	public String amaterno;
	
	public alumno(String n,String ap,String am)
	{
		nombre=n;
		apaterno=ap;
		amaterno=am;
	}

}

