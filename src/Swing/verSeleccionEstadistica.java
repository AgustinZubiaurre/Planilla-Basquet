package Swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Planilla.equipo;
import Planilla.jugador;
import Planilla.partido;
import Planilla.temporada;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.ComboBoxEditor;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Set;
import java.awt.event.ActionEvent;

public class verSeleccionEstadistica extends JFrame 
{
	private JPanel contentPane;
	private ComboBoxEditor a;
	private	JComboBox comboBoxEquipos = new JComboBox();
	private	JComboBox comboBoxJugadores = new JComboBox();
	private	JComboBox comboBoxPartidos = new JComboBox();
	private	JLabel lblEntrenador = new JLabel("Entrenador : ");
	private	JLabel lblElijaEquipo;
	private	JLabel lblJugadores;
	private	JLabel lblPartidos;
	private	JButton btnVolver;
	private	JButton btnVerPartidos;
	private	JButton btnVer;
	private	JButton btnSeleccionar;
	private JButton btnVerIncidencias;
	private	equipo A ;
	private	temporada tempo;
	
	public verSeleccionEstadistica(temporada T)   // permite seleccionar el equipo del cual se quiere ver sus estadisticas totales
	{
		tempo = T;
		
		setTitle("Estadisticas");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 250, 560, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblElijaEquipo = new JLabel("Elija Equipo : ");
		lblElijaEquipo.setBounds(47, 41, 94, 34);
		contentPane.add(lblElijaEquipo);
		
		// COMBOBOX EQUIPOS (muestra los equipos de la temporada)
		
		comboBoxEquipos.setBounds(152, 47, 101, 24);
		contentPane.add(comboBoxEquipos);
		
		HashMap<String, equipo> ListaEquipos = T.getListaEquipos();								// creo la lista de equipos 
		
		Set <String> Equipos = ListaEquipos.keySet();																									
		
		for (String nombre  : Equipos) 
		{														               																			
			comboBoxEquipos.addItem(nombre);												// creo el comboBox de equipo
		}
		
		// BOTON SELECCIONAR  (confirmo el equipo seleccionado para que pueda ver sus jugadores partidos y estadisticas)
		
		btnSeleccionar = new JButton("Seleccionar");
		btnSeleccionar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				A = tempo.DevuelveEquipo(comboBoxEquipos.getSelectedItem().toString());		// devuelve el equipo seleccionado		
				lblEntrenador.setText("Entrenador :  " + A.getNombreEntrenador());				// muestra el nombre del entrenador
				CargaJugadoresComboBox(comboBoxJugadores, A);				// carga los jugadores en el combobox jugadores
				CargaPartidosComboBox(comboBoxPartidos,A);							// carga los partidos en el combobox partidos	
			}
		});
		btnSeleccionar.setBounds(310, 46, 117, 25);
		contentPane.add(btnSeleccionar);
		
		// 	ENTRENADOR
			
		lblEntrenador.setBounds(47, 111, 270, 29);
		contentPane.add(lblEntrenador);
		
		// JUGADOR 
		
		lblJugadores = new JLabel("Jugadores : ");
		lblJugadores.setBounds(47, 183, 94, 24);
		contentPane.add(lblJugadores);
		
		// PARTIDOS 
		
		lblPartidos = new JLabel("Partidos : ");
		lblPartidos.setBounds(47, 252, 94, 24);
		contentPane.add(lblPartidos);
		
		
		// COMBOBOX JUGADORES 
		
		comboBoxJugadores.setBounds(152, 183, 101, 24);
		contentPane.add(comboBoxJugadores);
		
		
		// COMBOBOX PARTIDOS 
		

		comboBoxPartidos.setBounds(152, 252, 101, 24);
		contentPane.add(comboBoxPartidos);
		
		btnVer = new JButton("Ver Jugador");
		btnVer.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{				
				A = tempo.DevuelveEquipo(comboBoxEquipos.getSelectedItem().toString());						// le paso el equipo seleccionado				
				estadisticasJugador EJ = new estadisticasJugador(  A.DevuelveJugadorPorNombre( (String) comboBoxJugadores.getSelectedItem() )   );	
				EJ.setVisible(true);				// creo la ventana de estadisticas de jugador
			}
		});
		btnVer.setBounds(310, 183, 129, 25);
		contentPane.add(btnVer);
		
		btnVerPartidos = new JButton("Ver Partido");
		btnVerPartidos.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{				
				A = tempo.DevuelveEquipo(comboBoxEquipos.getSelectedItem().toString());									// le paso el partido seleccionado				
				estadisticasPartido EP = new estadisticasPartido(  A.DevuelvePartido ( (String) comboBoxPartidos.getSelectedItem() )  );				
				EP.setVisible(true);				// creo la ventana de estadisticas de partido
			}
		});
		btnVerPartidos.setBounds(310, 252, 129, 25);
		contentPane.add(btnVerPartidos);
		
		// VOLVER (cierra la ventana)
		
		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{				
				dispose();				
			}
		});
		btnVolver.setBounds(429, 324, 94, 25);
		contentPane.add(btnVolver);
		
		// VER INCIDENCIAS (muestras las incidencias de un partido seleccionado)
		
		btnVerIncidencias = new JButton("Ver Incidencias");
		btnVerIncidencias.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{			
				A = tempo.DevuelveEquipo(comboBoxEquipos.getSelectedItem().toString());				// devuelve el equipo seleccionado 									
				listaIncidencias LI = new listaIncidencias(tempo, A.DevuelvePartido ( (String) comboBoxPartidos.getSelectedItem() ) );    // abre la ventana que muestra incidencias  del partido				
				LI.setVisible(true);				
			}
		});
		btnVerIncidencias.setBounds(310, 289, 153, 25);
		contentPane.add(btnVerIncidencias);
		
		// BOTON VER EQUIPO (muestra las estadisticas del equipo seleccionado) 
		
		JButton btnVerEquipo = new JButton("Ver Equipo");
		btnVerEquipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				A = tempo.DevuelveEquipo(comboBoxEquipos.getSelectedItem().toString());	
				
				VestadisticasEquipo EE = new VestadisticasEquipo(A);
				
				EE.setVisible(true);
				
			}
		});
		btnVerEquipo.setBounds(310, 83, 117, 25);
		contentPane.add(btnVerEquipo);
	}
	
	public void CargaJugadoresComboBox(JComboBox combo, equipo a) 
	{ 
		 HashMap<Integer,jugador>  plantel  = a.getPlantel();		// devuelvo el plantel del equipo seleccionado 
		 Set <Integer> Jugadores = plantel.keySet();							// paso las llaves de los jugadores (identificadores = dorsales)																					
		 combo.removeAllItems();		 															
			for (Integer dorsal : Jugadores) 
			{														               																							
				jugador jugador = a.DevuelveJugador(dorsal);				
				combo.addItem(jugador.getApellido());											// creo el comboBox de equipos
			}		 
	}
	
	public void CargaPartidosComboBox(JComboBox combo, equipo a ) 
	{ 		
		 HashMap<String,partido>  Partidos  = a.getListaPartidos();		 // devuelvo la lista de partidos del equipo seleccionado 
		 Set <String> Fechas = Partidos.keySet();					 						// paso las llaves de los jugadores (identificadores = fecha)
		 combo.removeAllItems();		
			for (String fech : Fechas) 
			{														               																				
				combo.addItem(fech);										// creo el comboBox de partidos
			}		 
	}		
}




