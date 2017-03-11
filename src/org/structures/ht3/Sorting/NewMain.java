/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.structures.ht3.Sorting;


import org.structures.ht2.Interpreter;
import org.structures.ht3.Listas.Lista;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author OscarIvan
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista<String> numeros = new Lista<>();


        Interpreter interpretador= new Interpreter();
        String archivo= "Listado.txt";
        try {
            //se lee el archivo
            File data = new File(archivo);
            FileReader fileReader = new FileReader(data);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String linea;
            //se utiliza un contador, pues de lo contrario sacar la cola se tendría problemas con valores faltantes
            int contador=0;
            while ((linea = bufferedReader.readLine()) != null) {
                //se agrega el string de operación a la cola
                numeros.AgregarNodo(linea);
                contador++;
            }
            //se cierra el lector de archivos
            fileReader.close();
            System.out.println("Se ha terminado de leer el archivo "+archivo);
            int j=0;


            System.out.println("Cantidad de lineas leidas: "+contador);
            Sorting ordenador = new Sorting();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
