package Concesionario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;

public class ListadoCoches extends JFrame {

	private JPanel usuariosVentana;
	private JTable tabla;
	private DefaultTableModel modelo;
	private JButton btnBaja, btnModificar;
	public static ListadoCoches frame;
	public static int id;
	Conexion conex = new Conexion();

	public static void main(String[] args) {
		frame = new ListadoCoches();
		frame.setVisible(true);

	}
	public static void crearFrame() {
		frame = new ListadoCoches();
		frame.setVisible(true);
	}
	public ListadoCoches() {
		setTitle("ListadoCoches");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1043, 551);
		usuariosVentana = new JPanel();
		usuariosVentana.setBackground(new Color(51, 204, 255));
		usuariosVentana.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				tabla.getSelectionModel().clearSelection();

			}
		});
		usuariosVentana.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(usuariosVentana);
		usuariosVentana.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 89, 988, 147);
		usuariosVentana.add(scrollPane);

		tabla = new JTable();
		tabla.setBackground(new Color(255, 255, 0));
		tabla.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				int fila = tabla.getSelectedRow();
				updateBaja();
				updateModificar();
			}
		});

		modelo = new DefaultTableModel(conex.obtenerDatos(), new String[] { "ID", "MARCA", "MODELO", "PRECIO_COCHE",
				"COLOR", "PRECIO_COLOR", "MOTOR", "PRECIO_MOTOR", "VERSIÓN", "VERSIÓN_PRECIO", "PRECIO_TOTAL" });
		tabla.setModel(new DefaultTableModel(conex.obtenerDatos(),
				new String[] { "ID", "MARCA", "MODELO", "PRECIO_COCHE", "COLOR", "PRECIO_COLOR", "MOTOR",
						"PRECIO_MOTOR", "VERSIÓN", "VERSIÓN_PRECIO", "PRECIO_TOTAL" }) {
			Class[] columnTypes = new Class[] { String.class, String.class, String.class, String.class, String.class,
					String.class, String.class, String.class, String.class, String.class, String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}

			boolean[] columnEditables = new boolean[] { false, false, false, false, false, false, false, false, false,
					false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tabla.getColumnModel().getColumn(0).setPreferredWidth(40);
		tabla.getColumnModel().getColumn(8).setPreferredWidth(79);
		tabla.getColumnModel().getColumn(9).setPreferredWidth(113);
		scrollPane.setViewportView(tabla);

		btnBaja = new JButton("Baja");
		btnBaja.setEnabled(false);
		btnBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conexion conex = new Conexion();
				int rowIndex = tabla.getSelectedRow();
				try {
					id = Integer.parseInt(tabla.getValueAt(rowIndex, 0).toString());
					conex.borrar(id);
					id=-1;
				}
				catch(NumberFormatException ex) {
					
				}
				modelo = new DefaultTableModel(conex.obtenerDatos(),
						new String[] { "ID", "MARCA", "MODELO", "PRECIO_COCHE", "COLOR", "PRECIO_COLOR", "MOTOR",
								"PRECIO_MOTOR", "VERSIÓN", "VERSIÓN_PRECIO", "PRECIO_TOTAL" });
				tabla.setModel(new DefaultTableModel(conex.obtenerDatos(),
						new String[] { "ID", "MARCA", "MODELO", "PRECIO_COCHE", "COLOR", "PRECIO_COLOR", "MOTOR",
								"PRECIO_MOTOR", "VERSIÓN", "VERSIÓN_PRECIO", "PRECIO_TOTAL" }) {
					Class[] columnTypes = new Class[] { String.class, String.class, String.class, String.class,
							String.class, String.class, String.class, String.class, String.class, String.class,
							String.class };

					public Class getColumnClass(int columnIndex) {
						return columnTypes[columnIndex];
					}

					boolean[] columnEditables = new boolean[] { false, false, false, false, false, false, false, false,
							false, false, false };

					public boolean isCellEditable(int row, int column) {
						return columnEditables[column];
					}
				});
			}
		});
		btnBaja.setBounds(241, 270, 71, 23);
		usuariosVentana.add(btnBaja);

		btnModificar = new JButton("Modificar");
		btnModificar.setEnabled(false);
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rowIndex = tabla.getSelectedRow();
				try {
					id = Integer.parseInt(tabla.getValueAt(rowIndex, 0).toString());
					frame.setVisible(false);
					CrearCoches window = new CrearCoches();
					window.cochesWindow.setVisible(true);
				}
				catch(NumberFormatException ex) {
					
				}
			}
		});
		btnModificar.setBounds(353, 270, 98, 23);
		usuariosVentana.add(btnModificar);

		JButton volver = new JButton("Menu");
		
		volver.setEnabled(true);
		volver.setBounds(141, 270, 71, 23);
		usuariosVentana.add(volver);

		JTextPane txtpnUsuarios = new JTextPane();
		txtpnUsuarios.setEditable(false);
		txtpnUsuarios.setBackground(new Color(51, 204, 255));
		txtpnUsuarios.setFont(new Font("Arial Black", Font.PLAIN, 25));
		txtpnUsuarios.setForeground(new Color(255, 255, 0));
		txtpnUsuarios.setText("COCHES");
		txtpnUsuarios.setBounds(165, 24, 218, 39);
		usuariosVentana.add(txtpnUsuarios);
		volver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				frame.setVisible(false);
				Inicio window = new Inicio();
				window.menu.setVisible(true);
				}catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
	}

	
	private void updateBaja() {
		if (tabla.getSelectedRow() == -1) {
			btnBaja.setEnabled(false);
		}

		else {
			btnBaja.setEnabled(true);
		}
	}

	private void updateModificar() {
		if (tabla.getSelectedRow() == -1) {
			btnModificar.setEnabled(false);
		}
		 else {
			btnModificar.setEnabled(true);
		}
	}

}
