package Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Planilla.equipo;
import Planilla.partido;

public class verEstadisticaPartido extends JFrame 
{
	private	JPanel panel;
	private	JLabel lblNombre;
	private	JLabel lblApellido;
	private	JLabel lblPosicion;
	private	JLabel lblEstadisticas;
	private	JLabel lblFaltas;
	private	JLabel lblSimpConvert;
	private	JLabel lblSimpErr;
	private	JLabel lblDobleConvert;
	private	JLabel lblDobleErr;
	private	JLabel lblTripleConv;
	private	JLabel lblTripleErr;
	private	JLabel lblAsistencias;
	private	JLabel lblPerdidas;
	private	JLabel lblRobos;
	private	JLabel lblRebotAtq;
	private	JLabel lblRebotDef;

	public verEstadisticaPartido (partido j) // muestra las estadisticas de un partido 
	{
		setResizable(false);
		setSize(693,475);
		setLocationRelativeTo(null);
		setTitle("Estadisticas Partido");
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBounds(0, 0, 687, 436);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		// Fecha de un partido
 		
		lblNombre = new JLabel("Fecha: "+ j.getFecha() );
		lblNombre.setForeground(Color.BLUE);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombre.setBounds(10, 70, 128, 14);
		panel.add(lblNombre);
		
		// Equipo Local
		
		equipo local = j.getVisitante(); 
		
	    lblApellido = new JLabel("Equipo Local: " + local.getNombreEquipo() );
		lblApellido.setForeground(Color.BLUE);
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblApellido.setHorizontalAlignment(SwingConstants.LEFT);
		lblApellido.setBounds(10, 95, 197, 14);
		panel.add(lblApellido);
		
		// Equipo Visitante
		
		equipo visitante = j.getVisitante(); 
		
	    lblApellido = new JLabel("Equipo Visitante: " + visitante.getNombreEquipo() );
		lblApellido.setForeground(Color.BLUE);
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblApellido.setHorizontalAlignment(SwingConstants.LEFT);
		lblApellido.setBounds(10, 95, 197, 14);
		panel.add(lblApellido);
		
		// Periodos
		
	    lblPosicion = new JLabel("Periodos: " + j.getPeriodo() );
		lblPosicion.setForeground(Color.BLUE);
		lblPosicion.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPosicion.setHorizontalAlignment(SwingConstants.LEFT);
		lblPosicion.setBounds(10, 120, 197, 14);
		panel.add(lblPosicion);
			
		// ESTADISTICAS 
		
		// creo objeto estadisticaPartido
		
		Estadisticas.estadisticasPartido estadisticas;
		
		estadisticas =  j.getEstadisticas(); 
			
		lblEstadisticas = new JLabel("Estadisticas Partido");
		lblEstadisticas.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEstadisticas.setBounds(417, 45, 75, 14);
		panel.add(lblEstadisticas);
		
		// FALTAS 
		
		lblFaltas = new JLabel("Faltas: " + estadisticas.getFalta() );
		lblFaltas.setForeground(Color.RED);
		lblFaltas.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFaltas.setBounds(417, 70, 260, 17);
		panel.add(lblFaltas);
		
		//SIMPLES CONVERTIDOS 
		
		lblSimpConvert = new JLabel("Simples Convertidos: "+estadisticas.getDoblesConvert());
		lblSimpConvert.setForeground(Color.RED);
		lblSimpConvert.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSimpConvert.setBounds(417, 93, 260, 17);
		panel.add(lblSimpConvert);
		
		// SIMPLES ERRADOS 
		
	    lblSimpErr = new JLabel("Simples Errados: "+estadisticas.getSimpleErrado());
	    lblSimpErr.setForeground(Color.RED);
	    lblSimpErr.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblSimpErr.setBounds(417, 116, 260, 17);
		panel.add(lblSimpErr);
		
		// DOBLES CONVERTIDOS 
		
		lblDobleConvert = new JLabel("Dobles Convertidos: "+estadisticas.getDoblesConvert());
		lblDobleConvert.setForeground(Color.RED);
		lblDobleConvert.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDobleConvert.setBounds(417, 139, 260, 17);
		panel.add(lblDobleConvert);
		
		// DOBLES ERRADOS 
		
		lblDobleErr  = new JLabel("Dobles Errados: "+estadisticas.getDoblesErrados());
		lblDobleErr.setForeground(Color.RED);
		lblDobleErr.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDobleErr.setBounds(417, 162, 260, 17);
		panel.add(lblDobleErr);
		
		// TRIPLES CONVERTIDOS
		
		lblTripleConv = new JLabel("Triples Convertidos: "+estadisticas.getTriplesConvert());
		lblTripleConv.setForeground(Color.RED);
		lblTripleConv.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTripleConv.setBounds(417, 185, 260, 17);
		panel.add(lblTripleConv);
		
		// TRIPLES ERRADOS 
		
		lblTripleErr = new JLabel("Triples Errados: "+estadisticas.getTriplesErrados());
		lblTripleErr.setForeground(Color.RED);
		lblTripleErr.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTripleErr.setBounds(417, 208, 260, 17);
		panel.add(lblTripleErr);
		
		// ASISTENCIAS 
		
		lblAsistencias  = new JLabel("Asistencias: "+estadisticas.getAsistencias());
		lblAsistencias.setForeground(Color.RED);
		lblAsistencias.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAsistencias.setBounds(417, 231, 260, 17);
		panel.add(lblAsistencias);
		
		// PERDIDAS 
		
	    lblPerdidas = new JLabel("Perdidas: "+estadisticas.getPerdidas());
	    lblPerdidas.setForeground(Color.RED);
	    lblPerdidas.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblPerdidas.setBounds(417, 254, 260, 17);
		panel.add(lblPerdidas);
		
		// ROBOS 
		
		lblRobos = new JLabel("Robos: "+estadisticas.getRobo());
		lblRobos.setForeground(Color.RED);
		lblRobos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRobos.setBounds(417, 277, 260, 17);
		panel.add(lblRobos);
		
		// REBOTES EN ATAQUE
		
		lblRebotAtq = new JLabel("Rebotes en Ataque: "+estadisticas.getRebotesAt());
		lblRebotAtq.setForeground(Color.RED);
		lblRebotAtq.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRebotAtq.setBounds(417, 300, 260, 17);
		panel.add(lblRebotAtq);
		
		// REBOTES EN DEFENSA
		
		lblRebotDef = new JLabel("Rebotes en Defensa: "+estadisticas.getRebotesDef());
		lblRebotDef.setForeground(Color.RED);
		lblRebotDef.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRebotDef.setBounds(417, 323, 260, 17);
		panel.add(lblRebotDef);
		
	}
}