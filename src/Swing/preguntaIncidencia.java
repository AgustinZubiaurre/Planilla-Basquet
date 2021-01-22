package Swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Planilla.partido;
import Planilla.temporada;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class preguntaIncidencia extends JFrame 
{
	private JPanel contentPane;
	private	JLabel lblDeseaVerLas;
	private	JButton btnNo;
	private	JButton btnSi;
	private	partido partido; 
	private	temporada tt;
	
	public preguntaIncidencia(temporada T, partido P) // ventana que pregunta si quiere ver las incidencias cargadas en el partido anteriormente creado
	{
		tt = T;
		partido = P; 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 250,  419, 171);;
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblDeseaVerLas = new JLabel("Desea ver las incidencias del partido ? ");
		lblDeseaVerLas.setBounds(63, 34, 308, 15);
		contentPane.add(lblDeseaVerLas);
		
		
		// BOTON NO (cierra la ventana) 
		
		btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				dispose();				
			}
		});
		btnNo.setBounds(44, 90, 117, 25);
		contentPane.add(btnNo);
		
		// BOTON SI (cierra la ventana y abre la ventana de incidencias de partido)
		
		btnSi = new JButton("Si");
		btnSi.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				listaIncidencias IP = new listaIncidencias(tt, partido); 
				IP.setVisible(true);
				IP.setBounds(600, 250, 700, 600); 
				dispose();
			}
		});
		btnSi.setBounds(254, 90, 117, 25);
		contentPane.add(btnSi);
	}
}
