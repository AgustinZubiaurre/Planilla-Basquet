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

import Planilla.jugador;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class estadisticasJugador extends JFrame 
{
	private	JPanel panel;
	private	JLabel lblNombre;
	private	JLabel lblApellido;
	private	JLabel lblPosicion;
	private	JLabel lblDorsal;
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
	private	JLabel lblTirosCampo;
	private JLabel lblJugador;
	private JLabel lblEstadisticas;
	private JButton btnVolver;
		
	public estadisticasJugador (jugador j) // muestra las estadisticas de un jugador 
	{	
		setResizable(false);
		setSize(712,490);
		setLocationRelativeTo(null);
		setTitle("Estadisticas Jugador");
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBounds(0, -22, 696, 504);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		lblNombre = new JLabel("Nombre: "+ j.getNombreJ());
		lblNombre.setForeground(Color.BLUE);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombre.setBounds(43, 100, 192, 14);
		panel.add(lblNombre);
		
	    lblApellido = new JLabel("Apellido: "+j.getApellido());
		lblApellido.setForeground(Color.BLUE);
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblApellido.setHorizontalAlignment(SwingConstants.LEFT);
		lblApellido.setBounds(43, 141, 197, 14);
		panel.add(lblApellido);
		
	    lblPosicion = new JLabel("Posicion: "+j.getPosicion());
		lblPosicion.setForeground(Color.BLUE);
		lblPosicion.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPosicion.setHorizontalAlignment(SwingConstants.LEFT);
		lblPosicion.setBounds(43, 187, 197, 14);
		panel.add(lblPosicion);
		
		lblDorsal = new JLabel("Dorsal: "+j.getDorsal());
		lblDorsal.setForeground(Color.BLUE);
		lblDorsal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDorsal.setHorizontalAlignment(SwingConstants.LEFT);
		lblDorsal.setBounds(43, 233, 191, 14);
		panel.add(lblDorsal);
		
		lblFaltas = new JLabel("Faltas: "+j.getEstadistica().getFalta());
		lblFaltas.setForeground(Color.RED);
		lblFaltas.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFaltas.setBounds(313, 272, 260, 17);
		panel.add(lblFaltas);
		
		lblSimpConvert = new JLabel("Simples Convertidos: "+j.getEstadistica().getSimpleConvert());
		lblSimpConvert.setForeground(Color.RED);
		lblSimpConvert.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSimpConvert.setBounds(313, 214, 260, 17);
		panel.add(lblSimpConvert);
		
	    lblSimpErr = new JLabel("Simples Errados: "+j.getEstadistica().getSimpleErrado());
	    lblSimpErr.setForeground(Color.RED);
	    lblSimpErr.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblSimpErr.setBounds(313, 243, 260, 17);
		panel.add(lblSimpErr);
		
		lblDobleConvert = new JLabel("Dobles Convertidos: "+j.getEstadistica().getDoblesConvert());
		lblDobleConvert.setForeground(Color.RED);
		lblDobleConvert.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDobleConvert.setBounds(313, 98, 260, 17);
		panel.add(lblDobleConvert);
		
		lblDobleErr  = new JLabel("Dobles Errados: "+j.getEstadistica().getDoblesErrados());
		lblDobleErr.setForeground(Color.RED);
		lblDobleErr.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDobleErr.setBounds(313, 127, 260, 17);
		panel.add(lblDobleErr);
		
		lblTripleConv = new JLabel("Triples Convertidos: "+j.getEstadistica().getTriplesConvert());
		lblTripleConv.setForeground(Color.RED);
		lblTripleConv.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTripleConv.setBounds(313, 156, 260, 17);
		panel.add(lblTripleConv);
		
		lblTripleErr = new JLabel("Triples Errados: "+j.getEstadistica().getTriplesErrados());
		lblTripleErr.setForeground(Color.RED);
		lblTripleErr.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTripleErr.setBounds(313, 185, 260, 17);
		panel.add(lblTripleErr);
		
		lblAsistencias  = new JLabel("Asistencias: "+j.getEstadistica().getAsistencias());
		lblAsistencias.setForeground(Color.RED);
		lblAsistencias.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAsistencias.setBounds(313, 301, 260, 17);
		panel.add(lblAsistencias);
		
	    lblPerdidas = new JLabel("Perdidas: "+j.getEstadistica().getPerdidas());
	    lblPerdidas.setForeground(Color.RED);
	    lblPerdidas.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblPerdidas.setBounds(313, 448, 222, 17);
		panel.add(lblPerdidas);
		
		lblRobos = new JLabel("Robos: "+j.getEstadistica().getRobo());
		lblRobos.setForeground(Color.RED);
		lblRobos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRobos.setBounds(313, 419, 260, 17);
		panel.add(lblRobos);
		
		lblRebotAtq = new JLabel("Rebotes en Ataque: "+j.getEstadistica().getRebotesAt());
		lblRebotAtq.setForeground(Color.RED);
		lblRebotAtq.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRebotAtq.setBounds(313, 330, 260, 17);
		panel.add(lblRebotAtq);
		
		lblRebotDef = new JLabel("Rebotes en Defensa: "+j.getEstadistica().getRebotesDef());
		lblRebotDef.setForeground(Color.RED);
		lblRebotDef.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRebotDef.setBounds(313, 361, 260, 17);
		panel.add(lblRebotDef);
		
		lblTirosCampo = new JLabel("Tiros de campo: "+j.getEstadistica().getTirosDeCampoConvertidos()+"/"+j.getEstadistica().getTirosDeCampo());
		lblTirosCampo.setForeground(Color.RED);
		lblTirosCampo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTirosCampo.setBounds(313, 390, 260, 17);
		panel.add(lblTirosCampo);
		
		lblJugador = new JLabel("Jugador ");
		lblJugador.setBounds(75, 32, 88, 39);
		panel.add(lblJugador);
		
		lblEstadisticas = new JLabel("Estadisticas");
		lblEstadisticas.setBounds(313, 43, 102, 17);
		panel.add(lblEstadisticas);
		
		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				dispose();		
			}
		});
		btnVolver.setBounds(596, 448, 88, 21);
		panel.add(btnVolver);	
	}
}