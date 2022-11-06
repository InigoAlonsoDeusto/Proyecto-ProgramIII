package adrian;

import javax.swing.JFrame;
import javax.swing.JPanel;


import java.awt.Dimension; //Saber el tamaño de la pantalla y especificar la posicion de la ventana
import java.awt.Toolkit; //Saber el tamaño de la pantalla y especificar la posicion de la ventana
import java.awt.Point; //Este crea puntos en el plano, es decir, la "cabeza" de la serpiente o los puntos donde sale la comida
import java.awt.Color;
import java.awt.Graphics;



import java.awt.event.*; //Esto nos permitirá interactuar con las teclas (cuando pulsemos una tecla que cambie de dirección etc.)
import java.util.ArrayList;
import java.util.Random;


public class Snake extends JFrame{
	
	
	public int width = 800, height = 800; //Anchura y altura de la ventana
	
	Point snake; //El punto de la snake en la ventana
	Point comida; //El putno de la comida en la ventana
	
	boolean gameOver = false; //Se mantendrá en falso hasta que la Snake se choque consigo misma
	
	ArrayList<Point> lista = new ArrayList<Point>(); //Una lista de puntos, para hacer crecer la snake cuando come la comida
	
	public int widthPoint = 10, heightPoint = 10; //Anchura y altura del cuadrado de la Snake y la comida
	
	
	long frecuencia = 40; //Cuanta mayor frecuencia mas lenta irá la Snake. (Cada x(frecuencia) milisegundos actualiza).
	
	ImagenSnake imagenSnake; //Variable global (la Snake como tal) para que me deje usarla en el constructor
	
	public int direccion = KeyEvent.VK_LEFT; //Guarda la direccion de la Snake. En un principio irá para la izquierda al iniciar el programa
									  //Es un int porque lo que se esta guardando en la variable es el codigo de la tecla
	
	
	public Snake() {
		setTitle("Snake"); //titulo de la ventana
		setSize(width, height); //tamaño de la ventana
		
	
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); //Con esta función conseguimos obtener las dimensiones de la pantalla
																	 //para poder colocar la ventana SnakeGame en la mitad de la misma.
		
		
		this.setLocation(dim.width/2-width/2, dim.height/2-height/2); //Restamos el valor de width/2 y height/2 porque el setLocation coge
		 															  //la esquina superior izquierda como referencia. No el centro de la ventana.
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cuando cerramos la ventana se detiene el juego a su vez.
		
		Teclas teclas = new Teclas(); //Agrego la clase Teclas en el constructor de la Snake para que cumpla su funcion
		this.addKeyListener(teclas);
		
		startGame();
		
		imagenSnake = new ImagenSnake(); //Creamos la snake (rectangulo que hemos pintado de azul)
		this.getContentPane().add(imagenSnake); //Añadimos la snake al Panel
		
		setVisible(true); //Hace que sea visible la ventana
		
