package org.structures.ht2;
/**
 * Created by kenne on 2/4/2017.
 */

import java.io.*;

public class Lector{
    public static void main(String[] arg){
        Cola cola= new Cola();
        Interpreter interpretador= new Interpreter();
        String archivo= "org/structures/ht2/datos.txt";
        try {
            FileReader fileReader = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linea;
            int contador=0;
            while ((linea = bufferedReader.readLine()) != null) {
                cola.enQueue(linea);
                contador++;
            }
            fileReader.close();
            System.out.println("Se ha terminado de leer el archivo "+archivo);
            int j=0;
            System.out.println("Cantidad de lineas leidas: "+contador);
            while(j<contador){
                String temporal =interpretador.Read(cola.deQueue());
                System.out.println(temporal);
                int result= interpretador.Analize(temporal);
                j++;
                System.out.println("resultado de operar la linea "+j+" es: "+result);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            System.out.println(cadena);
        }
        b.close();
    }


}