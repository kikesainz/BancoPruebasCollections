package com.bancopruebas.genericos;

import java.util.List;
import java.util.Set;

import com.bancopruebas.constantes.Constantes;
import com.bancopruebas.tipos.Persona;

public class Sets {

	/**
	 * Crea un HashSet usando un bucle añadiendo uno a uno con add()
	 * 
	 * @param setPersonas
	 * @return
	 */

	public static Set creaHashSet(Set setPersonas) {

		Long startTime = System.currentTimeMillis();
		for (int i = 0; i < Constantes.NUMERO_PERSONAS; i++) {
			setPersonas.add(new Persona(i, Constantes.NOMBRE_PERSONA + i));
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("HashSet - Tiempo en añadir: " + Constantes.NUMERO_PERSONAS + " registros "
				+ (endTime - startTime) + " ms.");
		return setPersonas;
	}

	/**
	 * Crea un hashSet desde una Lista con el método addAll
	 * 
	 * @param listaPersonas
	 * @param setPersonasVacio
	 * @return
	 */
	public static Set creaHashSetDesdeLista(List listaPersonas, Set setPersonasVacio) {

		Long startTime = System.currentTimeMillis();
		setPersonasVacio.addAll(listaPersonas);
		Long endTime = System.currentTimeMillis();
		System.out.println("HashSet - Tiempo en añadir con addAll: " + Constantes.NUMERO_PERSONAS + " registros "
				+ (endTime - startTime) + " ms.");
		return setPersonasVacio;
	}
	
	public static void obtenPersonadeHashSet(Set hashSet, Persona p ) {
		Long startTime = System.currentTimeMillis();
		boolean encontrada = hashSet.contains(p);
		Long endTime = System.currentTimeMillis();
		System.out.println("HashSet - Tiempo en encontrar: " + p.toString() + " " + (endTime - startTime) + " ms.");

	}
	
	public static Set creaTreeSet(List listaPersonas, Set treeSet) {

		Long startTime = System.currentTimeMillis();
		//Recorremos la lista al revés para ir creando el treeSet desordenado
		for (int i = Constantes.NUMERO_PERSONAS; i < 0; i--) {
			treeSet.add(listaPersonas.get(i));
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("TreeSet - Tiempo en añadir: " + Constantes.NUMERO_PERSONAS + " registros "
				+ (endTime - startTime) + " ms.");
		return treeSet;
	}

}