		Momento momento = new Momento(); //Creamos el momento en la Snake para que pueda moverse al actualizarse
		Thread trid = new Thread(momento);
		trid.start();
		
	}
	
	public void startGame() { //Situación inicial al inciar el juego
		comida = new Point(width, height); //Creamos un nuevo punto para la comida
		snake = new Point(width/2, height/2); //Creamos la Snake
		crearComida();
		
		
		lista = new ArrayList<Point>(); //Instanciamos la variable de la lista que aumenta el tamaño de la Snake
		lista.add(snake); //Añadimos el primer punto de la lista (Snake es el primer punto)
		
		
	}
	
	
	public void crearComida() { //Generará comida
		Random rnd = new Random(); //Metodo random genera la comida en una posición al azar dentro de unos valores (En este caso la ventana)
		
		comida.x = rnd.nextInt(64)*10; //Genera valores posibles dentro de la ventana y multiplos de 10
		comida.y = rnd.nextInt(48)*10; //Genera valores posibles dentro de la ventana y multipolos de 10
		
		
		
		
	
	}
	
	
	public static void main(String[] args) {
		Snake s = new Snake(); //Creamos la snake definida arriba con el constructor
	
	}
	

	public void actualizar() { //El metodo de actualizar que utilizaremos para actualizar cada momento en el juego
		imagenSnake.repaint(); //Repintar la clase donde tenemos los graficos, pero la repintara en una posicion diferente debido a Momento.
		
		
		//Vamos a ir añadiendo los puntos de la snake, poniendose 1 cuadrado nuevo al principio cuando comemos.
		lista.add(0, new Point(snake.x, snake.y));
		lista.remove(lista.size()-1);
		
		
		
		//Para el gameOver tenemos que evaluar si en la lista de posiciones se superpone algun punto con el otro
		for (int i = 1; i < lista.size(); i++) {
			Point punto = lista.get(i);
			if(snake.x == punto.x && snake.y == punto.y) { //Si se choca algun punto x o y con la cabeza de la Snake (Snake.x o Snake.y) será gameover
				gameOver = true;
				
			}
			
		}
		
		
		//Aqui vamos a añadir lo que pasa cuando se come la manzana la snake (Cuando pasa por encima)
		if((snake.x == comida.x) && (snake.y == comida.y)) { //si coincide la cabeza de la Snake con la comida:
			
			lista.add(0, new Point(snake.x, snake.y)); //Cada vez que comamos añadimos un nuevo punto a la lista en la posicion 0.
			crearComida();
			
		}
		
		
	}
	
	public class ImagenSnake extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			
			
			
			g.setColor(new Color(0, 0, 255)); //Color azul para la serpiente
			g.fillRect(snake.x, snake.y, widthPoint, heightPoint); //Variables para ancho y altura de su cuerpo (cada cuadradito) por si quiero cambiarlas luego
			//Vamos a actualizar la cantidad de puntos que existen:
			for (int i = 0; i < lista.size(); i++) {
				Point point = (Point)lista.get(i);
				g.fillRect(point.x, point.y, widthPoint, heightPoint);
				
			}
			
			
			
			
			
			g.setColor(new Color(255, 0, 0)); //Color rojo para la comida
			g.fillRect(comida.x, comida.y, widthPoint, heightPoint);
			
			
			if(gameOver) { //Si llegamos a gameOver escribirá en la pantalla "GAME OVER"
				g.drawString("GAME OVER", 400, 400);
			}
			
			
		}
	}
	
	
	
	
	
	
	
	
	public class Teclas extends KeyAdapter { //Esta clase la utilizo para almacenar lo que hagan las flechas para dirigir a la Snake
		
		//NUNCA podremos cambiar en la dirección contraria a la que vamos, sino se chocaria consigo misma
		
		public void keyPressed(KeyEvent e) {
			
			if(e.getKeyCode() == KeyEvent.VK_UP) { //Obtiene el codigo de la tecla presionada, en este caso si es igual a flecha arriba, irá para arriba
				if(direccion != KeyEvent.VK_DOWN) {
					direccion = KeyEvent.VK_UP;
				}
			}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
				if(direccion != KeyEvent.VK_UP) {
					direccion = KeyEvent.VK_DOWN;
				}
			}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {	
				if(direccion != KeyEvent.VK_RIGHT) {
					direccion = KeyEvent.VK_LEFT;
				}
			}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
				if(direccion != KeyEvent.VK_LEFT) {
					direccion = KeyEvent.VK_RIGHT;
				}
				
			}
		
		}
	}
	public class Momento extends Thread { //Los momentos que iremos actualizando con la funcion actualizar() para cambiar la posición, longitud de la snake...
		
		long last = 0;
		
		public void run() {  //El juego estará iniciado
			while(true) {
				//Lo de ahora nos devuelve cuanto tiempo lleva el programa ejecutandose
				if((java.lang.System.currentTimeMillis() - last) > frecuencia) {
					if(!gameOver) {
						if(direccion == KeyEvent.VK_UP) {
							snake.y = snake.y - heightPoint; //Si voy para arriba, a la posición se le resta el tamaño del heightPoint
							if(snake.y < 0) {
								snake.y = height - heightPoint;  //Si sobrepaso el borde superior de la ventana, que vaya al borde contrario (inferior)
							}
							
							if(snake.y > height) {
								snake.y = 0;
							}
						} else if(direccion == KeyEvent.VK_DOWN) {
							snake.y = snake.y + heightPoint;  //Si voy para arriba, a la posición le resta el tamaño del heightPoint
							if(snake.y < 0) {
								snake.y = height - heightPoint;
							}
							
							if(snake.y > height) {
								snake.y = 0; //Si sobrepaso el borde inferior que aparezca en el superior (y=0)
							}
							
							//En left y right pasa lo mismo pero con los otros bordes (izquierdo y derecho)
							
						} else if(direccion == KeyEvent.VK_LEFT) {
							snake.x = snake.x - widthPoint;
							if(snake.x < 0) {
								snake.x = width - widthPoint;
							}
							
							if(snake.x > width) {
								snake.x = 0;
							}
						}  else if(direccion == KeyEvent.VK_RIGHT) {
							snake.x = snake.x + widthPoint;
							if(snake.x < 0) {
								snake.x = width - widthPoint;
							}
							
							if(snake.x > width) {
								snake.x = 0;
							}
						}
					} 
					
					actualizar();
					last = java.lang.System.currentTimeMillis();
				}
				
			}
		}
	}
}


