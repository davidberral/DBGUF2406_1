package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import javax.swing.ButtonGroup;

public class CalculadoraEnvio extends JFrame {

	private JPanel contentPane;
	private JTextField txtCiudadOrigen;
	private JTextField txtCiudadDestino;
	private JRadioButton rdbOrigenNacional;
	private JRadioButton rdbOrigenExtranjero;
	private JRadioButton rdbDestinoNacional;
	private JRadioButton rdbDestinoExtranjero;
	private JComboBox cbTipo;
	private JSpinner spinPeso;
	private JButton btnCalcularPrecio;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private Object isOrigenNacional;
	private Object isDestinoNacional;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraEnvio frame = new CalculadoraEnvio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculadoraEnvio() {
		setFont(new Font("Verdana", Font.PLAIN, 14));
		setTitle("Calculadora envíos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 534, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][left][grow]", "[][][][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Ciudad Origen:");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNewLabel, "cell 1 1,alignx left");
		
		txtCiudadOrigen = new JTextField();
		txtCiudadOrigen.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(txtCiudadOrigen, "cell 2 1,growx");
		txtCiudadOrigen.setColumns(10);
		
		rdbOrigenNacional = new JRadioButton("Nacional");
		buttonGroup.add(rdbOrigenNacional);
		rdbOrigenNacional.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(rdbOrigenNacional, "flowx,cell 2 2");
		
		JLabel lblNewLabel_1 = new JLabel("Ciudad Destino:");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1, "cell 1 3,alignx trailing");
		
		txtCiudadDestino = new JTextField();
		txtCiudadDestino.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(txtCiudadDestino, "flowy,cell 2 3,growx");
		txtCiudadDestino.setColumns(10);
		
		rdbOrigenExtranjero = new JRadioButton("Extranjero");
		buttonGroup.add(rdbOrigenExtranjero);
		rdbOrigenExtranjero.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(rdbOrigenExtranjero, "cell 2 2");
		
		rdbDestinoNacional = new JRadioButton("Nacional");
		buttonGroup_1.add(rdbDestinoNacional);
		rdbDestinoNacional.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(rdbDestinoNacional, "flowx,cell 2 4");
		
		rdbDestinoExtranjero = new JRadioButton("Extranjero");
		buttonGroup_1.add(rdbDestinoExtranjero);
		rdbDestinoExtranjero.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(rdbDestinoExtranjero, "cell 2 4");
		
		JLabel lblNewLabel_2 = new JLabel("Tipo de envío:");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_2, "cell 1 5,alignx left");
		
		cbTipo = new JComboBox();
		cbTipo.setFont(new Font("Verdana", Font.PLAIN, 14));
		cbTipo.setModel(new DefaultComboBoxModel(new String[] {"Paq 10 - Antes de las 10 h", "Paq 14 - Antes de las 14 h", "Paq 24 - Al día siguiente"}));
		contentPane.add(cbTipo, "cell 2 5,growx");
		
		JLabel lblNewLabel_3 = new JLabel("Peso:");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_3, "cell 1 7");
		
		spinPeso = new JSpinner();
		spinPeso.setModel(new SpinnerNumberModel(1, 1, 40, 1));
		spinPeso.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(spinPeso, "cell 2 7");
		
		btnCalcularPrecio = new JButton("Calcular Precio");
		btnCalcularPrecio.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(btnCalcularPrecio, "cell 2 9,alignx center");
	}
	
		public double calcularImporte() {
		
		double preciobase=4;
		double precioTotal=0;
		String tipo =(String) cbTipo.getSelectedItem();
		
		
		if (isOrigenNacional==isDestinoNacional) {
			precioTotal=preciobase;
			
			}else if  (cbTipo.equals("Paq 10 - Antes de las 10 h")) {
				precioTotal = preciobase+5;
			} else if (cbTipo.equals("Paq - Antes de las 14 h")) {
				precioTotal= preciobase+2;
			
			}else if	(isOrigenNacional!=isDestinoNacional) {
				precioTotal=7;
		}
		
		
		return precioTotal;
	}

}
