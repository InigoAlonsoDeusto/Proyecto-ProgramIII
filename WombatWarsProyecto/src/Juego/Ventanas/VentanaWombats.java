package Juego.Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Juego.Logger.logger;

import javax.swing.JButton;
import javax.swing.JLabel;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaWombats extends JFrame {

	private JPanel contentPane;
	
	public void VentanaWombatsCode() {

	setTitle("Base de Datos");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 817, 569);
	setVisible(true);

	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	contentPane.setLayout(new BorderLayout(0, 0));
	setContentPane(contentPane);
	
    JPanel panel =  new JPanel(); //Estas 3 lineas son para poder meter cosas a nuestra ventana, y de paso ponerla verde
    //panel.setBackground(new Color (0, 0, 0)); //Esto hay que cambiarlo por texturas mas adelante que queda biendefeo
	panel.setLayout(null);
    setContentPane(panel);
		
		JLabel imagen = new JLabel("");
		imagen.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon icono = new ImageIcon("WombatWarsProyecto/res/wombatNormal.jpeg");
		imagen.setIcon(icono);
		imagen.setBounds(10, 35, 370, 450);
		panel.add(imagen);
		
		JButton wombatNormal = new JButton("Wombat Normal");
		wombatNormal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icono = new ImageIcon("WombatWarsProyecto/res/wombatNormal.jpeg");
				imagen.setIcon(icono);
			}
		});
		wombatNormal.setBounds(433, 51, 137, 23);
		panel.add(wombatNormal);
		
		JButton wombatBomba = new JButton("Wombat Bomba");
		wombatBomba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("hola soy aner");
				ImageIcon icono = new ImageIcon("WombatWarsProyecto/res/wombatBomba.jpeg");
				imagen.setIcon(icono);
			}
		});
		wombatBomba.setBounds(617, 51, 137, 23);
		panel.add(wombatBomba);
		
		JButton reyWombat = new JButton("Rey Wombat");
		reyWombat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icono = new ImageIcon("WombatWarsProyecto/res/reyWombat.jpeg");
				imagen.setIcon(icono);
			}
		});
		reyWombat.setBounds(433, 112, 137, 23);
		panel.add(reyWombat);
		
		JButton wombatDiamante = new JButton("Wombat Diamante");
		wombatDiamante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icono = new ImageIcon("WombatWarsProyecto/res/wombatDiamante.jpeg");
				imagen.setIcon(icono);
			}
		});
		wombatDiamante.setBounds(617, 112, 137, 23);
		panel.add(wombatDiamante);
		
		JButton wombatGordo = new JButton("Wombat Gordo");
		wombatGordo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icono = new ImageIcon("WombatWarsProyecto/res/wombatGordo.jpeg");
				imagen.setIcon(icono);
			}
		});
		wombatGordo.setBounds(433, 175, 137, 23);
		panel.add(wombatGordo);
		
		JButton wombatOro = new JButton("Wombat Oro");
		wombatOro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icono = new ImageIcon("WombatWarsProyecto/res/wombatOro.jpeg");
				imagen.setIcon(icono);
			}
		});
		wombatOro.setBounds(617, 175, 137, 23);
		panel.add(wombatOro);
		
		JButton wombatTiempo = new JButton("Wombat Tiempo");
		wombatTiempo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icono = new ImageIcon("WombatWarsProyecto/res/wombatTiempo.jpeg");
				imagen.setIcon(icono);
			}
		});
		wombatTiempo.setBounds(433, 238, 137, 23);
		panel.add(wombatTiempo);
		
		JButton wombatNuke = new JButton("Wombat Nuke");
		wombatNuke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icono = new ImageIcon("WombatWarsProyecto/res/wombatNuke.jpeg");
				imagen.setIcon(icono);
			}
		});
		wombatNuke.setBounds(617, 238, 137, 23);
		panel.add(wombatNuke);

		JButton Volver = new JButton("Volver");
		Volver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				VentanaBD ventana = new VentanaBD();
                logger.log.info("INFO: Se ha abierto la ventana del libro correctamente.");               
                ventana.ventanaBD();


                //nombre de clase           
                dispose();   

			}
		});
		Volver.setBounds(542, 365, 113, 23);
		panel.add(Volver);

	}
}