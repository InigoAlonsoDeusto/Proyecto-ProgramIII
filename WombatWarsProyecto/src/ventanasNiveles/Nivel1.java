package ventanasNiveles;


import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import codigoLogger.GeneracionLogger;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import fasesDeJuego.Inicio;
import utilidadesJuego.Limpiador;
import ventanas.Menu;
import ventanas.VentanaTienda;

import java.awt.FlowLayout;


public class Nivel1 extends JFrame {
     private JPanel panel;
     public static JLabel[] agujeros = new JLabel[9];
     public static Border borde = BorderFactory.createLineBorder(new Color (0, 100, 0), 5); //temporal para marcar los agujeros mientras no tengamos imagenes
     public static Border borde2 = BorderFactory.createLineBorder(new Color (100, 0, 0), 5); //temporal para marcar los agujeros mientras no tengamos imagenes

     public static JLabel lblPuntuacion;
     public static JLabel lblTiempoRestante;
     public static JLabel lblPuntuacionMaxima;
     public static JLabel fondo;

     public static int puntuacionMaxima = 0;

     public static int[] agujeroConWombat = new int[9]; //Array que va a representar el estado del agujero
                                                  //Si int=1 el wombat se verá, si int=0 no.
     public static int puntuacion = 0; //empezamos con una puntuacion de 0 en un inicio

     public static int acomulado = puntuacion; //empezamos con un acomulado de 0

    public void WombatWarsMainCode(){ //aqui juntamos estos tres metodos que serian la base del juego

        setTitle("Nivel1"); //Las siguientes 4 lineas determinan algunas caracteristicas de la ventana emergente; su nombre, tamaño y su manera de cerrarse.
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1200, 650);
        setVisible(true);

