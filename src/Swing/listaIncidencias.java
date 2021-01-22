package Swing;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Cronometro.cronometro;
import Planilla.equipo;
import Planilla.incidencia;
import Planilla.jugador;
import Planilla.partido;
import Planilla.temporada;

import java.awt.Font;import java.awt.LayoutManager;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class listaIncidencias extends JFrame
{
	private String suceso;
	private	JScrollPane scrollPane;
	private	JPanel jPanel;
	private	JLabel lblIncidencias;
	private	equipo equipo;
	private	jugador jugador;
	private	JLabel lblInciden;
	private JButton btnCerrar;
	private	JLabel primerEspacio;
	private	JLabel espacio;
	
public listaIncidencias(temporada T, partido parti)  // muestra la lista de las incidencias de un partido 
{
		temporada tt = T;
		
		getContentPane().setLayout(null);
		setSize(676,491);
		setLocationRelativeTo(null);
		scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 51, 620, 369);
		getContentPane().add(scrollPane);
		
		jPanel = new JPanel();
		scrollPane.setViewportView(jPanel);
		jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
		
		lblIncidencias = new JLabel("Incidencias : ");
		lblIncidencias.setBounds(28, 24, 192, 15);
		getContentPane().add(lblIncidencias);
		
		
		// CIERRA LA VENTANA 
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				dispose();	
			}
		});
		btnCerrar.setBounds(561, 432, 87, 25);
		getContentPane().add(btnCerrar);
		primerEspacio = new JLabel(" ");
		jPanel.add(primerEspacio);
		
		for (incidencia aux: parti.getListaIncidencias()) // recorro la lista de incidencias de un partido
		{
			switch (aux.getAccion()) // a traves del switch le cargo a un string el nombre de la accion correspondiente
			{
				
				case 1 : 
					
					suceso = " Doble Convertido ";
	
					break;
				
				case 2 : 
					
					suceso = " Doble Errado ";
			
					break;
				
				case 3 : 
					
					suceso = " Triple Convertido " ;
			
					break;
				
				case 4 : 
					
					suceso = " Triple Errado " ;
			
				break;
				
				case 5 : 
					
					suceso = "Simple Convertido ";
			
				break;
				
				case 6 : 
					
					suceso = " Simple Errado ";
				
					break;
					
				case 7 : 
					
					suceso = " Falta " ;
				
					break;
					
				case 8 : 
					
					suceso = "Falta Tecnica ";
				
					break;
				
				case 9 : 
					
					suceso = " Asistencias ";
				
					break;
				
				case 10 : 
					
					suceso = " Perdida ";
				
					break;
					
				case 11 : 
					
					suceso = " Robo " ;
				
					break;
					
				case 12 : 
					
					suceso = " Rebote Defensa ";
				
					break;
					
				case 13 : 
					
					suceso = " Rebote Ataque ";
				
					break;
					
				case 14 : 
					
					suceso = " Tapa " ;
					
					break;
					
				}
			
		equipo = tt.DevuelveEquipo(aux.getNombreEquipo() );  // devuelve el equipo seleccionado
		jugador = equipo.DevuelveJugador(aux.getDorsal() );		// devuelve el jugador seleccionado 
		lblInciden = new JLabel("Tiempo : " + aux.gettiempo() + "   Equipo : " + aux.getNombreEquipo() +  "   Jugador = " + jugador.getApellido() + "   Accion : " + suceso  );
		espacio = new JLabel(" ");
		jPanel.add(lblInciden);
		jPanel.add(espacio);
		}
	}
}