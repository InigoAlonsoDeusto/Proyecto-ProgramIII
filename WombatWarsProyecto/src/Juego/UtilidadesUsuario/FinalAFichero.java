package Juego.UtilidadesUsuario;

import java.util.ArrayList;
import java.util.List;

public class FinalAFichero {

    public static void writeTXT(VentanaBD.DatosPartida) throws IOException, ClassNotFoundException, SQLException {
        Writer writer = null;
        try{
          writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("filename.txt")));
          StringBuffer bufferHeader = new StringBuffer();
          for(int i = 0; i<table.getColumnCount();i++){
            bufferHeader.append(table.getColumnName(i));
            if(i!=table.getColumnCount()) bufferHeader.append(" ");
          }
          writer.write(bufferHeader.toString()+"\r\n");
      
          
            for (int k = 0; k<table.getColumnCount(); k++){
              buffer.append(table.getValueAt(j,k));
              if(k!=table.getColumnCount()) buffer.append(" ");
            }
            writer.write(buffer.toString()+"\r\n");
          
        }finally{
          writer.close();
        }
      

    
        }
    }

