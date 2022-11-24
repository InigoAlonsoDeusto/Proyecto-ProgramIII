package Juego;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;

import java.util.Random;
import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;



public class WombatWarsMain extends JFrame {

     private JPanel panel;
     private JLabel[] agujeros = new JLabel[9];
     Border borde = BorderFactory.createLineBorder(new Color (0, 100, 0), 5); //temporal para marcar los agujeros mientras no tengamos imagenes

     Border borde2 = BorderFactory.createLineBorder(new Color (100, 0, 0), 5); //temporal para marcar los agujeros mientras no tengamos imagenes

     private JLabel lblPuntuacion;
     private JLabel lblTiempoRestante;
     private JLabel lblPuntuacionMaxima;

     private int tiempoRestante = 60;
     private int puntuacionMaxima = 0;

     private JButton btnEmpezar;
     private Timer temporizador;

     private int[] agujeroConWombat = new int[9]; //Array que va a representar el estado del agujero
                                                  //Si int=1 el wombat se verá, si int=0 no.
     public int puntuacion = 0; //empezamos con una puntuacion de 0 en un inicio

     private void gameOver() { //generamos el gameover para cuando finalice la partida y para que nos muestre la puntuacion obtenida
        btnEmpezar.setEnabled(true); //tambien reiniciaremos las variables (tiempo, puntuacion y sus labels) a su estado inicial
        
        if(puntuacion > puntuacionMaxima) {
            puntuacionMaxima = puntuacion;
            lblPuntuacionMaxima.setText("" +puntuacionMaxima);
            JOptionPane.showMessageDialog(this, "Tu puntuacion final es: " +puntuacionMaxima);
        } else {
            JOptionPane.showMessageDialog(this, "Tu puntuacion final es: " +puntuacion);
        }
        puntuacion = 0;
        tiempoRestante = 60;
        lblPuntuacion.setText("Puntuacion: 0");
        lblTiempoRestante.setText("60");
        limpiar();
    }

     private void presionarBoton(int id){ //con este metodo primero comprueba si el agujero que tocamos es un wombat o un agujero vacio, si es un wonbat se le sumara un punto a la puntiacion y si es una agujero se le restara un punto.Despues actualizaria el contador de puntuacion limpiaria el tablero y generaria otro wonbat aleatorio
        int valor = agujeroConWombat[id];

        if (valor==1){
            puntuacion++;
        }else{ 
            valor=0;
            puntuacion--;
        }
        lblPuntuacion.setText("Score:"+ puntuacion);
        limpiar();
        randomWombat();
     }

