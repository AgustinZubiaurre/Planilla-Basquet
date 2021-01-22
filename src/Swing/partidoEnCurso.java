package Swing;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Planilla.jugador;
import Planilla.partido;
import Planilla.temporada;
import Planilla.botonJugador;
import Cronometro.cronometro;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import Archivo.archivo;
import Cronometro.cronometro;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Canvas;


public class partidoEnCurso extends JFrame
{	
	private JPanel panel;
	private JMenuItem mntmReferencias;
	private JLabel lblLocal;
	private JLabel lblVisitante;
	private JLabel dtLocal;
	private JLabel dtVisitante;
	private JLabel lblCuarto;
	private	JLabel lblFecha;
	private JButton btnFinalizarPartido;
	private JButton btnAvanzarCuarto;
	private JMenu mnVer; 
	private JMenuBar menuBar;
	private cronometro reloj;
	private partido partidoAux;
	private String el;
	private String ev;
	private int contadorCuartos=1;
	private temporada tt;
		
	public partidoEnCurso(temporada T, partido partido) 
	{	
		tt = T; 
		partidoAux = partido;
		
		getContentPane().setLayout(null);
	   			
		lblLocal= new JLabel("Local: "+partido.getLocal().getNombreEquipo());
		lblLocal.setBounds(30, 11, 200, 14);
		getContentPane().add(lblLocal);
		
		dtLocal= new JLabel("Entrenador: "+partido.getLocal().getNombreEntrenador());
		dtLocal.setBounds(30, 31, 200, 14);
		getContentPane().add(dtLocal);

		lblVisitante = new JLabel("Visitante: "+partido.getVisitante().getNombreEquipo());
		lblVisitante.setBounds(494, 11, 150, 14);
		getContentPane().add(lblVisitante);
		
		dtVisitante= new JLabel("Entrenador: "+partido.getVisitante().getNombreEntrenador());
		dtVisitante.setBounds(494, 31, 150, 14);
		getContentPane().add(dtVisitante);
		
		lblCuarto = new JLabel("Cuarto "+contadorCuartos);
		lblCuarto.setHorizontalAlignment(SwingConstants.CENTER);
		lblCuarto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCuarto.setBounds(163, 136, 291, 44);
		getContentPane().add(lblCuarto);

		btnAvanzarCuarto = new JButton("Avanzar cuarto");
		btnAvanzarCuarto.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				if(reloj.getCronometroActivo()==false)
				{
					if(partidoAux.getPeriodo()==2)
					{
						if(contadorCuartos<2)
						{				
							contadorCuartos++;
							lblCuarto.setText("Cuarto "+contadorCuartos);
						}
					}
					if(partidoAux.getPeriodo()==4)
					{
						if(contadorCuartos<4)
						{				
							contadorCuartos++;
							lblCuarto.setText("Cuarto "+contadorCuartos);
						}
					}
				}
			}
		});
		btnAvanzarCuarto.setBounds(260, 268, 131, 23);
		getContentPane().add(btnAvanzarCuarto);

		btnFinalizarPartido = new JButton("Finalizar partido");
		btnFinalizarPartido.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				partidoAux.FinalizarPartido();
				archivo archi = new archivo ();
				archi.GuardarTemporada(tt, "LNB");	
				preguntaIncidencia pi = new preguntaIncidencia(tt,partidoAux);
				pi.setVisible(true);
				dispose();	
			}
		});
		
		btnFinalizarPartido.setBounds(260, 302, 131, 23);
		getContentPane().add(btnFinalizarPartido);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		mnVer = new JMenu("Ver");
		menuBar.add(mnVer);
		
		mntmReferencias = new JMenuItem("Referencias");
		mntmReferencias.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				referencias ref=new referencias();
				ref.setVisible(true);
				setResizable(false);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		mnVer.add(mntmReferencias);
		
		reloj= new cronometro(partido.getTiempo());
		panel= reloj;
		panel.setBackground(Color.BLACK);
		panel.setForeground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(188, 11, 266, 110);
		getContentPane().add(panel);
		
		lblFecha = new JLabel("Fecha: "+partido.getFecha());
		lblFecha.setBounds(219, 11, 120, 14);
		getContentPane().add(lblFecha);
		
		partido.TitularesLocal(partido.getLocal().getPlantel());
		partido.TitularesVisitantes(partido.getVisitante().getPlantel());
		partido.SuplentesLocal(partido.getLocal().getPlantel());
		partido.SuplentesVisitantes(partido.getVisitante().getPlantel());
		
		crearBotonesJugadoresLocales(partido.getLocal().getNombreEquipo(),partido.getTitularesLocales(),partido.getSuplentesLocales());
		crearBotonesJugadoresVisitantes(partido.getVisitante().getNombreEquipo(),partido.getTitularesVisitantes(),partido.getSuplentesVisitantes());
		
	}

