package Swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import Planilla.jugador;
import Planilla.partido;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class agregarIncidencia extends JFrame{
	
	private JTextField textFieldIncidencia;
	private JLabel lblIngreseNumeroIncidencia;
	private JLabel lblPresioneEnter;
	private partido partAux;
	private String equipoAux;
	private String tiempoAux;
	private int dorsalAux;
	
	public agregarIncidencia(partido part,String equipo,String tiempo, int dorsal) 
	{		
		partAux = part;
		equipoAux = equipo;
		tiempoAux=tiempo;
		dorsalAux = dorsal;
		
		setSize(305,183);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		lblIngreseNumeroIncidencia = new JLabel("Ingrese numero incidencia");
		lblIngreseNumeroIncidencia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIngreseNumeroIncidencia.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseNumeroIncidencia.setBounds(0, 0, 287, 74);
		getContentPane().add(lblIngreseNumeroIncidencia);

		textFieldIncidencia = new JTextField();
		textFieldIncidencia.setBounds(96, 74, 86, 20);
		getContentPane().add(textFieldIncidencia);
		textFieldIncidencia.setColumns(10);
		
		lblPresioneEnter = new JLabel("Presione enter");
		lblPresioneEnter.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPresioneEnter.setBounds(193, 120, 94, 25);
		getContentPane().add(lblPresioneEnter);
		textFieldIncidencia.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if(textFieldIncidencia.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "El campo esta vacio");
				}else
				{
					int codigo= Integer.parseInt(textFieldIncidencia.getText());
					partAux.GuardaIncidencia(equipoAux, tiempoAux, dorsalAux , codigo);
					dispose();
				}
				if(textFieldIncidencia.getText().isEmpty()==false)
				{
					int control=Integer.parseInt(textFieldIncidencia.getText());
					if(control<14)
					{
						JOptionPane.showMessageDialog(null, "El numero ingresado es invalido");								
					}
					else
					{
						int codigo= Integer.parseInt(textFieldIncidencia.getText());
						partAux.GuardaIncidencia(equipoAux, tiempoAux, dorsalAux , codigo);
						dispose();		
					}
				}
			}
		});
	}
}
