package org.structures.ht6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by kennek on 3/9/2017.
 */

public class FactoryDesarrollo<E> {

	public Set<E> Setcall(int opcion) {
		switch(opcion) {
		case 1:
			return new HashSet<E>();
		case 2:
			return new TreeSet<E>();
		case 3:
			return new LinkedHashSet<E>();
		default:
			return null;
		}

	}
}