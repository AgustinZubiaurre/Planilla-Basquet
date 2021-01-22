package Swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Planilla.equipo;
import Planilla.jugador;
import Planilla.temporada;
import Planilla.partido;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashMap;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class partidoNuevo extends JFrame
{	
	private JComboBox<Object> comboBoxLocal;
	private JComboBox<Object> comboBoxVisitante;
	private JComboBox comboBoxPeriodos;
	private JComboBox comboBoxDuracion;
	private JButton btnIniciar; 
	private JButton btnAtras;
	private JTextField textFieldFecha;	
	private JLabel lblLocal;
	private JLabel lblVisitante;
	private JLabel lblDuracion;
	private JLabel lblPeriodos;
	private temporada tt;
	
	public partidoNuevo(temporada t) 
	{
		tt=t;
		setTitle("Nuevo Partido");
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	    lblLocal = new JLabel("Local");
		lblLocal.setBounds(10, 40, 72, 14);
		getContentPane().add(lblLocal);
		
		lblVisitante = new JLabel("Visitante");
		lblVisitante.setBounds(10, 80, 72, 14);
		getContentPane().add(lblVisitante);
		
		lblDuracion = new JLabel("Duracion");
		lblDuracion.setBounds(10, 160, 72, 14);
		getContentPane().add(lblDuracion);
		
		lblPeriodos = new JLabel("Periodos");
		lblPeriodos.setBounds(10, 120, 72, 14);
		getContentPane().add(lblPeriodos);
		
		comboBoxLocal = new JComboBox<Object>();
		comboBoxLocal.setBounds(94, 37, 150, 20);
		getContentPane().add(comboBoxLocal);
		getEquipos(t.getListaEquipos());
		
		comboBoxVisitante = new JComboBox<Object>();
		comboBoxVisitante.setBounds(94, 77, 150, 20);
		getContentPane().add(comboBoxVisitante);
		getEquiposV(t.getListaEquipos());
		
		
		comboBoxPeriodos = new JComboBox<Object>();
		comboBoxPeriodos.addItemListener(new ItemListener() 
		{
			public void itemStateChanged(ItemEvent evt) 
			{
				if(evt.getStateChange()== ItemEvent.SELECTED)
				{
					if(comboBoxPeriodos.getSelectedIndex()>0)
					{
						comboBoxDuracion.setModel(new DefaultComboBoxModel(getTiempo(comboBoxPeriodos.getSelectedItem().toString())));
					}
				}
			}
		});
		comboBoxPeriodos.setModel(new DefaultComboBoxModel(new String[] {"Elegir", "2", "4"}));
		comboBoxPeriodos.setBounds(93, 117, 115, 20);
		getContentPane().add(comboBoxPeriodos);
		
		comboBoxDuracion = new JComboBox();
		comboBoxDuracion.setBounds(92, 157, 116, 20);
		getContentPane().add(comboBoxDuracion);
		
		btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if(comboBoxLocal.getSelectedItem().equals(comboBoxVisitante.getSelectedItem()) || comboBoxPeriodos.getSelectedItem()=="Elegir")
				{
					JOptionPane.showMessageDialog(null, "Los equipos seleccionados son el mismo o no se asigno duracion/periodos");	
				}
				else
				{
					int tiempo=Integer.parseInt(comboBoxDuracion.getSelectedItem().toString());
					int periodo = Integer.parseInt(comboBoxPeriodos.getSelectedItem().toString());
					
					String fecha=textFieldFecha.getText();
					
					equipo local = tt.DevuelveEquipo(comboBoxLocal.getSelectedItem().toString());							// creo el equipo local	elegido
					equipo visitante = tt.DevuelveEquipo(comboBoxVisitante.getSelectedItem().toString());					// creo el equipo visitante elegido
					
					partido picadito=new partido(tiempo, periodo, fecha,local,visitante);											// creo el partido	
					
					local.AgregaPartidoDirecto(picadito);																	// cargo el partdio a la lista de partidos del equipo	
					visitante.AgregaPartidoDirecto(picadito);																// cargo el partdio a la lista de partidos del equipo
					
					partidoEnCurso y = new partidoEnCurso(tt, picadito);
					y.setBounds(100, 200, 650, 500);
					y.setVisible(true);
					dispose();
				}
				
			}
		});
		
		btnIniciar.setBounds(297, 242, 89, 23);
		getContentPane().add(btnIniciar);
		
		btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				dispose();
			}
		});
		btnAtras.setBounds(98, 242, 89, 23);
		getContentPane().add(btnAtras);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(10, 199, 72, 14);
		getContentPane().add(lblFecha);
		
		textFieldFecha = new JTextField();
		textFieldFecha.setBounds(94, 196, 114, 20);
		getContentPane().add(textFieldFecha);
		textFieldFecha.setColumns(10);
		
	}
	
	//http://helpdesk.objects.com.au/java/how-do-i-populate-a-combo-box-jcombobox-with-the-keys-from-a-map
		
	public void getEquipos(HashMap<String,equipo> le)
	{
			Object[] keys = le.keySet().toArray();
			ComboBoxModel<Object> model = new DefaultComboBoxModel<Object>(keys);
			comboBoxLocal.setModel(model);
	}
	public void getEquiposV(HashMap<String,equipo> le)
	{
			Object[] keys = le.keySet().toArray();
			ComboBoxModel<Object> model = new DefaultComboBoxModel<Object>(keys);
			comboBoxVisitante.setModel(model);
	}
	
	//<Tutorial Java - ComboBox dependientes (Anidados)> https://www.youtube.com/watch?v=kprt8608mgk&t=10s 
	
	public String[] getTiempo(String p)
	{
		String periodo[]=new String[2];
		
		if(p.equalsIgnoreCase("2"))
		{
			periodo[0]="20";
		}
		if(p.equalsIgnoreCase("4"))
		{
			periodo[0]="10";
			periodo[1]="12";
		}
		
		return periodo;
	}
	
}
