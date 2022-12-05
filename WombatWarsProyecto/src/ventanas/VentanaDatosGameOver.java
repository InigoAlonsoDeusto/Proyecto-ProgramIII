package ventanas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import codigoLogger.GeneracionLogger;
import fasesDeJuego.GameOver;
import recursosBaseDeDatos.UtilidadResize;
import recursosBaseDeDatos.InputBaseDatos;

public class VentanaDatosGameOver extends JFrame {

    private JPanel contentPane;
	
	public void VentanaDatosGameOverCode() {
		
	setTitle("Datos Final Partida");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(1200,650);
	setVisible(true);


	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);

    JPanel panel =  new JPanel();
    panel.setLayout(null);
    setContentPane(panel);

    JTable datosPartida = new JTable();
    datosPartida.setBounds(100, 100, 1000, 300);
    panel.add(datosPartida);

    

    InputBaseDatos con = new InputBaseDatos();
    Connection conexion = con.conectar();

    Statement st;

    String sql = "SELECT * from puntuaciones";

    DefaultTableModel model = new DefaultTableModel();

    model.addColumn("nombre");
    model.addColumn("fecha");
    model.addColumn("puntuacion");

    datosPartida.setModel(model);

    

    String[] datosTabla = new String[3];
    String[] titulosTabla = {"Nombre", "Fecha", "Puntuacion"};

    model.addRow(titulosTabla);
/*
    datosTabla[0] = GameOver.nombre; 
    datosTabla[1] = null;
    datosTabla[2] = null;

    model.addRow(datosTabla);
*/
    try {
    	
    	GeneracionLogger.log.info("INFO: Se han añadido los datos de la ultima partida correctamente."); 
        st = conexion.createStatement();

        ResultSet result = st.executeQuery(sql);

        while(result.next()) {
            datosTabla[0] = result.getString(1); //En la posicion 0 de Datos[] meterá los datos de la columna 1 de la tabla puntuaciones("nombre")
            datosTabla[1] = result.getString(2);
            datosTabla[2] = result.getString(3);
            

            model.addRow(datosTabla);

            UtilidadResize.resizeColumnWidth(datosPartida);


        }
        
     } catch (Exception e) {
        e.printStackTrace();
        GeneracionLogger.log.error("ERROR: Ha habido un error al cargar las tablas de la BD");
     }



    

    

}


}