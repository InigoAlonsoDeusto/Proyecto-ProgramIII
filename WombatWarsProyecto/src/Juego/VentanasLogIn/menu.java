package Juego.VentanasLogIn;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Juego.Launcher.WombatWarsMain;
import Juego.VentanasLogIn.VentanaTienda;

public class menu extends JFrame{

    public void X() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200,650);
        setVisible(true);


        JPanel PanelMenu =  new JPanel(); //Estas 3 lineas son para poder meter cosas a nuestra ventana, y de paso ponerla verde
        PanelMenu.setBackground(new Color (0, 100, 0)); //Esto hay que cambiarlo por texturas mas adelante que queda biendefeo
        PanelMenu.setLayout(null);
        setContentPane(PanelMenu);

        JLabel lblTitulo = new JLabel ("WOMBAT WARS"); //Implementamos JLabel para mostrar la puntuacion del jugador a lo largo de la partida
        //lblTitulo.setForeground(new Color(135, 206, 250));
        lblTitulo.setFont(new Font("Serif", Font.BOLD, 45));
        lblTitulo.setAlignmentX(CENTER_ALIGNMENT);
        lblTitulo.setBounds(410, 54, 400, 200);
        PanelMenu.add(lblTitulo);

        

        JButton b = new JButton("Comenzar el juego");
        b.setBounds(100,250,300,100); 
        add(b);


        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("si");


                WombatWarsMain partida = new WombatWarsMain(); 
                partida.WombatWarsMainCode();                
                dispose();     
            }
        });

        JButton b2 = new JButton("Libro");
        b2.setBounds(450,250,300,100); 
        add(b2);


        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("si");


                //Parte de Adrian



                //nombre de clase           
                dispose();     


            }
        });

        JButton b3 = new JButton("Tienda");
        b3.setBounds(800,250,300,100); 
        add(b3);


        b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                
                System.out.println("si");

                VentanaTienda Tienda = new VentanaTienda();
                VentanaTienda()

                  
                dispose();     


            }
        });

        JButton b4 = new JButton("Cerrar Sesion");
        b4.setBounds(500,400,200,70); 
        add(b4);


        b4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {


                VentanaLogin Login = new VentanaLogin();     
                Login.Login();

                dispose();     


            }
        });

    }
    
}

