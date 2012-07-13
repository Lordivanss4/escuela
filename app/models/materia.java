package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class materia extends Model
{
	public String materia;
	public int creditos;
	
	
	public materia(String m,int cr)
	{
		materia=m;
		creditos=cr;
		
	}

}
