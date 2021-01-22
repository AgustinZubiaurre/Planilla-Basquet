package Estadisticas;

public class estadisticasJugador extends estadisticas 
{
	int tirosDeCampo;       //  cantidad de tiros totales que hizo el jugador (dobles+triples+simples) 
	int tirosDeCampoConvertidos;			// cantidad de tiros convertidos totales que hizo el jugador (dobles+triples+simples)
	
	// CONSTRUCTOR 
	
	public estadisticasJugador () {		
		super(); 
		tirosDeCampo = 0; 
		tirosDeCampoConvertidos = 0;		
	}
	
	// METODOS 
	
	public void CargaDobleConvertido() {   // 1 		
		doblesConvert ++ ; 
		tirosDeCampo ++;
		tirosDeCampoConvertidos++;
	}
	
	public void CargaDobleErrado() {	// 2 		
		doblesErrados ++;
		tirosDeCampo ++;		
	}

	public void CargaTripleConvertido(){   // 3 		
		triplesConvert ++;
		tirosDeCampo ++;
		tirosDeCampoConvertidos++;
	}
	

	public void CargaTripleErrado(){	  	// 4		
		triplesErrados ++ ; 
		tirosDeCampo ++;	
	}
	
	public void CargaSimpleConvertido() {   // 5 		
		simpleConvert ++ ; 		
	}
			
	public void CargaSimpleErrado() {   // 6 		
		simpleErrado ++ ; 	
	}

	
	// GET Y SET 
	
	public int getTirosDeCampo() {
		return tirosDeCampo;
	}

	public void setTirosDeCampo(int tirosDeCampo) {
		this.tirosDeCampo = tirosDeCampo;
	}
	
	public int getTirosDeCampoConvertidos() {
		return tirosDeCampoConvertidos;
	}

	public void setTirosDeCampoConvertidos(int tirosDeCampoConvertidos) {
		this.tirosDeCampoConvertidos = tirosDeCampoConvertidos;
	}
}
