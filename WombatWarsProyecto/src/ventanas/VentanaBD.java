package ventanas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import javax.swing.table.DefaultTableModel;

import codigoLogger.GeneracionLogger;
import metodosRecursivos.WombatsRegistradosEnBD;
import recursosBaseDeDatos.UtilidadResize;
import recursosBaseDeDatos.InputBaseDatos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;



public class VentanaBD extends JFrame {

	private JPanel contentPane;


    public void ventanaBD() {

    setTitle("Base de Datos");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(1200,650);
	setVisible(true);

	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(new BorderLayout(0, 0));
	
    JPanel panel =  new JPanel(); //Estas 3 lineas son para poder meter cosas a nuestra ventana, y de paso ponerla verde
    //panel.setBackground(new Color (0, 0, 0)); //Esto hay que cambiarlo por texturas mas adelante que queda biendefeo
    panel.setLayout(null);
    setContentPane(panel);
	
    JTable table = new JTable();
    table.setBounds(100, 100, 1000, 142);
    panel.add(table);

    JButton btnWombats = new JButton("VER WOMBATS");
    btnWombats.setBounds(450, 250, 300, 25);
	panel.add(btnWombats);

    JTable table2 = new JTable();
    table2.setBounds(100, 300, 1000, 50);
    panel.add(table2);


    JButton btnVolver = new JButton("VOLVER");
    btnVolver.setBounds(450, 360, 300, 25);
	panel.add(btnVolver);

    btnVolver.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

            Menu men = new Menu();
            men.X();

            VentanaBD.this.setVisible(false);
            VentanaBD.this.dispose();
            GeneracionLogger.log.info("INFO: Se ha abierto el menu correctamente."); 

        }

    });

    btnWombats.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

            VentanaWombats wombats = new VentanaWombats();
            wombats.VentanaWombatsCode();
            
            System.out.println("Imprimiendo los tipos de Wombats que nos podemos encontrar:");
            String[] listaWombats = {"wombatNormal", "wombatGordo", "wombatOro", "wombatDiamante", "wombatTiempo", "wombatBomba", "wombatNuke", "reyWombat"};
            WombatsRegistradosEnBD.mostrarDatosWombat(listaWombats, 0);
            
            
            VentanaBD.this.setVisible(false);
            VentanaBD.this.dispose();
            GeneracionLogger.log.info("INFO: Se ha abierto la ventana Wombats correctamente."); 

        }

    });

    InputBaseDatos con = new InputBaseDatos();
    Connection conexion = con.conectar();

    String sqlWombat = "SELECT * FROM wombat";

    Statement st;
    
    DefaultTableModel model = new DefaultTableModel();

    model.addColumn("nombre");
	model.addColumn("corazones");
    model.addColumn("monedas");
    model.addColumn("descripcion");

    table.setModel(model);

    String[] titulosWombat = {"Nombre", "Corazones", "Monedas", "Descripcion"};
    String[] datosWombat = new String[4]; //4 porque tenemos 4 columnas en la tabla (del 0 al 3).

    model.addRow(titulosWombat);

     try {
        st = conexion.createStatement();

        ResultSet result = st.executeQuery(sqlWombat);

        while(result.next()) {
            datosWombat[0] = result.getString(1); //En la posicion 0 de Datos[] meterá los datos de la columna 1 de la tabla wombat("nombre")
            datosWombat[1] = result.getString(2);
            datosWombat[2] = result.getString(3);
            datosWombat[3] = result.getString(4);

            model.addRow(datosWombat);

            UtilidadResize.resizeColumnWidth(table);


        }
        
     } catch (Exception e) {
        e.printStackTrace();
        GeneracionLogger.log.error("ERROR: Ha habido un error al cargar las tablas de la BD");
     }

    
    
     DefaultTableModel modelo2 = new DefaultTableModel();

     modelo2.addColumn("personaje");
     modelo2.addColumn("corazones");
     modelo2.addColumn("descripcion");
 
     table2.setModel(modelo2);

     String[] titulosPersonajes = {"Personaje", "Corazones", "Descripcion"};
     String[] datosPersonajes = new String[3];

     String sqlPersonajes = "SELECT * FROM personajes";

     modelo2.addRow(titulosPersonajes);

     try {
        st = conexion.createStatement();

        ResultSet result = st.executeQuery(sqlPersonajes);

        while(result.next()) {
            datosPersonajes[0] = result.getString(1); //En la posicion 0 de Datos[] meterá los datos de la columna 1 de la tabla Personajes("personaje")
            datosPersonajes[1] = result.getString(2);
            datosPersonajes[2] = result.getString(3);
            

            modelo2.addRow(datosPersonajes);

            UtilidadResize.resizeColumnWidth(table2);

        }
    } catch (Exception e) {
        e.printStackTrace();
        GeneracionLogger.log.error("ERROR: Ha habido un error al cargar las tablas de la BD");
    } 

    }


   

}


    