     private void iniciarEventos(){ //para cada agujero o wombat le asignamos un click event para detectar que hemos hecho click y donde hemos clicado
        for( int i = 0; i<agujeros.length;i++ ){
            agujeros[i].addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){
                    JLabel lbl = (JLabel)e.getSource();
                    int id = Integer.parseInt(lbl.getName());
                    presionarBoton(id);
                }
            });
        }

        btnEmpezar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnEmpezar.setEnabled(false);
                limpiar();
                //temporizador.start();
                randomWombat();
            }
        });

        //El temporizador lo tendremos en la siguiente entrega, pero ahora mismo no sabemos implementarlo bien
        
         /* temporizador = new Timer(1000, new ActionListener() { //creamos el temporizador para que cuente los 60 segundos que dura una partida
            public void actionPerformed(ActionEvent evt) {
                if(tiempoRestante == 0) {
                    lblTiempoRestante.setText("" + tiempoRestante);
                    temporizador.stop();
                    gameOver();
                }else {
                    lblTiempoRestante.setText("" + tiempoRestante);
                    tiempoRestante--;
                }
            }
        } ); */
     }

    private void juego() {
        setTitle("WombatWars"); //Las siguientes 4 lineas determinan algunas caracteristicas de la ventana emergente; su nombre, tamaño y su manera de cerrarse.
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1200, 650);

        JPanel PanelWW =  new JPanel(); //Estas 3 lineas son para poder meter cosas a nuestra ventana, y de paso ponerla verde
        PanelWW.setBackground(new Color (0, 100, 0)); //Esto hay que cambiarlo por texturas mas adelante que queda biendefeo
        PanelWW.setLayout(null);
        setContentPane(PanelWW);

        panel = new JPanel(); //JPanel dentro de JPanel especifico para las cajas de las que podran salir los wombats
        panel.setBackground(new Color(0, 50, 0));
        panel.setBounds(0, 200, 1200, 450);
        panel.setLayout(null);
        PanelWW.add(panel);

        agujeros[0] = new JLabel("0"); //A continuacion los Jlabels de las cajas de las que podran salir los wombats, falta poner imagenes como en el fondo
        agujeros[0].setBorder(borde);
        agujeros[0].setName("0");
        agujeros[0].setBounds(300, 25, 100,100);
        panel.add(agujeros[0]);

        agujeros[1] = new JLabel("1");
        agujeros[1].setBorder(borde);
        agujeros[1].setName("1");
        agujeros[1].setBounds(600, 25,100,100);
        panel.add(agujeros[1]);

        agujeros[2] = new JLabel("2");
        agujeros[2].setBorder(borde);
        agujeros[2].setName("2");
        agujeros[2].setBounds(900, 25,100,100);
        panel.add(agujeros[2]);

        agujeros[3] = new JLabel("3");
        agujeros[3].setBorder(borde);
        agujeros[3].setName("3");
        agujeros[3].setBounds(300, 150,100,100);
        panel.add(agujeros[3]);

        agujeros[4] = new JLabel("4");
        agujeros[4].setBorder(borde);
        agujeros[4].setName("4");
        agujeros[4].setBounds(600, 150,100,100);
        panel.add(agujeros[4]);

        agujeros[5] = new JLabel("5");
        agujeros[5].setBorder(borde);
        agujeros[5].setName("5");
        agujeros[5].setBounds(900, 150,100,100);
        panel.add(agujeros[5]);

        agujeros[6] = new JLabel("6");
        agujeros[6].setBorder(borde);
        agujeros[6].setName("6");
        agujeros[6].setBounds(300, 275,100,100);
        panel.add(agujeros[6]);

        agujeros[7] = new JLabel("7");
        agujeros[7].setBorder(borde);
        agujeros[7].setName("7");
        agujeros[7].setBounds(600, 275,100,100);
        panel.add(agujeros[7]);

        agujeros[8] = new JLabel("8");
        agujeros[8].setBorder(borde);
        agujeros[8].setName("8");
        agujeros[8].setBounds(900, 275,100,100);
        panel.add(agujeros[8]);

        for(int i = 0; i < 9; i++) {
            agujeros[i].setBorder(borde);
            agujeroConWombat[i] = 0; //Inicializamos todos los agujeros a 0 para que no haya ningun wombat visible.
        }

        lblPuntuacion = new JLabel ("Puntuacion: 0"); //Implementamos JLabel para mostrar la puntuacion del jugador a lo largo de la partida
        lblPuntuacion.setHorizontalAlignment(SwingConstants.TRAILING); //TRAILING para que se ajuste al texto
        lblPuntuacion.setForeground(new Color(135, 206, 250));
        lblPuntuacion.setBounds(423, 54, 144, 33);
        PanelWW.add(lblPuntuacion);

        lblTiempoRestante = new JLabel("60"); //Implementamos JLabel para indicar el tiempo restante
        lblTiempoRestante.setHorizontalAlignment(SwingConstants.CENTER);
        lblTiempoRestante.setForeground(new Color(240, 128, 128));
        lblTiempoRestante.setBounds(232, 54, 144, 33);
        PanelWW.add(lblTiempoRestante);

        lblPuntuacionMaxima = new JLabel ("Puntuacion maxima: 0"); //Implementamos JLabel para hacerle saber al jugador cual es la puntuacion maxima
        lblPuntuacionMaxima.setHorizontalAlignment(SwingConstants.TRAILING);
        lblPuntuacionMaxima.setForeground(new Color(255, 255, 0));
        lblPuntuacionMaxima.setBounds(433, 18, 134, 33);
        PanelWW.add(lblPuntuacionMaxima);
        
        btnEmpezar = new JButton("Empezar"); //creamos el boton para que comience la partida
        btnEmpezar.setBackground(Color.WHITE);
        btnEmpezar.setBounds(32, 60, 110, 33);
        panel.add(btnEmpezar);
    }

    public void randomWombat() {//Esta clase va a generar un numero aleatorio (del 0 al 9 por los agujeros)
                               //para determinar el nº del hoyo en el que saldrá el wombat. 

        Random numeroRandom = new Random(System.currentTimeMillis()); //Inicializamos el numeroRandom
        int wombat = numeroRandom.nextInt(9); //Creamos la variable wombat (para luego poder saber cual es el que sale)
                                                      //Y le ponemos el numero random que va a crear este metodo entre el 0 y 9.

        agujeroConWombat[wombat] = 1; //Ponemos el agujero a 1 para que el wombat esté visible (salga del agujero).
        agujeros[wombat].setBorder(borde2); //Lo pintamos por ahora para comprobar que sale, aquí le meteremos la imagen del wombat con .setIcon().
    }

    private void limpiar(){ //con ese metodo el tablero empieza vacio en un principio
            for(int i = 0 ; i < 9; i++){
                agujeros[i].setBorder(borde);
                agujeroConWombat[i]= 0;
            }
        }

        public WombatWarsMain(){ //aqui juntamos estos tres metodos que serian la base del juego
            juego();
            limpiar();
            iniciarEventos();
        }
  
        public static  void main(String[] args) {
            WombatWarsMain ventana = new WombatWarsMain(); //Las  dos siguientes lineas llaman y hacen visible la ventana.
            ventana.setVisible(true);
        }
    
}