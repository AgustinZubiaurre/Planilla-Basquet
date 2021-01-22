package Swing;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class referencias extends JFrame 
{
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblDobleConvertido;
	private JLabel lblDobleErrado;
	private JLabel lblTripleConvertido;
	private JLabel lblTripleErrado;
	private	JLabel lblSimpleConvertido;
	private	JLabel lblSimpleErrado;
	private	JLabel lblFalta;
	private	JLabel lblFaltaTecnica;
	private	JLabel lblAsistencia;
	private	JLabel lblPerdida;
	private	JLabel lblReboteEnAtaque;
	private	JLabel lblReboteEnDefensa;
	private	JLabel lblRobo;
	private JLabel lblTapa;
	
	public referencias()   // muestra los codigos de accion de las incidencias
	{		
		setTitle("Referencias");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 200, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Codigos de Accion", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblDobleConvertido = new JLabel("01. Doble Convertido");
		lblDobleConvertido.setBounds(11, 29, 134, 14);
		panel.add(lblDobleConvertido);
		lblDobleConvertido.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblDobleErrado = new JLabel("02. Doble Errado");
		lblDobleErrado.setBounds(11, 49, 101, 14);
		panel.add(lblDobleErrado);
		lblDobleErrado.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblTripleConvertido = new JLabel("03. Triple Convertido");
		lblTripleConvertido.setBounds(11, 69, 134, 14);
		panel.add(lblTripleConvertido);
		lblTripleConvertido.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblTripleErrado = new JLabel("04. Triple Errado");
		lblTripleErrado.setBounds(11, 89, 134, 14);
		panel.add(lblTripleErrado);
		lblTripleErrado.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblSimpleConvertido = new JLabel("05. Simple Convertido");
		lblSimpleConvertido.setBounds(11, 109, 134, 14);
		panel.add(lblSimpleConvertido);
		lblSimpleConvertido.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblSimpleErrado = new JLabel("06. Simple Errado");
		lblSimpleErrado.setBounds(11, 129, 134, 14);
		panel.add(lblSimpleErrado);
		lblSimpleErrado.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblFalta = new JLabel("07. Falta");
		lblFalta.setBounds(11, 149, 82, 14);
		panel.add(lblFalta);
		lblFalta.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblFaltaTecnica = new JLabel("08. Falta Tecnica");
		lblFaltaTecnica.setBounds(11, 169, 112, 14);
		panel.add(lblFaltaTecnica);
		lblFaltaTecnica.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblAsistencia = new JLabel("09. Asistencia");
		lblAsistencia.setBounds(11, 189, 101, 14);
		panel.add(lblAsistencia);
		lblAsistencia.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblPerdida = new JLabel("10. Perdida");
		lblPerdida.setBounds(11, 209, 101, 14);
		panel.add(lblPerdida);
		lblPerdida.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblReboteEnAtaque = new JLabel("13. Rebote en Ataque");
		lblReboteEnAtaque.setBounds(11, 269, 144, 14);
		panel.add(lblReboteEnAtaque);
		lblReboteEnAtaque.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblReboteEnDefensa = new JLabel("12. Rebote en Defensa");
		lblReboteEnDefensa.setBounds(11, 249, 144, 14);
		panel.add(lblReboteEnDefensa);
		lblReboteEnDefensa.setHorizontalAlignment(SwingConstants.LEFT);
		
		lblRobo = new JLabel("11. Robo");
		lblRobo.setBounds(11, 229, 82, 14);
		panel.add(lblRobo);
		
		lblTapa = new JLabel("14. Tapa");
		lblTapa.setBounds(11, 289, 82, 14);
		panel.add(lblTapa);
	}
}
