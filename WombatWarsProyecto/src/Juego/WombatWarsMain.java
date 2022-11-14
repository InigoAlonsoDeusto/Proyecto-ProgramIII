package Juego;


import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import java.util.Random;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;



public class WombatWarsMain extends JFrame {

     private JPanel panel;
     private JLabel[] agujeros = new JLabel[9];
     Border borde = BorderFactory.createLineBorder(new Color (0, 100, 0), 5); //temporal para marcar los agujeros mientras no tengamos imagenes

     private int[] agujeroConWombat = new int[9]; //Array que va a representar el estado del agujero
                                                  //Si int=1 el wombat se verá, si int=0 no.
     public int puntuacion = 0; //empezamos con una puntuacion de 0 en un inicio

     private void presionarBoton(int id){ //con este metodo primero comprueba si el agujero que tocamos es un wombat o un agujero vacio, si es un wonbat se le sumara un punto a la puntiacion y si es una agujero se le restara un punto.Despues actualizaria el contador de puntuacion limpiaria el tablero y generaria otro wonbat aleatorio
        int valor = agujeroConWombat[id];

        if (valor==1){
            puntuacion++;
        }else{ // valor==0
            puntuacion--;
        }
        //lblPuntuacion.setText("Score:"+ puntuacion);
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
            agujeroConWombat[i] = 0; //Inicializamos todos los agujeros a 0 para que no haya ningun wombat visible.
        }
        
         
    }

    public void randomWombat() //Esta clase va a generar un numero aleatorio (del 0 al 9 por los agujeros)
                               //para determinar el nº del hoyo en el que saldrá el wombat.
    { 

        Random numeroRandom = new Random(System.currentTimeMillis()); //Inicializamos el numeroRandom
        int wombat = numeroRandom.nextInt(9); //Creamos la variable wombat (para luego poder saber cual es el que sale)
                                                      //Y le ponemos el numero random que va a crear este metodo entre el 0 y 9.

        agujeroConWombat[wombat] = 1; //Ponemos el agujero a 1 para que el wombat esté visible (salga del agujero).

        agujeros[wombat].setBackground(new Color (100, 0, 0)); //Lo pintamos por ahora para comprobar que sale, aquí le meteremos la imagen del wombat con .setIcon().



    }

    private void limpiar(){ //con ese metodo el tablero empieza vacio en un principio
            for(int i = 0 ; i < 9; i++){
                agujeros[i].setBackground(new Color(0,100,0));
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
