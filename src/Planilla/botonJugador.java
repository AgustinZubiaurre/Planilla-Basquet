package Planilla;

import javax.swing.JButton;

public class botonJugador extends JButton{

	protected String apellido;	
	protected int dorsal;
	
	public botonJugador (jugador j)
	{
		apellido=j.apellido;
		dorsal=j.dorsal;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	
	//drag n drop cambios jugadores titular por suplente
}
