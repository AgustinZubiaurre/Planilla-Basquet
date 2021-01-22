package Estadisticas;

public class estadisticasEquipo extends estadisticas 
{	
																		// agrego atributos extra para estadisticas de equipo
	int cantidadPartidosJugados; 	
	int cantidadPartidosGanados; 	
	int cantidadPartidosPerdidos;
	
	// CONSTRUCTOR 
	
	public estadisticasEquipo () 
	{
		super();		
		cantidadPartidosJugados = 0; 		
		cantidadPartidosGanados = 0; 		
		cantidadPartidosPerdidos = 0;
	}

	// METODOS 
	
	public void CargaPartidoGanado () 
	{		
		cantidadPartidosGanados ++; 						// carga +1 a cantidad de partidos ganados		
		cantidadPartidosJugados ++;										// carga +1 a cantidad de partidos jugados 		
	}
	
	public void CargaPartidoPerdido () 
	{
		cantidadPartidosPerdidos ++; 						// carga +1 cantidad de partidos perdidos		
		cantidadPartidosJugados ++;										// carga +1 a cantidad de partidos jugados 		
	}

	// GET Y SET 
	
	public int getCantidadPartidosJugados() {
		return cantidadPartidosJugados;
	}

	public void setCantidadPartidosJugados(int cantidadPartidosJugados) {
		this.cantidadPartidosJugados = cantidadPartidosJugados;
	}

	public int getCantidadPartidosGanados() {
		return cantidadPartidosGanados;
	}

	public void setCantidadPartidosGanados(int cantidadPartidosGanados) {
		this.cantidadPartidosGanados = cantidadPartidosGanados;
	}

	public int getCantidadPartidosPerdidos() {
		return cantidadPartidosPerdidos;
	}

	public void setCantidadPartidosPerdidos(int cantidadPartidosPerdidos) {
		this.cantidadPartidosPerdidos = cantidadPartidosPerdidos;
	}

}
