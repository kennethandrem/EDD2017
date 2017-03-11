package org.structures.ht3.Sorting2;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JOptionPane;

public class Azar {
	private FileWriter fichero = null;
	private PrintWriter pw = null;
	static String textoarray="",txt="";
	static Stack<String> miStack = new Stack<String>();
	static ArrayList<String> array = new ArrayList<String>();

	public Azar() {
		super();
		// TODO Auto-generated constructor stub
	}
	static String leerContenido(String archivo) {
		String texto="",temp="",temp2="",bfRead; 
		try{
			BufferedReader ar = new BufferedReader (new FileReader(archivo));
			while ((bfRead = ar.readLine()) != null){
				temp+=bfRead;
				temp2=bfRead;
				array.add(temp2);
			}
			texto=temp;
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "No se encuentra el archivo");
		}
		return texto;
	}
	void escribirContenido(int n,String dir){
		try
		{
			fichero = new FileWriter(dir);
			pw = new PrintWriter(fichero);

			for (int i = 0; i < n; i++)
				pw.println(generarNumeros()+" ");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	int generarNumeros(){

		return (int)(Math.random()*(3000-10+1)+10);
	}
}

