package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import codigoLogger.GeneracionLogger;

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
    panel.setBackground(new Color (0, 0, 0)); //Esto hay que cambiarlo por texturas mas adelante que queda biendefeo
	panel.setLayout(null);
    setContentPane(panel);
		
		JLabel imagen = new JLabel("");
		imagen.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon icono = new ImageIcon("WombatWarsProyecto/res/wonbatIncognita.png");
		imagen.setIcon(icono);
		imagen.setBounds(10, 35, 370, 450);
		panel.add(imagen);
		//efewf
		JButton wombatNormal = new JButton("Wombat Normal");
		wombatNormal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icono = new ImageIcon("WombatWarsProyecto/res/wonbat.png");
				imagen.setIcon(icono);
			}
		});
		wombatNormal.setBounds(433, 51, 137, 23);
		panel.add(wombatNormal);
		
		JButton wombatBomba = new JButton("Wombat Bomba");
		wombatBomba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icono = new ImageIcon("WombatWarsProyecto/res/wonbatBomba.png");
				imagen.setIcon(icono);
			}
		});
		wombatBomba.setBounds(617, 51, 137, 23);
		panel.add(wombatBomba);
		
		JButton reyWombat = new JButton("Rey Wombat");
		reyWombat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icono = new ImageIcon("WombatWarsProyecto/res/REY.png");
				imagen.setIcon(icono);
			}
		});
		reyWombat.setBounds(433, 112, 137, 23);
		panel.add(reyWombat);
		
		JButton wombatDiamante = new JButton("Wombat Diamante");
		wombatDiamante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icono = new ImageIcon("WombatWarsProyecto/res/wonbatpngdiamantessssss.png");
				imagen.setIcon(icono);
			}
		});
		wombatDiamante.setBounds(617, 112, 137, 23);
		panel.add(wombatDiamante);
		
		JButton wombatGordo = new JButton("Wombat Gordo");
		wombatGordo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icono = new ImageIcon("WombatWarsProyecto/res/wonbatardo.png");
				imagen.setIcon(icono);
			}
		});
		wombatGordo.setBounds(433, 175, 137, 23);
		panel.add(wombatGordo);
		
		JButton wombatOro = new JButton("Wombat Oro");
		wombatOro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icono = new ImageIcon("WombatWarsProyecto/res/ELOROS.png");
				imagen.setIcon(icono);
			}
		});
		wombatOro.setBounds(617, 175, 137, 23);
		panel.add(wombatOro);
		
		JButton wombatTiempo = new JButton("Wombat Tiempo");
		wombatTiempo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icono = new ImageIcon("WombatWarsProyecto/res/tiempo.png");
				imagen.setIcon(icono);
			}
		});
		wombatTiempo.setBounds(433, 238, 137, 23);
		panel.add(wombatTiempo);
		
		JButton wombatNuke = new JButton("Wombat Nuke");
		wombatNuke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icono = new ImageIcon("WombatWarsProyecto/res/nukeswonbat.png");
				imagen.setIcon(icono);
			}
		});
		wombatNuke.setBounds(617, 238, 137, 23);
		panel.add(wombatNuke);

		JButton Volver = new JButton("Volver");
		Volver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				VentanaBD ventana = new VentanaBD();
                GeneracionLogger.log.info("INFO: Se ha abierto la ventana del libro correctamente.");               
                ventana.ventanaBD();

//holaaaaaaaaa
                //nombre de clase           
                dispose();   

			}
		});
		Volver.setBounds(542, 365, 113, 23);
		panel.add(Volver);

		
		
		    JLabel biblio = new JLabel("");
			ImageIcon biblio1 = new ImageIcon("WombatWarsProyecto/res/madera.jpg");
			biblio.setIcon(biblio1);
			biblio.setBounds(0, 0,817,569);
			panel.add(biblio);
	}
}