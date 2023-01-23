package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import codigoLogger.GeneracionLogger;
import ventanasNiveles.Nivel1;

import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class VentanaNiveles extends JFrame {

	private JPanel contentPane;

	public void VentanaNivelesCode() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,325);
        setVisible(true);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 211, 241);
		contentPane.add(scrollPane);
		
		JButton bCrearNivel = new JButton("CREAR NIVEL");
		bCrearNivel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				VentanaCreacionNivel crear = new VentanaCreacionNivel();
				crear.VentanaCreacionNivelCode();

			    VentanaNiveles.this.setVisible(false);
			    VentanaNiveles.this.dispose();
				GeneracionLogger.log.info("INFO: Se ha abierto la ventana de creacion de niveles correctamente."); 
			}
		});
		bCrearNivel.setBounds(279, 97, 150, 23);
		contentPane.add(bCrearNivel);
		
		JButton bJugar = new JButton("JUGAR");
		bJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Nivel1 nivel1 = new Nivel1();
				nivel1.WombatWarsMainCode();

			    VentanaNiveles.this.setVisible(false);
			    VentanaNiveles.this.dispose();
				GeneracionLogger.log.info("INFO: Se ha abierto el juego correctamente."); 
			}
		});
		bJugar.setBounds(279, 148, 150, 23);
		contentPane.add(bJugar);
		
		JButton bVolver = new JButton("VOLVER");
		bVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Menu menu = new Menu();
				menu.MenuCode();

			    VentanaNiveles.this.setVisible(false);
			    VentanaNiveles.this.dispose();
				GeneracionLogger.log.info("INFO: Se ha abierto el menu correctamente."); 
			}
		});
		bVolver.setBounds(279, 199, 150, 23);
		contentPane.add(bVolver);
		
		JLabel lblNewLabel = new JLabel("¡Bienvenido al selector de niveles!");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(231, 11, 195, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblAquiPodrasEscoger = new JLabel("Aqui podras escoger el nivel que ");
		lblAquiPodrasEscoger.setVerticalAlignment(SwingConstants.TOP);
		lblAquiPodrasEscoger.setBounds(231, 36, 205, 14);
		contentPane.add(lblAquiPodrasEscoger);
		
		JLabel lblQuierasJugarO = new JLabel("quieras jugar o crear tu propio nivel.");
		lblQuierasJugarO.setVerticalAlignment(SwingConstants.TOP);
		lblQuierasJugarO.setBounds(231, 45, 205, 23);
		contentPane.add(lblQuierasJugarO);
	}

}
