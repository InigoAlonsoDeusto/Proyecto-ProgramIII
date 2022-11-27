package Juego.VentanasLogIn;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Juego.Logger.logger;
import Juego.Utilidades.Usuario;
import Juego.Utilidades.Utilidades;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Registrarse extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public Registrarse() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		

		JLabel lblNombreDeUsuario = new JLabel("Nombre de usuario: ");
		lblNombreDeUsuario.setBounds(69, 112, 193, 26);
		contentPane.add(lblNombreDeUsuario);

		textField = new JTextField();
		textField.setBounds(373, 109, 186, 32);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblContrasea = new JLabel("Contrase�a: ");
		lblContrasea.setBounds(69, 195, 193, 26);
		contentPane.add(lblContrasea);

		textField_1 = new JTextField();
		textField_1.setBounds(373, 192, 186, 32);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JButton btnRegistrarNuevoUsuario = new JButton("Registrar nuevo usuario");
		btnRegistrarNuevoUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!textField.getText().equals("") && !textField_1.getText().equals("")) {
					ArrayList<Usuario> usuarios = Utilidades.leerUsuarios();
					usuarios.add(new Usuario(textField.getText(), textField_1.getText()));

					Utilidades.escribirUsuarios(usuarios);
				
					logger.log.info("INFO: Se ha registrado un nuevo usuario");

					Registrarse.this.setVisible(false);
					Registrarse.this.dispose();

				} else {
					JOptionPane.showMessageDialog(Registrarse.this, "Por favor, rellene todos los campos");
					logger.log.error("ERROR: El usuario no ha rellenado todos los campos del registro.");
				}
			}
		});
		btnRegistrarNuevoUsuario.setBounds(197, 287, 237, 35);
		contentPane.add(btnRegistrarNuevoUsuario);
	}

}
