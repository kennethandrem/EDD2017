package org.structures.ht2;
/**
 * Created by kenne on 2/4/2017.
 */

import java.util.Scanner;
import java.util.Stack;

public class Interpreter {
	public String Read(Nodo nodo){
		return nodo.toString();
	}

	public int Analize(String texto){
		Stack<Integer> s = new Stack<Integer> ();
		Scanner indicador = new Scanner(texto);
		while (indicador.hasNext()) {
			if (indicador.hasNextInt()) {
				s.push(indicador.nextInt());
			} else {
				int n2 = s.pop();
				int n1 = s.pop();
				String operador = indicador.next();
				if (operador.equals("+")) {
					s.push(n1 + n2);
				} else if (operador.equals("-")) {
					s.push(n1 - n2);
				} else if (operador.equals("*")) {
					s.push(n1 * n2);
				} else {
					s.push(n1 / n2);
				}
			}
		}
		return s.pop();
	}
}
