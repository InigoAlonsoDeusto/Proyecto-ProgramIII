package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import codigoLogger.GeneracionLogger;
import ventanasNiveles.Nivel1;

import javax.swing.JLabel;
import javax.swing.JButton;

public class VentanaCreacionNivel extends JFrame {
	public VentanaCreacionNivel() {
	}

	private JPanel contentPane;
	
	public void VentanaCreacionNivelCode() {
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,325);
        setVisible(true);
        
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Indique el nombre de su nivel:");
		lblNombre.setBounds(10, 10, 270, 29);
		getContentPane().add(lblNombre);
		
		JTextField txtNombre = new JTextField();
		txtNombre.setBounds(285, 10, 200, 29);
		getContentPane().add(txtNombre);
		
		
		JLabel lblAgujeros = new JLabel("Indique el numero de agujeros que desee:");
		lblAgujeros.setBounds(10, 80, 270, 29);
		getContentPane().add(lblAgujeros);
		
		JTextField txtAgujeros = new JTextField();
		txtAgujeros.setBounds(285, 80, 200, 29);
		getContentPane().add(txtAgujeros);
		
		
		JLabel lblTiempo = new JLabel("Indique el tiempo que durarar este nivel:");
		lblTiempo.setBounds(10, 150, 270, 29);
		getContentPane().add(lblTiempo);
		
		JTextField txtTiempo = new JTextField();
		txtTiempo.setBounds(285, 150, 200, 29);
		getContentPane().add(txtTiempo);
		
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setBounds(102, 229, 110, 23);
		getContentPane().add(btnGuardar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				VentanaNiveles ventanaNivel = new VentanaNiveles();
				ventanaNivel.VentanaNivelesCode();

			    VentanaCreacionNivel.this.setVisible(false);
			    VentanaCreacionNivel.this.dispose();
				GeneracionLogger.log.info("INFO: Se ha abierto el menu correctamente."); 
			}
		});
		btnVolver.setBounds(258, 229, 110, 23);
		getContentPane().add(btnVolver);
	}

}