public void crearBotonesJugadoresLocales(String equipoLocal,HashMap<Integer,jugador> localTitular, HashMap<Integer,jugador> localSuplente)
	{	
		JLabel lblSuplentes;
		JLabel lblCodigos;
		int i = 0;
		botonJugador botonTitulares;
		botonJugador botonSuplentes;
		int coordenadaX = 30;
		int coordenadaY = 36;
		el = equipoLocal;		
		for (Map.Entry<Integer, jugador> entry : localTitular.entrySet()) 
		{
			jugador asd;
			lblCodigos = new JLabel(""+(i=i+1)+".");
			lblCodigos.setForeground(Color.RED);
			lblCodigos.setBounds(coordenadaX-20, coordenadaY=coordenadaY+30, 120, 23);
			asd=entry.getValue();
			botonTitulares = new botonJugador(asd);
			botonTitulares.setText(asd.getApellido());
			
			
			botonTitulares.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					botonJugador x= (botonJugador) e.getSource();
					new agregarIncidencia(partidoAux,el,reloj.getTiempoActual(),x.getDorsal()).setVisible(true);
				}
			});
			getContentPane().add(botonTitulares);
					
			botonTitulares.setBounds(coordenadaX, coordenadaY, 120, 23);
			getContentPane().add(botonTitulares);
			getContentPane().add(lblCodigos);
        }
		
		lblSuplentes = new JLabel ("Suplentes");
		lblSuplentes.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSuplentes.setBounds(coordenadaX, coordenadaY=coordenadaY+30, 120, 23);
		getContentPane().add(lblSuplentes);
		
		for (Map.Entry<Integer, jugador> entry : localSuplente.entrySet())
		{
			jugador x=entry.getValue();
			botonSuplentes = new botonJugador(x);
			botonSuplentes.setText(x.getApellido());
			botonSuplentes.setBounds(coordenadaX, coordenadaY=coordenadaY+30, 120, 23);
			getContentPane().add(botonSuplentes);
		}
	}
	 
	public void crearBotonesJugadoresVisitantes(String equipoVisitante,HashMap<Integer,jugador> visitanteTitular, HashMap<Integer,jugador> visitanteSuplente)
	{	
		JLabel lblSuplentes;
		JLabel lblCodigos;
		int i = 5;
		botonJugador botonTitulares;
		botonJugador botonSuplentes;
		int coordenadaX = 494;
		int coordenadaY = 36;
		ev = equipoVisitante;		

		for (Map.Entry<Integer, jugador> entry : visitanteTitular.entrySet())
		{
			lblCodigos = new JLabel(""+(i=i+1)+".");
			lblCodigos.setForeground(Color.RED);
			lblCodigos.setBounds(coordenadaX-20, coordenadaY=coordenadaY+30, 120, 23);
			jugador x=entry.getValue();
			botonTitulares = new botonJugador(x);
			botonTitulares.setText(x.getApellido());
			botonTitulares.setBounds(coordenadaX, coordenadaY, 120, 23);

			botonTitulares.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{				
					botonJugador x= (botonJugador) e.getSource();				
	     			new agregarIncidencia(partidoAux,ev,reloj.getTiempoActual(),x.getDorsal()).setVisible(true);				
				}
			});
			getContentPane().add(botonTitulares);
			getContentPane().add(lblCodigos);
        }
		
		lblSuplentes = new JLabel ("Suplentes");
		lblSuplentes.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSuplentes.setBounds(coordenadaX, coordenadaY=coordenadaY+30, 120, 23);
		getContentPane().add(lblSuplentes);
		
		
		for (Map.Entry<Integer, jugador> entry : visitanteSuplente.entrySet())
		{
			jugador x=entry.getValue();
			botonSuplentes = new botonJugador(x);
			botonSuplentes.setText(x.getApellido());
			botonSuplentes.setBounds(coordenadaX, coordenadaY=coordenadaY+30, 120, 23);
			getContentPane().add(botonSuplentes);
		}
	}
}
