package Planilla;

import java.io.Serializable;

import Estadisticas.estadisticasJugador;

public class jugador implements Serializable 
{	
	protected String nombre;	
	protected String apellido;	
	protected String posicion;		// posicion en la que juega  
	protected int dorsal;		
	protected boolean enCancha;		// booleano que identifica a un jugador si esta en la cancha con un true o false si esta de suplente
	protected estadisticasJugador estadisticas; 
	
	// CONTRUCTORES
	
	public jugador () 
	{		
		nombre = " " ;			
		apellido = " " ;				
		posicion = " " ;			
		dorsal =  0 ;				
		enCancha = false;				
		estadisticas = new estadisticasJugador();	
	}

	public jugador(String n, String a, String p, int d) 
	{
		nombre = n;				
		apellido = a;				
		posicion = p;				
		dorsal = d;				
		enCancha = false;			
		estadisticas = new estadisticasJugador();		
	}

	// METODOS 

public void CargaEstadistica (int accion)  // recive la accion de una incidencia y la carga a sus estadisticas 
{		
		switch(accion) 			// depende el numero de la accion va a cargar diferente atributo
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
	
	// GET Y SET 
	
	public String getNombreJ()
	{
		return nombre;
	}

	public String getApellido()
	{
		return apellido;
	}

	public String getPosicion()
	{
		return posicion;
	}

	public int getDorsal()
	{
		return dorsal;
	}

	public boolean getEnCancha()
	{
		return enCancha;
	}
	
	public void  setEnCancha(boolean estado) 
	{
		enCancha = estado;		
	}
	
	public estadisticasJugador getEstadistica()
	{
		return estadisticas;
	}
}