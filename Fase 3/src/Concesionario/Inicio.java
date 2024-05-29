package Concesionario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import java.awt.Font;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JMenu;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Inicio {

	public JFrame menu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
					window.menu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		menu = new JFrame();
		menu.getContentPane().setBackground(new Color(0, 191, 255));
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(0, 204, 255));
		menu.getContentPane().add(desktopPane, BorderLayout.CENTER);
		
		JButton configCoches = new JButton("CONFIGURACIÓN COCHES");
		configCoches.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.setVisible(false);
				CrearCoches window = new CrearCoches();
				window.cochesWindow.setVisible(true);
			}
		});
		configCoches.setBackground(new Color(255, 255, 0));
		configCoches.setFont(new Font("Arial Black", Font.BOLD, 20));
		configCoches.setBounds(44, 91, 465, 23);
		desktopPane.add(configCoches);
		
		JButton gestionCoches = new JButton("GESTIÓN COCHES");
		gestionCoches.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.setVisible(false);
				ListadoCoches.crearFrame();
			}
		});
		gestionCoches.setFont(new Font("Arial Black", Font.BOLD, 20));
		gestionCoches.setBackground(Color.YELLOW);
		gestionCoches.setBounds(47, 133, 465, 23);
		desktopPane.add(gestionCoches);
		
		JButton btnClientes = new JButton("GESTIÓN CLIENTES");
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.setVisible(false);
				ListadoClientes.crearFrame();
			}
		});
		btnClientes.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnClientes.setBackground(Color.YELLOW);
		btnClientes.setBounds(47, 167, 465, 23);
		desktopPane.add(btnClientes);
		
		JTextArea txtrConcesionario = new JTextArea();
		txtrConcesionario.setEditable(false);
		txtrConcesionario.setForeground(new Color(51, 204, 255));
		txtrConcesionario.setText("CONCESIONARIO");
		txtrConcesionario.setFont(new Font("Arial Black", Font.BOLD, 24));
		txtrConcesionario.setBackground(new Color(255, 255, 0));
		txtrConcesionario.setBounds(143, 11, 243, 57);
		desktopPane.add(txtrConcesionario);
		menu.setBounds(100, 100, 548, 278);
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
