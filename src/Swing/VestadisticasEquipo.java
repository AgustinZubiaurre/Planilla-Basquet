package Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Planilla.equipo;
import Planilla.jugador;

public class VestadisticasEquipo extends JFrame {

	private	JPanel panel;
	private	JLabel lblNombre;
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
	private	JLabel lblPGanados;
	private JLabel lblEstadisticas;
	private JButton btnVolver;
		
	
	public VestadisticasEquipo (equipo E) // muestra las estadisticas de un jugador 
	{	
	
	setResizable(false);
	setSize(712,490);
	setLocationRelativeTo(null);
	setTitle("Estadisticas Equipo");
	getContentPane().setLayout(null);
	
	panel = new JPanel();
	panel.setForeground(Color.WHITE);
	panel.setBounds(0, -22, 696, 504);
	getContentPane().add(panel);
	panel.setLayout(null);
	
	lblNombre = new JLabel("Nombre: "+ E.getNombreEquipo());
	lblNombre.setForeground(Color.BLUE);
	lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
	lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
	lblNombre.setBounds(43, 129, 192, 14);
	panel.add(lblNombre);
	
	lblPGanados = new JLabel("Partidos Totales "+ E.getEstadisticas().getCantidadPartidosJugados() );
	lblPGanados.setForeground(Color.BLUE);
	lblPGanados.setFont(new Font("Tahoma", Font.BOLD, 11));
	lblPGanados.setHorizontalAlignment(SwingConstants.LEFT);
	lblPGanados.setBounds(43, 158, 192, 14);
	panel.add(lblPGanados);

	lblPGanados = new JLabel("Partidos Ganados "+ E.getEstadisticas().getCantidadPartidosGanados() );
	lblPGanados.setForeground(Color.BLUE);
	lblPGanados.setFont(new Font("Tahoma", Font.BOLD, 11));
	lblPGanados.setHorizontalAlignment(SwingConstants.LEFT);
	lblPGanados.setBounds(43, 187, 192, 14);
	panel.add(lblPGanados);
	
	lblPGanados = new JLabel("Partidos Perdidos "+ E.getEstadisticas().getCantidadPartidosPerdidos() );
	lblPGanados.setForeground(Color.BLUE);
	lblPGanados.setFont(new Font("Tahoma", Font.BOLD, 11));
	lblPGanados.setHorizontalAlignment(SwingConstants.LEFT);
	lblPGanados.setBounds(43, 213, 192, 14);
	panel.add(lblPGanados);
									
	lblFaltas = new JLabel("Faltas: "+ E.getEstadisticas().getFalta() );
	lblFaltas.setForeground(Color.RED);
	lblFaltas.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblFaltas.setBounds(313, 272, 260, 17);
	panel.add(lblFaltas);
	
	lblSimpConvert = new JLabel("Simples Convertidos: "+ E.getEstadisticas().getSimpleConvert());
	lblSimpConvert.setForeground(Color.RED);
	lblSimpConvert.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblSimpConvert.setBounds(313, 214, 260, 17);
	panel.add(lblSimpConvert);
																							
    lblSimpErr = new JLabel("Simples Errados: "+ E.getEstadisticas().getSimpleErrado() );
    lblSimpErr.setForeground(Color.RED);
    lblSimpErr.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblSimpErr.setBounds(313, 243, 260, 17);
	panel.add(lblSimpErr);
	
	lblDobleConvert = new JLabel("Dobles Convertidos: "+ E.getEstadisticas().getDoblesConvert());
	lblDobleConvert.setForeground(Color.RED);
	lblDobleConvert.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblDobleConvert.setBounds(313, 98, 260, 17);
	panel.add(lblDobleConvert);
	
	lblDobleErr  = new JLabel("Dobles Errados: "+E.getEstadisticas().getDoblesErrados());
	lblDobleErr.setForeground(Color.RED);
	lblDobleErr.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblDobleErr.setBounds(313, 127, 260, 17);
	panel.add(lblDobleErr);
	
	lblTripleConv = new JLabel("Triples Convertidos: "+E.getEstadisticas().getTriplesConvert());
	lblTripleConv.setForeground(Color.RED);
	lblTripleConv.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblTripleConv.setBounds(313, 156, 260, 17);
	panel.add(lblTripleConv);
	
	lblTripleErr = new JLabel("Triples Errados: "+E.getEstadisticas().getTriplesErrados());
	lblTripleErr.setForeground(Color.RED);
	lblTripleErr.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblTripleErr.setBounds(313, 185, 260, 17);
	panel.add(lblTripleErr);
	
	lblAsistencias  = new JLabel("Asistencias: "+E.getEstadisticas().getAsistencias());
	lblAsistencias.setForeground(Color.RED);
	lblAsistencias.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblAsistencias.setBounds(313, 301, 260, 17);
	panel.add(lblAsistencias);
	
    lblPerdidas = new JLabel("Perdidas: "+E.getEstadisticas().getPerdidas());
    lblPerdidas.setForeground(Color.RED);
    lblPerdidas.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblPerdidas.setBounds(313, 419, 222, 17);
	panel.add(lblPerdidas);
	
	lblRobos = new JLabel("Robos: "+E.getEstadisticas().getRobo());
	lblRobos.setForeground(Color.RED);
	lblRobos.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblRobos.setBounds(313, 390, 260, 17);
	panel.add(lblRobos);
	
	lblRebotAtq = new JLabel("Rebotes en Ataque: "+E.getEstadisticas().getRebotesAt());
	lblRebotAtq.setForeground(Color.RED);
	lblRebotAtq.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblRebotAtq.setBounds(313, 330, 260, 17);
	panel.add(lblRebotAtq);
	
	lblRebotDef = new JLabel("Rebotes en Defensa: "+E.getEstadisticas().getRebotesDef());
	lblRebotDef.setForeground(Color.RED);
	lblRebotDef.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblRebotDef.setBounds(313, 361, 260, 17);
	panel.add(lblRebotDef);
	
	lblEstadisticas = new JLabel("Estadisticas");
	lblEstadisticas.setBounds(313, 43, 102, 17);
	panel.add(lblEstadisticas);
	
	// BOTON VOLVER (cierra la ventana)
	
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