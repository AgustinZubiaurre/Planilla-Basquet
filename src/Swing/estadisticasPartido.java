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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class estadisticasPartido extends JFrame 
{
	private JPanel panel;
	private	JLabel lblFecha;
	private JLabel lblELocal;
	private	JLabel lblEVisitante;
	private JLabel lblFaltas;
	private JLabel lblSimpConvert;
	private JLabel lblSimpErr;
	private	JLabel lblDobleConvert;
	private	JLabel lblDobleErr;
	private JLabel lblTripleConv;
	private JLabel lblTripleErr;
	private JLabel lblAsistencias;
	private JLabel lblPerdidas;
	private JLabel lblRobos;
	private JLabel lblRebotAtq;
	private JLabel lblRebotDef;
	private JLabel lblPartido;
	private JLabel lblEstadisticas;
	private JLabel lblTapa;
	private	JButton btnVolver;

	public estadisticasPartido(partido j)    // muestra las estadisticas de un partido
	{
		setResizable(false);
		setSize(712,490);
		setLocationRelativeTo(null);
		setTitle("Estadisticas Partido");
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBounds(0, -22, 696, 504);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		// FECHA 
		
		lblFecha = new JLabel("Fecha: "+ j.getFecha() );
		lblFecha.setForeground(Color.BLUE);
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFecha.setHorizontalAlignment(SwingConstants.LEFT);
		lblFecha.setBounds(43, 100, 192, 14);
		panel.add(lblFecha);
		
		// EQUIPO LOCAL
		
		equipo local = j.getLocal();
		
	    lblELocal = new JLabel("Equipo Local: " + local.getNombreEquipo() );
		lblELocal.setForeground(Color.BLUE);
		lblELocal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblELocal.setHorizontalAlignment(SwingConstants.LEFT);
		lblELocal.setBounds(43, 141, 197, 14);
		panel.add(lblELocal);
		
		// EQUIPO VISITANTE
		
		equipo visitante = j.getVisitante(); 
		
		lblEVisitante = new JLabel("Equipo Visitante: " + visitante.getNombreEquipo() );
		lblEVisitante.setForeground(Color.BLUE);
		lblEVisitante.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEVisitante.setHorizontalAlignment(SwingConstants.LEFT);
		lblEVisitante.setBounds(43, 187, 197, 14);
		panel.add(lblEVisitante);
				
		Estadisticas.estadisticasPartido estadisticas;
		
		estadisticas =  j.getEstadisticas();
		
		// FALTAS 
		
		lblFaltas = new JLabel("Faltas: " + estadisticas.getFalta() );
		lblFaltas.setForeground(Color.RED);
		lblFaltas.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFaltas.setBounds(348, 272, 260, 17);
		panel.add(lblFaltas);
		
		lblSimpConvert = new JLabel("Simples Convertidos: "+estadisticas.getSimpleConvert());
		lblSimpConvert.setForeground(Color.RED);
		lblSimpConvert.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSimpConvert.setBounds(348, 214, 260, 17);
		panel.add(lblSimpConvert);
		
	    lblSimpErr = new JLabel("Simples Errados: "+estadisticas.getSimpleErrado());
	    lblSimpErr.setForeground(Color.RED);
	    lblSimpErr.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblSimpErr.setBounds(348, 243, 260, 17);
		panel.add(lblSimpErr);
		
		lblDobleConvert = new JLabel("Dobles Convertidos: "+estadisticas.getDoblesConvert());
		lblDobleConvert.setForeground(Color.RED);
		lblDobleConvert.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDobleConvert.setBounds(348, 98, 260, 17);
		panel.add(lblDobleConvert);
		
		lblDobleErr  = new JLabel("Dobles Errados: "+estadisticas.getDoblesErrados());
		lblDobleErr.setForeground(Color.RED);
		lblDobleErr.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDobleErr.setBounds(348, 127, 260, 17);
		panel.add(lblDobleErr);
		
		lblTripleConv = new JLabel("Triples Convertidos: "+estadisticas.getTriplesConvert());
		lblTripleConv.setForeground(Color.RED);
		lblTripleConv.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTripleConv.setBounds(348, 156, 260, 17);
		panel.add(lblTripleConv);
		
		lblTripleErr = new JLabel("Triples Errados: "+estadisticas.getTriplesErrados());
		lblTripleErr.setForeground(Color.RED);
		lblTripleErr.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTripleErr.setBounds(348, 185, 260, 17);
		panel.add(lblTripleErr);
		
		lblAsistencias  = new JLabel("Asistencias: "+estadisticas.getAsistencias());
		lblAsistencias.setForeground(Color.RED);
		lblAsistencias.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAsistencias.setBounds(348, 301, 260, 17);
		panel.add(lblAsistencias);
		
	    lblPerdidas = new JLabel("Perdidas: "+estadisticas.getPerdidas());
	    lblPerdidas.setForeground(Color.RED);
	    lblPerdidas.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblPerdidas.setBounds(348, 328, 260, 17);
		panel.add(lblPerdidas);
		
		lblRobos = new JLabel("Robos: "+estadisticas.getRobo());
		lblRobos.setForeground(Color.RED);
		lblRobos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRobos.setBounds(348, 414, 260, 17);
		panel.add(lblRobos);
		
		lblRebotAtq = new JLabel("Rebotes en Ataque: "+estadisticas.getRebotesAt());
		lblRebotAtq.setForeground(Color.RED);
		lblRebotAtq.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRebotAtq.setBounds(348, 355, 260, 17);
		panel.add(lblRebotAtq);
		
		lblRebotDef = new JLabel("Rebotes en Defensa: "+estadisticas.getRebotesDef());
		lblRebotDef.setForeground(Color.RED);
		lblRebotDef.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRebotDef.setBounds(348, 385, 260, 17);
		panel.add(lblRebotDef);
				
		lblTapa = new JLabel("Tapas: "+estadisticas.getTapa());
		lblTapa.setForeground(Color.RED);
		lblTapa.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTapa.setBounds(348, 445, 260, 17);
		panel.add(lblTapa);
						
		lblPartido = new JLabel("Partido");
		lblPartido.setBounds(43, 54, 70, 15);
		panel.add(lblPartido);
				
		lblEstadisticas = new JLabel("Estadisticas");
		lblEstadisticas.setBounds(348, 54, 126, 15);
		panel.add(lblEstadisticas);
		
		// VOLVER  (cierra la ventana)
		
		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				dispose();	
			}
		});
		btnVolver.setBounds(600, 446, 96, 25);
		panel.add(btnVolver);		
	}
}