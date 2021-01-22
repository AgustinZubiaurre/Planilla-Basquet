package Swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Archivo.archivo;
import Planilla.temporada;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Window.Type;

public class menu extends JFrame 
{
	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnSalis;
	private	JButton btnNewButton_1;
	private temporada tempo; 		

	public menu (temporada temporada) // permite seleccionar si se quiere crear un partido nuevo o ver estadisticas de equipos
	{	
		tempo = temporada;
		
		//______________
		
		setTitle("      Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 250, 460, 310);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// BOTON PARTIDO (para cargar datos de un partido)
		
		btnNewButton = new JButton("Partido");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{				
				partidoNuevo Vpartido = new partidoNuevo(tempo);				
				Vpartido.setBounds(600, 250, 460, 320);				
				Vpartido.setVisible(true);				
			}
		});
		btnNewButton.setBounds(154, 46, 128, 44);
		contentPane.add(btnNewButton);
		
		// BOTON ESTADISTICAS (para ver estadisticas generales de un jugador, un partido) 
		
		btnNewButton_1 = new JButton("Estadisticas");
		btnNewButton_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{				
				verSeleccionEstadistica Vestadistica = new verSeleccionEstadistica (tempo);			
				Vestadistica.setVisible(true);			
			}
		});
		btnNewButton_1.setBounds(154, 149, 128, 44);
		contentPane.add(btnNewButton_1);
		
		
		// BOTON GUARDAR Y SALIR 
		
		btnSalis = new JButton("Guardar y Salir");
		btnSalis.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{				
				archivo archi = new archivo(); 				
				archi.GuardarTemporada(tempo, "LNB");				// antes de salir guarda la temporada con todas sus modificaciones
				System.exit(0);				
			}
		});
		btnSalis.setBounds(272, 237, 152, 25);
		contentPane.add(btnSalis);	
	}
}
