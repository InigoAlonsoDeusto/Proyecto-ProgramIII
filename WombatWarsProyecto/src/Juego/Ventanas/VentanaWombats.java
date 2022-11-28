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

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200,650);
        setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel imagen = new JLabel("");
		imagen.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon icono = new ImageIcon("WombatWarsProyecto/res/wombatNormal.jpeg");
		imagen.setIcon(icono);
		imagen.setBounds(0, 0, 378, 450);
		contentPane.add(imagen);
		
		JButton wombatNormal = new JButton("Wombat Normal");
		wombatNormal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icono = new ImageIcon("WombatWarsProyecto/res/wombatNormal.jpeg");
				imagen.setIcon(icono);
			}
		});
		wombatNormal.setBounds(600, 10, 60, 25);
		contentPane.add(wombatNormal);
		
		JButton wombatBomba = new JButton("Wombat Bomba");
		wombatBomba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("hola soy aner");
				ImageIcon icono = new ImageIcon("WombatWarsProyecto/res/wombatBomba.jpeg");
				imagen.setIcon(icono);
			}
		});
		wombatBomba.setBounds(600, 40, 60, 25);
		contentPane.add(wombatBomba);
		
		JButton reyWombat = new JButton("Rey Wombat");
		reyWombat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icono = new ImageIcon("WombatWarsProyecto/res/reyWombat.jpeg");
				imagen.setIcon(icono);
			}
		});
		reyWombat.setBounds(600, 70, 60, 25);
		contentPane.add(reyWombat);
		
		JButton wombatDiamante = new JButton("Wombat Diamante");
		wombatDiamante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icono = new ImageIcon("WombatWarsProyecto/res/wombatDiamante.jpeg");
				imagen.setIcon(icono);
			}
		});
		wombatDiamante.setBounds(600, 100, 60, 25);
		contentPane.add(wombatDiamante);
		
		JButton wombatGordo = new JButton("Wombat Gordo");
		wombatGordo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icono = new ImageIcon("WombatWarsProyecto/res/wombatGordo.jpeg");
				imagen.setIcon(icono);
			}
		});
		wombatGordo.setBounds(600, 130, 60, 25);
		contentPane.add(wombatGordo);
		
		JButton wombatOro = new JButton("Wombat Oro");
		wombatOro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icono = new ImageIcon("WombatWarsProyecto/res/wombatOro.jpeg");
				imagen.setIcon(icono);
			}
		});
		wombatOro.setBounds(600, 160, 60, 25);
		contentPane.add(wombatOro);
		
		JButton wombatTiempo = new JButton("Wombat Tiempo");
		wombatTiempo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icono = new ImageIcon("WombatWarsProyecto/res/wombatTiempo.jpeg");
				imagen.setIcon(icono);
			}
		});
		wombatTiempo.setBounds(600, 190, 60, 25);
		contentPane.add(wombatTiempo);
		
		JButton wombatNuke = new JButton("Wombat Nuke");
		wombatNuke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icono = new ImageIcon("WombatWarsProyecto/res/wombatNuke.jpeg");
				imagen.setIcon(icono);
			}
		});
		wombatNuke.setBounds(600, 210, 60, 25);
		contentPane.add(wombatNuke);

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
		Volver.setBounds(600, 240, 60, 25);
		contentPane.add(Volver);

	}
}