package Juego;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class menu {

    public static void main(String[] args) {

        X obj = new X();
        
    }
    
}

class X extends JFrame {

    public X() {

        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        

        JButton b = new JButton("Comenzar el juego");
        b.setBounds(0,200,100,100); 


        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("si");


                //new  juego();


                 //nombre de clase    
                 
                 
                dispose();     
            }
        });

        JButton b2 = new JButton("Libro");
        b2.setBounds(0,100,100,100); 


        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("si");


                //Parte de Adrian



                //nombre de clase           
                dispose();     


            }
        });

        JButton b3 = new JButton("Cerrar Sesion");
        b3.setBounds(0,0,100,100); 


        b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("si");




                //parte de Fer



                 //nombre de clase           
                dispose();     


            }
        });


        add(b);
        add(b2);
        add(b3);

    }
    
}
