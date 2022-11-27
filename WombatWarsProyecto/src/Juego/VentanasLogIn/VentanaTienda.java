package Juego.VentanasLogIn;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame; 
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Juego.Utilidades.Usuario;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VentanaTienda extends JFrame {

	private JPanel contentPane;
	private Usuario u;
	private menu m;


	public void VentanaTiendaCode() {
		
		setTitle("Tienda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JScrollPane scrollPaneAccesorios = new JScrollPane();
		scrollPaneAccesorios.setBounds(10, 36, 406, 178);
		panel.add(scrollPaneAccesorios);
		
		JButton btnComprar = new JButton("COMPRAR");
		btnComprar.setBounds(168, 219, 99, 23);
		panel.add(btnComprar);
		
		JButton btnVerMas = new JButton("VER M\u00C1S");
		btnVerMas.setBounds(45, 219, 89, 23);
		panel.add(btnVerMas);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				menu men = new menu();
				men.X();

			    VentanaTienda.this.setVisible(false);
			    VentanaTienda.this.dispose();
			}
		});
		
		btnVolver.setBounds(297, 219, 89, 23);
		panel.add(btnVolver);
		
		JLabel lblBienvenida = new JLabel("Bienvenido! Elige bien los accesorios que necesitaras");
		lblBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenida.setVerticalAlignment(SwingConstants.BOTTOM);
		lblBienvenida.setBounds(10, -11, 406, 25);
		panel.add(lblBienvenida);
		
		JLabel lblBienvenida2 = new JLabel("en tu siguiente enfrentamiento contra estos roedores!");
		lblBienvenida2.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenida2.setBounds(10, 11, 406, 25);
		panel.add(lblBienvenida2);
	}
}
