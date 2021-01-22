package Planilla;

public class incidencia extends partido 
{
	protected String NombreEquipo;									
	protected String tiempo;  											   // cronometro le va a pasar el tiempo en forma de string	
	protected int dorsal;															// dorsal del jugador que realizo la accion
	protected int accion;															// numero de accion realizada
	
	// CONSTRUCTORES 
	
	public incidencia() 
	{		
		NombreEquipo = " ";		
		tiempo = " " ; 				
		dorsal = -1;		
		accion = 0;	
	}
		
	public  incidencia (String equipo, String T,  int dor , int A) // nombre del equipo, tiempo, dorsal del jugador del equipo, numero de accion		
	{																	 
		NombreEquipo = equipo;		
		tiempo = T;				
		dorsal = dor; 				
		accion = A;	
	}
	
	// GET  Y  SET 
	
	public String getNombreEquipo() {
		return NombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		NombreEquipo = nombreEquipo;
	}

	public String gettiempo() {
		return tiempo;
	}

	public void settiempo(String tiempo) {
		this.tiempo = tiempo;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getAccion() {
		return accion;
	}

	public void setAccion(int accion) {
		this.accion = accion;
	}
		
}
