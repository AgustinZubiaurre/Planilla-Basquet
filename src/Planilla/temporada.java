package Planilla;

import java.io.Serializable;
import java.util.HashMap;

public class temporada implements Serializable 
{
	protected int anio;				// año de la liga
	protected String liga;			// nombre de la liga 
	protected HashMap<String,equipo> ListaEquipos = new HashMap<String,equipo>();
	
	// CONTRUCTORES 
	
	public temporada()					// inicializar temporada 
	{
		anio = 0;		
		liga = " ";		
	}
	
	public temporada(int a , String l)   // inicializo cargandole el año y el nombre de la liga 
	{
		anio = a;		
		liga = l;		
	}
	
	
	// METODOS 
	
	public void AgregaEquipo(String nombre, String entrenador)	//  agrega un equipo a la lista de la temporada 
	{					
		equipo E = new equipo(nombre,entrenador); 	                             	// creo el equipo 	
		ListaEquipos.put(nombre, E);												// cargo equipo a la lista de la temporada	
	}
	
	
	public equipo DevuelveEquipo (String nombre) // busca un equipo en particular y lo devuelve			
	{									 
		 	equipo E = ListaEquipos.get(nombre);		// por el nombre del equipo devuelve 	
			return E;	
	}
	
	public void AgregaEquipoDirecto (equipo a )		// agrega un equipo pasandoselo directamente por parametro
	{		
		String nombre = a.getNombreEquipo();		
		ListaEquipos.put(nombre, a);		
	}
	
	// GET AND SET 
	
	public int getAnio() 
	{
		return anio;
	}

	public String getLiga() 
	{
		return liga;
	}

	public HashMap<String,equipo> getListaEquipos() 
	{
		return ListaEquipos;
	}
	
}