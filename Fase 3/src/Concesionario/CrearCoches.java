package Concesionario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.DefaultComboBoxModel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JSeparator;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CrearCoches {

	public JFrame cochesWindow;
	private JTextField clienteNombre;
	private JTextField clienteApellido;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearCoches window = new CrearCoches();
					window.cochesWindow.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CrearCoches() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		cochesWindow = new JFrame();
		cochesWindow.setBounds(100, 100, 1128, 547);
		cochesWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cochesWindow.getContentPane().setLayout(new BoxLayout(cochesWindow.getContentPane(), BoxLayout.X_AXIS));
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(51, 204, 255));
		cochesWindow.getContentPane().add(desktopPane);
		
		JComboBox marca = new JComboBox();
		marca.setBackground(new Color(255, 255, 0));
		marca.setModel(new DefaultComboBoxModel(new String[] {"RENAULT"}));
		marca.setBounds(52, 135, 125, 22);
		desktopPane.add(marca);
		
		JComboBox modelo = new JComboBox();
		modelo.setBackground(new Color(255, 255, 0));
		modelo.setModel(new DefaultComboBoxModel(new String[] {"MEGANE", "CLIO", "AUSTRAL", "CAPTUR", "TALISMAN", "ARKANA", "TWINGO", "KOLEOS", "KADJAR"}));
		modelo.setBounds(229, 135, 114, 22);
		desktopPane.add(modelo);
		
		JComboBox precioCoche = new JComboBox();
		precioCoche.setBackground(new Color(255, 255, 0));
		precioCoche.setModel(new DefaultComboBoxModel(new String[] {"39700", "37000", "33500", "26780", "19950", "19000", "16000", "13000"}));
		precioCoche.setBounds(382, 135, 132, 22);
		desktopPane.add(precioCoche);
		
		JComboBox precioVersion = new JComboBox();
		precioVersion.setBackground(new Color(255, 255, 0));
		precioVersion.setModel(new DefaultComboBoxModel(new String[] {"2600", "1800", "600", "0"}));
		precioVersion.setBounds(229, 381, 132, 22);
		desktopPane.add(precioVersion);
		
		JComboBox colorNombre = new JComboBox();
		colorNombre.setBackground(new Color(255, 255, 0));
		colorNombre.setModel(new DefaultComboBoxModel(new String[] {"AMARILLO RACING", "NARANJA TONIC", "VERDE", "NEGRO", "BLANCO NACARADO", "ROJO DESEO", "AZUL RAYO", "AZUL CIELO"}));
		colorNombre.setBounds(52, 219, 144, 22);
		desktopPane.add(colorNombre);
		
		JComboBox precioColor = new JComboBox();
		precioColor.setBackground(new Color(255, 255, 0));
		precioColor.setModel(new DefaultComboBoxModel(new String[] {"1800", "1800", "1350", "1000", "790", "600", "400", "0", "0"}));
		precioColor.setBounds(229, 219, 132, 22);
		desktopPane.add(precioColor);
		
		JComboBox precioMotor = new JComboBox();
		precioMotor.setBackground(new Color(255, 255, 0));
		precioMotor.setModel(new DefaultComboBoxModel(new String[] {"3500", "2400", "2000", "1750", "1300", "0"}));
		precioMotor.setBounds(231, 297, 132, 22);
		desktopPane.add(precioMotor);
		
		JComboBox motorName = new JComboBox();
		motorName.setBackground(new Color(255, 255, 0));
		motorName.setModel(new DefaultComboBoxModel(new String[] {"1.8 T 300 CV", "ETECH FULL HYBRID 200CV", "1.5 DCI 110 CV", "1.5 TSE 130 CV", "1.4 DCI 90 CV", "1.2 75 CV GAS"}));
		motorName.setBounds(54, 297, 144, 22);
		desktopPane.add(motorName);
		
		JComboBox versionNombre = new JComboBox();
		versionNombre.setBackground(new Color(255, 255, 0));
		versionNombre.setModel(new DefaultComboBoxModel(new String[] {"RS TROPHY", "RS ", "ZEN", "SERIE"}));
		versionNombre.setBounds(52, 381, 144, 22);
		desktopPane.add(versionNombre);
		
		JTextPane txtpnMarca = new JTextPane();
		txtpnMarca.setEditable(false);
		txtpnMarca.setBackground(new Color(51, 204, 255));
		txtpnMarca.setText("MARCA");
		txtpnMarca.setFont(new Font("Arial Black", Font.PLAIN, 14));
		txtpnMarca.setBounds(52, 104, 125, 20);
		desktopPane.add(txtpnMarca);
		
		JTextPane txtpnModelo = new JTextPane();
		txtpnModelo.setEditable(false);
		txtpnModelo.setText("MODELO");
		txtpnModelo.setFont(new Font("Arial Black", Font.PLAIN, 14));
		txtpnModelo.setBackground(new Color(51, 204, 255));
		txtpnModelo.setBounds(229, 104, 125, 20);
		desktopPane.add(txtpnModelo);
		
		JTextPane txtpnPrecio = new JTextPane();
		txtpnPrecio.setEditable(false);
		txtpnPrecio.setText("PRECIO");
		txtpnPrecio.setFont(new Font("Arial Black", Font.PLAIN, 14));
		txtpnPrecio.setBackground(new Color(51, 204, 255));
		txtpnPrecio.setBounds(382, 104, 125, 20);
		desktopPane.add(txtpnPrecio);
		
		JTextPane txtColor = new JTextPane();
		txtColor.setEditable(false);
		txtColor.setText("COLOR");
		txtColor.setFont(new Font("Arial Black", Font.PLAIN, 14));
		txtColor.setBackground(new Color(51, 204, 255));
		txtColor.setBounds(52, 188, 125, 20);
		desktopPane.add(txtColor);
		
		JTextPane txtpnPrecio_1 = new JTextPane();
		txtpnPrecio_1.setEditable(false);
		txtpnPrecio_1.setText("PRECIO");
		txtpnPrecio_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		txtpnPrecio_1.setBackground(new Color(51, 204, 255));
		txtpnPrecio_1.setBounds(229, 188, 125, 20);
		desktopPane.add(txtpnPrecio_1);
		
		JTextPane txtMotor = new JTextPane();
		txtMotor.setEditable(false);
		txtMotor.setText("MOTOR");
		txtMotor.setFont(new Font("Arial Black", Font.PLAIN, 14));
		txtMotor.setBackground(new Color(51, 204, 255));
		txtMotor.setBounds(52, 266, 125, 20);
		desktopPane.add(txtMotor);
		
		JTextPane txtpnPrecio_1_1 = new JTextPane();
		txtpnPrecio_1_1.setEditable(false);
		txtpnPrecio_1_1.setText("PRECIO");
		txtpnPrecio_1_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		txtpnPrecio_1_1.setBackground(new Color(51, 204, 255));
		txtpnPrecio_1_1.setBounds(229, 266, 125, 20);
		desktopPane.add(txtpnPrecio_1_1);
		
		JTextPane txtColor_2 = new JTextPane();
		txtColor_2.setEditable(false);
		txtColor_2.setText("VERSION");
		txtColor_2.setFont(new Font("Arial Black", Font.PLAIN, 14));
		txtColor_2.setBackground(new Color(51, 204, 255));
		txtColor_2.setBounds(52, 350, 125, 20);
		desktopPane.add(txtColor_2);
		
		JTextPane txtpnPrecio_1_2 = new JTextPane();
		txtpnPrecio_1_2.setEditable(false);
		txtpnPrecio_1_2.setText("PRECIO");
		txtpnPrecio_1_2.setFont(new Font("Arial Black", Font.PLAIN, 14));
		txtpnPrecio_1_2.setBackground(new Color(51, 204, 255));
		txtpnPrecio_1_2.setBounds(229, 350, 125, 20);
		desktopPane.add(txtpnPrecio_1_2);
		
		JTextPane txtconfig = new JTextPane();
		txtconfig.setEditable(false);
		txtconfig.setForeground(new Color(255, 255, 0));
		txtconfig.setText("CONFIGURA TU VEHÍCULO");
		txtconfig.setFont(new Font("Arial Black", Font.PLAIN, 20));
		txtconfig.setBackground(new Color(51, 204, 255));
		txtconfig.setBounds(142, 34, 349, 39);
		desktopPane.add(txtconfig);
		
		JButton btnAddCar = new JButton("Creación del vehículo");
		btnAddCar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = (String) motorName.getSelectedItem();
				double precio = Double.parseDouble((String) precioMotor.getSelectedItem());
				Motor motor = new Motor(nombre, precio);
				nombre = (String) colorNombre.getSelectedItem();
				precio = Double.parseDouble((String) precioColor.getSelectedItem());
				ColorCoche color = new ColorCoche(nombre, precio);
				nombre =(String) versionNombre.getSelectedItem();
				precio = Double.parseDouble((String) precioVersion.getSelectedItem());
				Version version = new Version (nombre, precio);
				String marcaCoche = (String) marca.getSelectedItem();
				String modeloCoche =(String) modelo.getSelectedItem();
				precio = Double.parseDouble((String)precioCoche.getSelectedItem());
				Coche coche = new Coche(marcaCoche,modeloCoche,precio,motor,color,version);
				Conexion conex  = new Conexion();
				conex.insertar(coche);
			}
		});
		btnAddCar.setBounds(493, 448, 158, 22);
		desktopPane.add(btnAddCar);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cochesWindow.setVisible(false);
				Inicio window = new Inicio();
				window.menu.setVisible(true);
			}
		});
		btnVolver.setBounds(370, 448, 89, 23);
		desktopPane.add(btnVolver);
		
		JButton actualizarBtn = new JButton("Actualizar Coche");
		actualizarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conexion conex = new Conexion();
				String nombre = (String) motorName.getSelectedItem();
				double precio = Double.parseDouble((String) precioMotor.getSelectedItem());
				Motor motor = new Motor(nombre, precio);
				nombre = (String) colorNombre.getSelectedItem();
				precio = Double.parseDouble((String) precioColor.getSelectedItem());
				ColorCoche color = new ColorCoche(nombre, precio);
				nombre =(String) versionNombre.getSelectedItem();
				precio = Double.parseDouble((String) precioVersion.getSelectedItem());
				Version version = new Version (nombre, precio);
				String marcaCoche = (String) marca.getSelectedItem();
				String modeloCoche =(String) modelo.getSelectedItem();
				precio = Double.parseDouble((String)precioCoche.getSelectedItem());
				Coche coche = new Coche(marcaCoche,modeloCoche,precio,motor,color,version);
				conex.modificar(coche, ListadoCoches.id);
				ListadoCoches.id =-1;
				cochesWindow.setVisible(false);
				ListadoCoches.crearFrame();
			}
		});
		actualizarBtn.setBounds(683, 448, 144, 23);
		desktopPane.add(actualizarBtn);
		
		JButton btnVender = new JButton("Venta del coche");
		btnVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conexion conex = new Conexion();
				String nombre = (String) motorName.getSelectedItem();
				double precio = Double.parseDouble((String) precioMotor.getSelectedItem());
				Motor motor = new Motor(nombre, precio);
				nombre = (String) colorNombre.getSelectedItem();
				precio = Double.parseDouble((String) precioColor.getSelectedItem());
				ColorCoche color = new ColorCoche(nombre, precio);
				nombre =(String) versionNombre.getSelectedItem();
				precio = Double.parseDouble((String) precioVersion.getSelectedItem());
				Version version = new Version (nombre, precio);
				String marcaCoche = (String) marca.getSelectedItem();
				String modeloCoche =(String) modelo.getSelectedItem();
				precio = Double.parseDouble((String)precioCoche.getSelectedItem());
				Coche coche = new Coche(marcaCoche,modeloCoche,precio,motor,color,version);
				nombre = clienteNombre.getText();
				String apellido = clienteApellido.getText();
				conex.vender(coche, nombre, apellido);
				cochesWindow.setVisible(false);
				ListadoClientes.crearFrame();
			}
		});
		btnVender.setBounds(860, 448, 158, 22);
		desktopPane.add(btnVender);
		btnVender.setEnabled(false);
		
		clienteNombre = new JTextField();
		clienteNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(clienteNombre.getText().isBlank() || clienteApellido.getText().isBlank()) {
					btnVender.setEnabled(false);
				}
				else {
					btnVender.setEnabled(true);
				}
			}
		});
		clienteNombre.setBounds(549, 266, 139, 20);
		desktopPane.add(clienteNombre);
		clienteNombre.setColumns(10);
		
		clienteApellido = new JTextField();
		clienteApellido.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(clienteNombre.getText().isBlank() || clienteApellido.getText().isBlank()) {
					btnVender.setEnabled(false);
				}
				else {
					btnVender.setEnabled(true);
				}
			}
			
		});
		clienteApellido.setColumns(10);
		clienteApellido.setBounds(740, 266, 139, 20);
		desktopPane.add(clienteApellido);
		
		JTextPane txtpnPrecio_1_2_1 = new JTextPane();
		txtpnPrecio_1_2_1.setEditable(false);
		txtpnPrecio_1_2_1.setText("NOMBRE");
		txtpnPrecio_1_2_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		txtpnPrecio_1_2_1.setBackground(new Color(51, 204, 255));
		txtpnPrecio_1_2_1.setBounds(549, 235, 125, 20);
		desktopPane.add(txtpnPrecio_1_2_1);
		
		JTextPane txtpnPrecio_1_2_2 = new JTextPane();
		txtpnPrecio_1_2_2.setEditable(false);
		txtpnPrecio_1_2_2.setText("APELLIDO");
		txtpnPrecio_1_2_2.setFont(new Font("Arial Black", Font.PLAIN, 14));
		txtpnPrecio_1_2_2.setBackground(new Color(51, 204, 255));
		txtpnPrecio_1_2_2.setBounds(740, 235, 125, 20);
		desktopPane.add(txtpnPrecio_1_2_2);
		
		
	}
	
}
