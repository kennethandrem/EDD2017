package org.structures.ht6;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by kennek on 3/9/2017.
 */

public class Desarrolladores {

	public static void main(String[] args) throws IOException {
		try{
			Scanner scan = new Scanner(System.in);
			System.out.println("Seleccione el tipo de SET que utilizara el programa:");
			System.out.println("1. HashSet");
			System.out.println("2. TreeSet");
			System.out.println("3. LinkedHashSet");
			int tipoSet = scan.nextInt();
			Collection FactoryDesarrolladores = new Collection(tipoSet);
			System.out.println("Ingrese la cantidad de personas que va a ingresar: ");
			int cantPersona = scan.nextInt();
			for(int i = 0; i < cantPersona; i ++){
				System.out.println("Escriba el nombre de la persona " + (i + 1) + ": ");
				String nombre = scan.next();
				System.out.println("¿a cuantos conjuntos agregara a esta persona?");
				int cantGrupos = scan.nextInt();
				System.out.println("Seleccione el conjunto al que quiere agregarla: ");
				System.out.println("1. Web");
				System.out.println("2. Java");
				System.out.println("3. Moviles");
				int tipoConjunto = scan.nextInt();
				switch (tipoConjunto){
				case 1:
					FactoryDesarrolladores.addSetWeb(nombre);
					break;
				case 2:
					FactoryDesarrolladores.addSetJava(nombre);
					break;
				case 3:
					FactoryDesarrolladores.addSetMovil(nombre);
					break;
				}
				if (cantGrupos > 1){
					for (int i2 = 0; i2 < cantGrupos - 1; i2++){
						System.out.println("Seleccione el otro conjunto al que quiere agregarla: ");
						System.out.println("1. Web");
						System.out.println("2. Java");
						System.out.println("3. Moviles");
						tipoConjunto = scan.nextInt();
						switch (tipoConjunto) {
						case 1:
							FactoryDesarrolladores.addSetWeb(nombre);
							break;
						case 2:
							FactoryDesarrolladores.addSetJava(nombre);
							break;
						case 3:
							FactoryDesarrolladores.addSetMovil(nombre);
							break;
						}
					}
				}
			}
			boolean mostrarMenu = true;
			while (mostrarMenu){
				menuPrincipal();
				int pregunta = scan.nextInt();
				switch (pregunta){
				case 1:
					FactoryDesarrolladores.java_web_movil();
					break;
				case 2:
					FactoryDesarrolladores.solo_java();
					break;
				case 3:
					FactoryDesarrolladores.web_y_movil();
					break;
				case 4:
					FactoryDesarrolladores.web_o_movil();
					break;
				case 5:
					FactoryDesarrolladores.javaSubWeb();
					break;
				case 6:
					FactoryDesarrolladores.mas_grande();
					break;
				case 7:
					FactoryDesarrolladores.mas_grande_asc();
					break;
				case 8:
					mostrarMenu = false;
					break;
				}
			}
		}catch (Exception e){
			System.out.println("ERROR: Ingreso una opcion invalida");
		}

	}

	public static void agregar(){

	}

	public static void menuPrincipal(){
		System.out.println();
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.println("- - - - - - - - - - - - - - - - BIENVENIDO A LA HOJA DE TRABAJO 6 - - - - - - - - - - - - - - - - - -");
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.println("1. Desarrolladores en Java, web, y Movil");
		System.out.println("2. Desarrolladores en Java pero sin experiencia en web");
		System.out.println("3. Desarrolladores web y movil sin experiencia en Java");
		System.out.println("4. Desarrolladores web o Movil sin experiencia en Java");
		System.out.println("5. Verificar si el conjunto de desarrolladores en Java es un subconjunto de los desarrolladores web");
		System.out.println("6. Mostrar el conjunto de desarrolladores mas grander y sus integrantes");
		System.out.println("7. Mostrar los integrantes del conjunto de desarrolladores mas grander ascendentemente");
		System.out.println("8. Salir");
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
	}
	

	
}