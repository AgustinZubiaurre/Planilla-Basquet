package Planilla;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import Cronometro.cronometro;
import Estadisticas.estadisticasJugador;
import Estadisticas.estadisticasPartido;

public class partido implements Serializable 
{	
	protected int tiempo;					// tiempo de un periodo 
	protected int periodo;				// cantidad de periodos
	protected String fecha;				// fecha del partido 
	protected cronometro cronometro;			// cronometro del partido
	protected equipo Local;		
	protected equipo Visitante;		
	protected estadisticasPartido estadisticas;		
	protected ArrayList<incidencia> ListaIncidencias = new ArrayList<incidencia>();																	// Arreglo de incidencias en un partido	
	HashMap<Integer, jugador> titularesLocales = new HashMap<Integer, jugador>();	
	HashMap<Integer, jugador> suplentesLocales = new HashMap<Integer, jugador>();	
	HashMap<Integer, jugador> titularesVisitantes = new HashMap<Integer, jugador>();	
	HashMap<Integer, jugador> suplentesVisitantes = new HashMap<Integer, jugador>();
	
	// CONSTRUCTOR 
	
	public partido()
	{			
		tiempo = 0;		
		periodo = 0 ; 			
		fecha = "  " ;		
		estadisticas = new estadisticasPartido();		
	}
	
	public partido (int t, int p, String f, equipo L, equipo V)
	{		
		tiempo = t;		
		periodo =  p;				
		fecha =  f;				
		Local = L;													// equipo local 		
		Visitante = V;											// equipo visitante		
		estadisticas = new estadisticasPartido();	
	}
		
	// METODOS
	
		// jugadores
	
	public void TitularesLocal (HashMap<Integer, jugador> plantel)	// jugadores titulares del equipo local	
	{																			
		/* la idea es mostrar la lista de jugadores marcar los que van a hacer titulares y cambiarlos a traves de setenCancha a true.
		entonces recorro el hashmap y creo una nueva lista (hashmap) con los jugadores que van a ser titulares (enCancha = true). */
		
		jugador aux = new jugador();		
		Set <Integer> dorsales = plantel.keySet();								// creo una variable que contenga todas las keys del hashmap plantel
		
		for (Integer dorsal : dorsales) 
		{														                // recorro todo el hashmap con un foreach
			aux = plantel.get(dorsal);											// busco al jugador
			
			if (aux.getEnCancha() ) 
			{																	// si enCancha es TRUE
				titularesLocales.put(aux.getDorsal(), aux);					    // lo agrega a la lista de titulares 
			}	
		}
	}
	
	public void TitularesVisitantes (HashMap<Integer, jugador> plantel)
	{																			// jugadores titulares del equipo visitante	
		/* la idea es mostrar la lista de jugadores marcar los que van a hacer titulares y cambiarlos a traves de setenCancha a true.
		entonces recorro el hashmap y creo una nueva lista (hashmap) con los jugadores que van a ser titulares (enCancha = true). */
		
		jugador aux = new jugador();
		
		Set <Integer> dorsales = plantel.keySet();								// creo una variable que contenga todas las keys del hashmap plantel
		
		for (Integer dorsal : dorsales) 
		{														                // recorro todo el hashmap con un foreach
			aux = plantel.get(dorsal);											// busco al jugador
			
			if (aux.getEnCancha() ) 
			{																	// si enCancha es TRUE
				titularesVisitantes.put(aux.getDorsal(), aux);					// lo agrega a la lista de titulares 
			}	
		}
	}
	
	public void SuplentesLocal (HashMap<Integer, jugador> plantel)						// jugadores suplentes del equipo local	
	{																		
		jugador aux = new jugador();
		
		Set <Integer> dorsales = plantel.keySet();							// creo una variable que contenga todas las keys del hashmap plantel
		
		for (Integer dorsal : dorsales) 
		{														   			// recorro todo el hashmap con un foreach
			aux = plantel.get(dorsal);										// busco al jugador
			
			if (aux.getEnCancha() == false) 
			{																// si enCancha es FALSE
				suplentesLocales.put(aux.getDorsal(), aux);			        // lo agrega a la lista de suplentes 
			}		
		}
	}
	
	public void SuplentesVisitantes (HashMap<Integer, jugador> plantel)// jugadores suplentes del equipo visitante	
	{																			
		jugador aux = new jugador();
		
		Set <Integer> dorsales = plantel.keySet();								// creo una variable que contenga todas las keys del hashmap plantel
		
		for (Integer dorsal : dorsales) 
		{														                // recorro todo el hashmap con un foreach
			aux = plantel.get(dorsal);											// busco al jugador
	
			if (aux.getEnCancha() == false ) 
			{																	// si enCancha es FALSE
				suplentesVisitantes.put(aux.getDorsal(), aux);			        // lo agrega a la lista de suplentes 
			}	
		}
	}

		// incidencias
	
	public void GuardaIncidencia(String nombreEquipo, String tiempo, int dorsal, int accion) 		// funcion para cargar la incidencia con los datos y guardar en el arreglo
	{													
		incidencia Inc = new incidencia(nombreEquipo, tiempo, dorsal, accion); 			
		ListaIncidencias.add(Inc);
	}

	// estadisticas 
	