        juego();
        Limpiador.limpiarCode();
        Inicio.InicioCode();

    }

    public void juego() {

    	
    	
    	

        JPanel PanelWW =  new JPanel(); //Estas 3 lineas son para poder meter cosas a nuestra ventana, y de paso ponerla verde
        PanelWW.setBackground(new Color (0, 100, 0)); //Esto hay que cambiarlo por texturas mas adelante que queda biendefeo
        PanelWW.setLayout(null);
        setContentPane(PanelWW);
        
     
        

        panel = new JPanel(); //JPanel dentro de JPanel especifico para las cajas de las que podran salir los wombats
        panel.setOpaque(true);
        panel.setBackground(new Color(0,0,0,0));
        //panel.setBackground(new Color(0, 50, 0));
        panel.setBounds(0, 200, 1200, 450);
        panel.setLayout(null);
        PanelWW.add(panel);

        
        JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Menu menu = new Menu();
				menu.MenuCode();

			    Nivel1.this.setVisible(false);
			    Nivel1.this.dispose();
				GeneracionLogger.log.info("INFO: Se ha abierto el menu correctamente."); 
			}
		});
		
		btnVolver.setBounds(150, 375, 89, 23);
		panel.add(btnVolver);
        lblPuntuacion = new JLabel ("Puntuacion: 0"); //Implementamos JLabel para mostrar la puntuacion del jugador a lo largo de la partida
        lblPuntuacion.setHorizontalAlignment(SwingConstants.TRAILING); //TRAILING para que se ajuste al texto
        lblPuntuacion.setForeground(new Color(0, 0, 0));
        lblPuntuacion.setBounds(410, 54, 144, 33);
        PanelWW.add(lblPuntuacion);

        lblTiempoRestante = new JLabel("10"); //Implementamos JLabel para indicar el tiempo restante
        lblTiempoRestante.setHorizontalAlignment(SwingConstants.CENTER);
        lblTiempoRestante.setForeground(new Color(240, 128, 128));
        lblTiempoRestante.setBounds(800, 54, 144, 33);
        PanelWW.add(lblTiempoRestante);
        
        
        agujeros[0] = new JLabel(); //A continuacion los Jlabels de las cajas de las que podran salir los wombats, falta poner imagenes como en el fondo
        agujeros[0].setBorder(borde);
        agujeros[0].setName("0");
        agujeros[0].setBounds(300, 25, 100,100);
        panel.add(agujeros[0]);
        
        JLabel agujero0 = new JLabel("");
		agujero0.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon iconoAgujero0 = new ImageIcon("WombatWarsProyecto/res/hoyo.png");
		agujero0.setIcon(iconoAgujero0);
		agujero0.setBounds(300, 43, 100, 100);
		panel.add(agujero0);

		
        agujeros[1] = new JLabel();
        agujeros[1].setBorder(borde);
        agujeros[1].setName("1");
        agujeros[1].setBounds(600, 25,100,100);
        panel.add(agujeros[1]);

        JLabel wombat1 = new JLabel("");
        wombat1.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon iconoWombat1 = new ImageIcon("WombatWarsProyecto/res/agujeroVacioPNG.pngv");
		wombat1.setIcon(iconoWombat1);
		wombat1.setBounds(600, 43,100,100);
		panel.add(wombat1);
        
        JLabel agujero1 = new JLabel("");
		agujero1.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon iconoAgujero1 = new ImageIcon("WombatWarsProyecto/res/agujeroVacioPNG.png");
		agujero1.setIcon(iconoAgujero1);
		agujero1.setBounds(600, 43,100,100);
		panel.add(agujero1);
		
        
        agujeros[2] = new JLabel();
        agujeros[2].setBorder(borde);
        agujeros[2].setName("2");
        agujeros[2].setBounds(900, 25,100,100);
        panel.add(agujeros[2]);
        
		JLabel agujero2 = new JLabel("");
		agujero2.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon iconoAgujero2 = new ImageIcon("WombatWarsProyecto/res/agujeroVacioPNG.png");
		agujero2.setIcon(iconoAgujero2);
		agujero2.setBounds(900, 43,100,100);
		panel.add(agujero2);
		

        agujeros[3] = new JLabel();
        agujeros[3].setBorder(borde);
        agujeros[3].setName("3");
        agujeros[3].setBounds(300, 150,100,100);
        panel.add(agujeros[3]);
        
		JLabel agujero3 = new JLabel("");
		agujero3.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon iconoAgujero3 = new ImageIcon("WombatWarsProyecto/res/agujeroVacioPNG.png");
		agujero3.setIcon(iconoAgujero3);
		agujero3.setBounds(300, 168, 100, 100);
		panel.add(agujero3);
        

        agujeros[4] = new JLabel();
        agujeros[4].setBorder(borde);
        agujeros[4].setName("4");
        agujeros[4].setBounds(600, 150,100,100);
        panel.add(agujeros[4]);
        
		JLabel agujero4 = new JLabel("");
		agujero4.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon iconoAgujero4 = new ImageIcon("WombatWarsProyecto/res/agujeroVacioPNG.png");
		agujero4.setIcon(iconoAgujero4);
		agujero4.setBounds(600, 168,100,100);
		panel.add(agujero4);
        

        agujeros[5] = new JLabel();
        agujeros[5].setBorder(borde);
        agujeros[5].setName("5");
        agujeros[5].setBounds(900, 150,100,100);
        panel.add(agujeros[5]);
        
		JLabel agujero5 = new JLabel("");
		agujero5.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon iconoAgujero5 = new ImageIcon("WombatWarsProyecto/res/agujeroVacioPNG.png");
		agujero5.setIcon(iconoAgujero5);
		agujero5.setBounds(900, 168,100,100);
		panel.add(agujero5);
        

        agujeros[6] = new JLabel();
        agujeros[6].setBorder(borde);
        agujeros[6].setName("6");
        agujeros[6].setBounds(300, 275,100,100);
        panel.add(agujeros[6]);
        
        JLabel agujero6 = new JLabel("");
		agujero6.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon iconoAgujero6 = new ImageIcon("WombatWarsProyecto/res/agujeroVacioPNG.png");
		agujero6.setIcon(iconoAgujero6);
		agujero6.setBounds(300, 293, 100, 100);
		panel.add(agujero6);
        

        agujeros[7] = new JLabel();
        agujeros[7].setBorder(borde);
        agujeros[7].setName("7");
        agujeros[7].setBounds(600, 275,100,100);
        panel.add(agujeros[7]);
        
		JLabel agujero7 = new JLabel("");
		agujero7.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon iconoAgujero7 = new ImageIcon("WombatWarsProyecto/res/agujeroVacioPNG.png");
		agujero7.setIcon(iconoAgujero7);
		agujero7.setBounds(600, 293,100,100);
		panel.add(agujero7);
		

        agujeros[8] = new JLabel();
        agujeros[8].setBorder(borde);
        agujeros[8].setName("8");
        agujeros[8].setBounds(900, 275,100,100);
        panel.add(agujeros[8]);
        
        JLabel agujero8 = new JLabel("");
		agujero8.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon iconoAgujero8 = new ImageIcon("WombatWarsProyecto/res/agujeroVacioPNG.png");
		agujero8.setIcon(iconoAgujero8);
		agujero8.setBounds(900, 293,100,100);
		panel.add(agujero8);

        for(int i = 0; i < 9; i++) {
            agujeros[i].setBorder(borde);
            agujeroConWombat[i] = 0; //Inicializamos todos los agujeros a 0 para que no haya ningun wombat visible.
        }
        
        JLabel coras = new JLabel("");
		ImageIcon coras1 = new ImageIcon("WombatWarsProyecto/res/CORASLLENOS.png");
		coras.setIcon(coras1);
		coras.setBounds(420, -70, 200, 400);
		PanelWW.add(coras);

		JLabel cartel = new JLabel("");
		ImageIcon cartel1 = new ImageIcon("WombatWarsProyecto/res/cartel.png");
		cartel.setIcon(cartel1);
		cartel.setBounds(410, -195,1200,600);
		PanelWW.add(cartel);
        
        
        JLabel fondo = new JLabel("");
		ImageIcon fondo1 = new ImageIcon("WombatWarsProyecto/res/verde.png");
		fondo.setIcon(fondo1);
		fondo.setBounds(0, 0,1200,650);
		PanelWW.add(fondo);
		
        
    }
}
