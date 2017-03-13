package org.structures.ht6;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by kenne on 3/9/2017.
 */
public class Collection {
	Set<String> setWeb;
	Set<String> setJava;
	Set<String> setMovil;

	public Collection(int tipoSet){
		setWeb   = new FactoryDesarrollo<String>().Setcall(tipoSet);
		setJava  = new FactoryDesarrollo<String>().Setcall(tipoSet);
		setMovil = new FactoryDesarrollo<String>().Setcall(tipoSet);
	}

	public void addSetWeb(String persona){
		setWeb.add(persona);
	}

	public void addSetJava(String persona){
		setJava.add(persona);
	}

	public void addSetMovil(String persona){
		setMovil.add(persona);
	}

	public void mas_grande(){
		Set<String> setMasGrande = null;
		String nombreConjunto = "";
		if (setWeb.size() > setJava.size() && setWeb.size() > setMovil.size()){
			setMasGrande = setWeb;
			nombreConjunto = "Web";
		}else if (setJava.size() > setWeb.size() && setJava.size() > setMovil.size()){
			setMasGrande = setJava;
			nombreConjunto = "Java";
		}else if (setMovil.size() > setWeb.size() && setMovil.size() > setJava.size()){
			setMasGrande = setMovil;
			nombreConjunto = "Movil";
		}

		if(setMasGrande != null){
			System.out.println("El conjunto mas grande es el conjunto de desarrolladores " + nombreConjunto + ".");
			System.out.println("Los nombres de los desarrolladores son: ");
			Iterator<String> itr = setMasGrande.iterator();
			while (itr.hasNext()){
				Object element = itr.next();
				System.out.println(element);
			}
		}else{
			System.out.println("Existen varios conjuntos del mismo tama�o!");
		}
	}

	public void mas_grande_asc(){
		Set<String> setMasGrande = null;
		if (setWeb.size() > setJava.size() && setWeb.size() > setMovil.size()){
			setMasGrande = setWeb;
		}else if (setJava.size() > setWeb.size() && setJava.size() > setMovil.size()){
			setMasGrande = setJava;
		}else if (setMovil.size() > setWeb.size() && setMovil.size() > setJava.size()){
			setMasGrande = setMovil;
		}

		if(setMasGrande != null){
			Iterator<String> itr = setMasGrande.iterator();
			Object[] desarrolladores = new Object[setMasGrande.size()];
			int contador = 0;
			while (itr.hasNext()){
				Object element = itr.next();
				desarrolladores[contador] = element;
				contador++;
			}
			System.out.println("Los nombres de los desarrolladores del conjunto mas en orden ascendente son:");
			for (int i = desarrolladores.length-1; i > -1 ; i--){
				System.out.println(desarrolladores[i]);
			}
		}


	}

	public void web_o_movil(){
		System.out.println("Los desarrolladores con experiencia en Web O Movil, "
				+ "pero no en java son los siguientes:");
		Iterator<String> itr = setWeb.iterator();
		while(itr.hasNext()){
			Object element = itr.next();Iterator<String> itr2 = setJava.iterator();
			boolean exist = false;
			while (itr2.hasNext()){
				Object element2 = itr2.next();
				if (element.equals(element2)){
					exist = true;
				}
			}
			if (!exist){
				System.out.println(element);}
		}

		itr = setMovil.iterator();
		while (itr.hasNext()){
			Object element = itr.next();
			Iterator<String> itr2 = setWeb.iterator();
			boolean exist = false;
			while (itr2.hasNext()){Object element2 = itr2.next();
				if (element.equals(element2)){
					exist = true;
				}
			}
			if (!exist){
				Iterator<String> itr3 = setJava.iterator();
				boolean exist2 = false;
				while(itr3.hasNext()){Object element3 = itr3.next();
					if(element.equals(element3)){
						exist2 = true;
					}
				}
				if(!exist2){
					System.out.println(element);}
			}
		}
	}

	public void web_y_movil(){
		System.out.println("Los desarrolladores con experiencia en Web y Movil son: "); Iterator<String> itr = setWeb.iterator();
		while (itr.hasNext()){
			Object element = itr.next(); Iterator<String> itr2 = setMovil.iterator();
			while(itr2.hasNext()){
				Object element2 = itr2.next();
				if(element.equals(element2)){
					boolean exist = false;
					Iterator<String> itr3 = setJava.iterator();
					while(itr3.hasNext()){
						Object element3 = itr3.next();
						if (element.equals(element3)){
							exist = true;}
					}
					if (!exist){
						System.out.println(element);
					}
				}
			}
		}
	}

	public void solo_java(){
		System.out.println("Los Desarrolladores con experiencia en Java pero NO en Web son: "); Iterator<String> itr = setJava.iterator();
		while (itr.hasNext()){
			Object element = itr.next();Iterator<String> itr2 = setWeb.iterator();
			boolean exist = false;
			while(itr2.hasNext()){
				Object elemnt2 = itr2.next();
				if(element.equals(elemnt2)){
					exist = true;}
			}if(!exist){
				System.out.println(element);
			}
		}
	}

	public void java_web_movil(){
		System.out.println("Desarrolladores con experiencia en Java, Web y Moviles: "); Iterator<String> itr = setWeb.iterator();
		while (itr.hasNext()){
			Object element = itr.next(); Iterator<String> itr2 = setJava.iterator();
			while (itr2.hasNext()){
				Object elemet2 = itr2.next();
				if (element.equals(elemet2)){
					Iterator<String> itr3 = setMovil.iterator();
					while(itr3.hasNext()){
						Object element3 = itr3.next();
						if(element.equals(element3)){
							System.out.println(element);
						}
					}
				}
			}
		}
	}

	public void javaSubWeb(){
		Boolean[] existArray = new Boolean[setJava.size()];
		for(int i = 0; i < existArray.length; i++){
			existArray[i] = false;
		}
		Iterator<String> itr = setWeb.iterator();
		int contador = 0;
		while (itr.hasNext()){
			Object element = itr.next();Iterator<String> itr2 = setJava.iterator();
			while (itr2.hasNext()){
				Object element2 = itr2.next();
				if(element.equals(element2)){
					existArray[contador] = true;
				}
			}
			contador++;
		}boolean isSubconjunto = true;
		for(int i = 0; i < existArray.length; i++){
			if(existArray[i] == false){
				isSubconjunto = false;}
		}
		if(isSubconjunto){
			System.out.println("El conjunto de desarrolladores java SI es un subconjunto"
					+ " del conjunto que esta conformado por los desarroladores web.");
		}else{
			System.out.println("El conjunto de desarrolladores java NO es un subconjunto del "
					+ "conjunto de desarrolladores web. Puede intentar con otro conjunto de personas mas tarde");
		}
	}

}