	private int DevuelvePuntosDeUnEquipo (equipo a) // se usa para el metodo DevuelveGanador
	{											
		incidencia incidencia = null; 
		int puntos = 0; 		// contador de puntos	
		for (int i = 0; i < ListaIncidencias.size() ; i++) 
		{		
			incidencia = ListaIncidencias.get(i);	
			if (a.getNombreEquipo().equals( incidencia.getNombreEquipo() ) ) 
			{				
				if (incidencia.getAccion() == 1) // si la incidencia es del equipo entra 
				{								
					puntos = puntos + 2 ; 				// codigo 1 es doble convertido	
				}			
				if (incidencia.getAccion() == 3) // codigo 3 es triple convertido
				{									
					puntos = puntos + 3 ; 				
				}			
				if (incidencia.getAccion() == 5) // codigo 5 es simple convertido
				{									
					puntos = puntos + 1 ; 				
				}			
			}			
		}	
					
		return puntos; 		
	}
	
	public equipo DevuelveGanador ()		// devuelve el equipo que gano el partido
	{																				
		int puntosLocal = DevuelvePuntosDeUnEquipo(Local);		
		int puntosVisitante = DevuelvePuntosDeUnEquipo(Visitante);		
		equipo a = null;																												// creo un equipo auxiliar que voy a retornar
		if (puntosLocal > puntosVisitante){			
			 a = Local;			
		} 
		else 
		{
			a = Visitante;			
		}
		
		return a;		
	}
	
	// estadistica de partido 
	
	public void CargaEstadistica (int accion)  // recive una accion de una incidencia y la carga en sus estadisticas 
	{													
		switch(accion)  // dependiendo del numero de la accion lo va a cargar en un atributo diferente
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

	// estadisticas totales
	
	public void CargaEstadisticasTotales () 							// carga todas las estadisticas en los equipos, jugadores y partido
	{														
		for(incidencia incidencia : ListaIncidencias){
			
			if(incidencia.getNombreEquipo().equals(Local.getNombreEquipo() )  ) {			//si la incidencia tiene el nombre de ese equipo 
				
				jugador a = Local.DevuelveJugador(incidencia.getDorsal() );							// devuelve el jugador de la incidencia 
						
				a.CargaEstadistica(incidencia.getAccion() );											// y le carga la estadisitica al jugador
				
				Local.CargaEstadistica(incidencia.getAccion() );										// le carga la estadisitica al equipo			
			} 
			else 
			{		
				jugador a = Visitante.DevuelveJugador(incidencia.getDorsal() );							// devuelve el jugador de la incidencia 				
				a.CargaEstadistica(incidencia.getAccion() );											// le carga la estadisitica 				
				Visitante.CargaEstadistica(incidencia.getAccion() );									// carga la estadisitica al equipo					
			}			
			CargaEstadistica(incidencia.getAccion() );													// carga la estadistica al partido
						
		} // for each 
		
		if (DevuelveGanador() == Local)
		{																// si el ganador es el local			
			Local.CargaResultado(true);   		// gano el partido 																
			Local.CargaResultado(false);   		// perdio el partido 		
		} else 
		{												// si el ganador es el visitante	
			Visitante.CargaResultado(false);   		// perdio el partido 	
			Visitante.CargaResultado(true);   		// gano el partido 
		}	
	}

	// finalizar partido 
	
	public void FinalizarPartido ()  // metodo que se utiliza para finalizar toda la carga de estadisticas 
	{															 // se creo con el fin de que si se quiere agregar algo mas al finalizar un partido el metodo este limpio para su uso		
		
		CargaEstadisticasTotales();
	}
	
	// GET Y SET 
	
	public int getPeriodo() 
	{
		return periodo;
	}

	public void setPeriodo(int periodo) 
	{
		this.periodo = periodo;
	}

	public estadisticasPartido getEstadisticas() {
		return estadisticas;
	}

	public void setEstadisticas(estadisticasPartido estadisticas) {
		this.estadisticas = estadisticas;
	}

	public void setListaIncidencias(ArrayList<incidencia> listaIncidencias) 
	{
		ListaIncidencias = listaIncidencias;
	}

	public ArrayList<incidencia> getListaIncidencias() 
	{
		return ListaIncidencias;
	}
	
	public String getFecha() 
	{
		return fecha;
	}

	public void setFecha(String fecha) 
	{
		this.fecha = fecha;
	}

	public equipo getLocal()
	{
		return Local;
	}

	public void setLocal(equipo local) 
	{
		Local = local;
	}

	public equipo getVisitante()
	{
		return Visitante;
	}

	public void setVisitante(equipo visitante)
	{
		Visitante = visitante;
	}
	
	public cronometro getCronometro() 
	{
		return cronometro;
	}

	public void setCronometro(cronometro cronometro) 
	{
		this.cronometro = cronometro;
	}
	
	public HashMap<Integer, jugador> getTitularesLocales()
	{
		return titularesLocales;
	}

	public HashMap<Integer, jugador> getSuplentesLocales()
	{
		return suplentesLocales;
	}
	
	public HashMap<Integer, jugador> getTitularesVisitantes() 
	{
		return titularesVisitantes;
	}
	
	public HashMap<Integer, jugador> getSuplentesVisitantes() 
	{
		return suplentesVisitantes;
	}
	
	public void setTitularesLocales(HashMap<Integer, jugador> titularesLocales) 
	{
		titularesLocales = titularesLocales;
	}
	
	public void setTitularesVisitantes(HashMap<Integer, jugador> tv) 
	{
		titularesVisitantes = tv;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	
}