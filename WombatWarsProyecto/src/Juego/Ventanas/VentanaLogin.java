package Juego.Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Juego.Logger.logger;
import Juego.UtilidadesLogin.Usuario;
import Juego.UtilidadesLogin.UsuarioRepetido;
import Juego.UtilidadesLogin.Utilidades;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.event.ActionEvent;

public class VentanaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private boolean loginCorrecto;
	private Usuario u;

	public void Login() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblLogin = new JLabel("Inicio de Sesión");
		lblLogin.setBounds(50, 33, 200, 26);
		contentPane.add(lblLogin);

		JLabel lblNombreDeUsuario = new JLabel("Nombre de Usuario: ");
		lblNombreDeUsuario.setBounds(50, 134, 187, 26);
		contentPane.add(lblNombreDeUsuario);

		JLabel lblContrasenya = new JLabel("Contrase�a: ");
		lblContrasenya.setBounds(50, 218, 187, 26);
		contentPane.add(lblContrasenya);

		textField = new JTextField();
		textField.setBounds(314, 131, 186, 32);
		contentPane.add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(314, 215, 187, 29);
		contentPane.add(passwordField);

		JButton btnRegis = new JButton("Registrarse");
		btnRegis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Registrarse res = new Registrarse();
				res.setVisible(true);
		
			}	
		});
		btnRegis.setBounds(420, 325, 110, 25);
		contentPane.add(btnRegis);
		
		JButton btnIniciarSesin = new JButton("Iniciar Sesi\u00F3n");
		btnIniciarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comprobarLogin(textField.getText(), passwordField.getText());
				hacerLogin(textField.getText(), passwordField.getText());
				if (loginCorrecto) {
					JOptionPane.showMessageDialog(contentPane, "Login correcto");
					logger.log.info("INFO: Se ha realizado el LogIn correctamente.");
					
					menu men = new menu();
					men.X();
					
					VentanaLogin.this.setVisible(false);
					VentanaLogin.this.dispose();
					logger.log.info("INFO: Se ha abierto el menu correctamente."); 

					
					
				} else {
					JOptionPane.showMessageDialog(contentPane, "Login incorrecto");
					logger.log.error("ERROR: Error del usuario en el Login");
				}
			}
		});
		btnIniciarSesin.setBounds(208, 273, 187, 35);
		contentPane.add(btnIniciarSesin);
	}
	
	public void Login2() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		setVisible(true);
		dispose();
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblLogin = new JLabel("Inicio de Sesión");
		lblLogin.setBounds(50, 33, 200, 26);
		contentPane.add(lblLogin);

		JLabel lblNombreDeUsuario = new JLabel("Nombre de Usuario: ");
		lblNombreDeUsuario.setBounds(50, 134, 187, 26);
		contentPane.add(lblNombreDeUsuario);

		JLabel lblContrasenya = new JLabel("Contrase�a: ");
		lblContrasenya.setBounds(50, 218, 187, 26);
		contentPane.add(lblContrasenya);

		textField = new JTextField();
		textField.setBounds(314, 131, 186, 32);
		contentPane.add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(314, 215, 187, 29);
		contentPane.add(passwordField);

		JButton btnRegis = new JButton("Registrarse");
		btnRegis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Registrarse res = new Registrarse();
				res.setVisible(true);
		
			}	
		});
		btnRegis.setBounds(420, 325, 110, 25);
		contentPane.add(btnRegis);
		
		JButton btnIniciarSesin = new JButton("Iniciar Sesi\u00F3n");
		btnIniciarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comprobarLogin(textField.getText(), passwordField.getText());
				hacerLogin(textField.getText(), passwordField.getText());
				if (loginCorrecto) {
					JOptionPane.showMessageDialog(contentPane, "Login correcto");
					logger.log.info("INFO: Se ha realizado el LogIn correctamente.");
					
					menu men = new menu();
					men.X();
					
					VentanaLogin.this.setVisible(false);
					VentanaLogin.this.dispose();
					logger.log.info("INFO: Se ha abierto el menu correctamente."); 

					
					
				} else {
					JOptionPane.showMessageDialog(contentPane, "Login incorrecto");
					logger.log.error("ERROR: Error del usuario en el Login");
				}
			}
		});
		btnIniciarSesin.setBounds(208, 273, 187, 35);
		contentPane.add(btnIniciarSesin);
	}


	public void comprobarLogin(String username, String password) {
		ArrayList<Usuario> usuarios = Utilidades.leerUsuarios();
		loginCorrecto = false;
		
		for (Usuario usuario : usuarios) {
			if (usuario.getUsername().equals(username)) {
				if (usuario.getContrasenya().equals(password)) {
					loginCorrecto = true;
					u = usuario;
				}
			}
		}
	}

	public void hacerLogin(String username, String password) {
		HashMap<String, Usuario> usuarios = Utilidades.usuarios();
		if (usuarios.containsKey(username)) {
			if (usuarios.get(username).getContrasenya().equals(password)) {
				loginCorrecto = true;
				u = usuarios.get(username);
			}
		}
	}
}
