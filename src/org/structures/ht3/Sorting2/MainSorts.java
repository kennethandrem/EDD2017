package org.structures.ht3.Sorting2;

import org.structures.ht3.Sorting2.Sorts;

import java.util.Scanner;

public class MainSorts {

		 private static int n=0,opc=0;
		 private static String dir;
		 private static Integer [] lista;
		 public static void menu () {
			 Azar az = new Azar();
			 System.out.println("Bienvenido al programa, ingrese la direccion donde esta el archivo");
			 Sorts q = new Sorts();
			 Scanner sc = new Scanner(System.in);
			 dir= sc.next();
			 System.out.println("Ingrese la cantidad de numeros que quiere ordenar");
			 n= sc.nextInt();
			 az.escribirContenido(n,dir);
			 Azar.leerContenido(dir);  
			 lista = new Integer[Azar.array.size()];
			 for (int i=0;i<Azar.array.size();i++)
			 {
				 lista[i]=Integer.parseInt(Azar.array.get(i).trim());
			 }
			 System.out.println("Seleccione el algoritmo preferido");
			 
			 while(opc!=5){
				 System.out.println("1. Merge , 2. Quick, 3. Salir");
				 opc=sc.nextInt();
				 switch(opc) {
				 case 1:
					 Sorts.mergeSort(lista);
					 for(Integer i: lista) {
						 System.out.println(i);
					 }
					 break;
				 case 2:
					 Sorts.qSort(lista, 0, lista.length-1);
					 for(Integer i: lista) {
						 System.out.println(i);
					 }
					 break;
				 case 3:
					 System.out.println("Gracias por usar el programa");
					 break;
				 default: 
					 System.out.println("Escoga un No. valido");
					 break;
				 }
			 }
		 }

	public static void main(String[] args) { 
		
		menu();
	} 
}
