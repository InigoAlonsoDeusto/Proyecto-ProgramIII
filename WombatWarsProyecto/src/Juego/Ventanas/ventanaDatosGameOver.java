package Juego.Ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ventanaDatosGameOver extends JFrame {

    private JPanel contentPane;
	
	public void VentanaDatosGameOverCode() {
    
	setTitle("Datos Final Partida");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 817, 569);
	setVisible(true);


	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);

    JPanel panel =  new JPanel();
    panel.setLayout(null);
    setContentPane(panel);

    JTable datosPartida = new JTable();
    datosPartida.setBounds(100, 100, 1000, 142);
    panel.add(datosPartida);

    DefaultTableModel model = new DefaultTableModel();

    model.addColumn("nombre");
    model.addColumn("fecha");
    model.addColumn("puntuacion");

    datosPartida.setModel(model);

    String[] datosTabla = new String[3];
    String[] titulosTabla = {"Nombre", "Fecha", "Puntuacion"};

    model.addRow(titulosTabla);

    String s = Integer.toString(GameOver.puntuacionfinal);

    datosTabla[1] = VentanaLogin.textField.getText();
    datosTabla[2] = null;
    datosTabla[3] = s;

    model.addRow(datosTabla);


    }
}