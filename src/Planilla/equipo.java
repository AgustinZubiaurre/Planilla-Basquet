package Planilla;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Set;

import Estadisticas.estadisticasEquipo;

public class equipo implements Serializable 
{
	protected String nombreEquipo;
	protected String nombreEntrenador;
	protected HashMap<String,partido> listaPartidos = new HashMap<String,partido>();	//  PARTIDOS (va a distingir por fecha)
	protected HashMap<Integer,jugador>  plantel  =  new HashMap<Integer,jugador>();  	// JUGADORES (va a distinguir por dorsal)
	protected estadisticasEquipo estadisticas; 
	
	// CONTRUCTORES 
	
	public equipo() 
	{
		nombreEquipo = "";		
		nombreEntrenador = "";		
		estadisticas = new estadisticasEquipo();	
	} 

	public equipo (String n, String e) 
	{		
		nombreEquipo = n;	
		nombreEntrenador = e;
		estadisticas = new estadisticasEquipo();		
	} 
	
	// METODOS
	
		// jugador
	
	public void AgregarJugador (String nombre, String apellido, String posicion, int dorsal) 			// Carga jugadores al equipo pasandole sus atributos 
	{	
		jugador A = new jugador (nombre, apellido, posicion , dorsal);	
		plantel.put(A.getDorsal(),A);     	                                // el plantel distingue por dorsal a los jugadores 	
	}

	public jugador DevuelveJugador (int dorsal) 						// devuelve un jugador del plantel a traves del numero de dorsal
	{	
		jugador A =  plantel.get(dorsal);	
		return A;
	}
	
	public jugador DevuelveJugadorPorNombre (String apellido) // devuelve jugador del plantel a traves de su nombre
	{	
		Set <Integer> dorsales = plantel.keySet();								// creo una variable que contenga todas las keys del hashmap plantel
		jugador buscado = null; 												// el jugador que voy a devolver		
		for (Integer dorsal : dorsales) 
		{										// recorro todo el hashmap con un foreach			
			jugador aux = plantel.get(dorsal);									// busco al jugador			
			if ( aux.getApellido().equals(apellido) ) 
			{																																		
				buscado = aux;							    																													
			}	
		}
		return buscado;	
	}	
		// partido
	
	public void AgregaPartidoDirecto (partido a)						// agrega un partido a la lista de partidos del equipo, pasandole por parametro un partido
	{
		String fecha = a.getFecha();
		listaPartidos.put(fecha,a);	                                       // lo agrego  a la lista de partidos de ese equipo, con la key de fecha. 	
	}
	
	public void AgregaPartido (int tiempo, int periodo , String fecha , equipo Local , equipo Visitante) // agrega un partido a la lista de partidos del equipo, pasandole por parametro los atributos de un partido
	{		
		partido P = new partido ( tiempo, periodo , fecha , Local , Visitante);	   // creo el partido con los periodos , la fecha y los equipos local y visitante	
		listaPartidos.put(fecha,P);	                                       // lo agrego  a la lista de partidos de ese equipo	
	}

	public partido DevuelvePartido (String fecha) // devuelve un partido de la lista de partidos  a traves de la fecha
	{	
		partido P = listaPartidos.get(fecha);	
		return P;
	}	

		//estadistica
	
	public void CargaEstadistica (int accion)   // recive el numero de una accion de una incidencia para cargarla a sus estadisticas de equipo
	{
		switch(accion) 		// depende el numero de la accion va a cargar diferente atributo
		{
			case 1 : 
				
				estadisticas.CargaDobleConvertido();
			
			break;
			
			case 2 : 
				
				estadisticas.CargaDobleErrado();
		
			break;
			
			case 3 : 
				
				estadisticas.CargaTripleConvertido();
		
			break;
			
			case 4 : 
				
				estadisticas.CargaTripleErrado();
		
			break;
			
			case 5 : 
				
				estadisticas.CargaSimpleConvertido();
		
			break;
			
			case 6 : 
				
				estadisticas.CargaSimpleErrado();
			
				break;
				
			case 7 : 
				
				estadisticas.CargaFalta();
			
				break;
				
			case 8 : 
				
				estadisticas.CargaFaltaTecnica();
			
				break;
			
			case 9 : 
				
				estadisticas.CargaAsistencias();
			
				break;
			
			case 10 : 
				
				estadisticas.CargaPerdida();
			
				break;
				
			case 11 : 
				
				estadisticas.CargaRobo();
			
				break;
				
			case 12 : 
				
				estadisticas.CargaReboteDefensa();
			
				break;
				
			case 13 : 
				
				estadisticas.CargaReboteAtaque();
			
				break;
				
			case 14 : 
				
				estadisticas.CargaTapa();
				
				break;
		}
	}

	public void CargaResultado (boolean a) 	// si es true guarda una victoria en las estadisticas si es false en perdido
	{					
		
		if (a)
		{			
			estadisticas.CargaPartidoGanado();
			
		} 
		else 
		{			
			estadisticas.CargaPartidoPerdido();			
		}		
	}
	
	public HashMap<Integer,jugador> devolverPlantel()								// devuelve el plantel
	{
		return plantel;
	}
	// GET Y SET 
	
	public String getNombreEquipo()
	{
		return nombreEquipo;
	}

	public String getNombreEntrenador()
	{
		return nombreEntrenador;
	}
	
	public HashMap<String,partido> getListaPartidos() 
	{
		return listaPartidos;
	}
		
	public HashMap<Integer,jugador> getPlantel ()								// devuelve el plantel 
	{
		return plantel;
	}

	public estadisticasEquipo getEstadisticas() {
		return estadisticas;
	}

	public void setEstadisticas(estadisticasEquipo estadisticas) {
		this.estadisticas = estadisticas;
	}

}