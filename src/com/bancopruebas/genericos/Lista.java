package com.bancopruebas.genericos;

import java.util.List;

import com.bancopruebas.constantes.Constantes;
import com.bancopruebas.tipos.Persona;

public class Lista {

	/**
	 * Crea un ArrayList usando un bucle a�adiendo uno a uno con add()
	 * 
	 * @param listaPersonas
	 * @return
	 */
	public static List creaLista(List listaPersonas) {

		Long startTime = System.currentTimeMillis();
		for (int i = 0; i < Constantes.NUMERO_PERSONAS; i++) {
			listaPersonas.add(new Persona(i, Constantes.NOMBRE_PERSONA + i));
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("Lista - Tiempo en a�adir " + Constantes.NUMERO_PERSONAS + " registros: "
				+ (endTime - startTime) + " ms.");
		return listaPersonas;
	}

	/**
	 * Obtiene una persona dada que le pasamos por par�metro
	 * 
	 * @param listaPersonas
	 * @param p
	 */
	public static void obtenPersona(List listaPersonas, Persona p) {
		Long startTime = System.currentTimeMillis();
		boolean encontrada = listaPersonas.contains(p);
		Long endTime = System.currentTimeMillis();
		System.out.println("Lista - Tiempo en encontrar " + p.toString() + ": " + (endTime - startTime) + " ms.");

	}

	/**
	 * Obtienen la persona que se encuentra en la posici�n que le pasamos por
	 * par�metro
	 * 
	 * @param listaPersonas lista a buscar
	 * @param posicion      posici�n del array en la que se encuentra la persona a
	 *                      buscar
	 */
	public static void obtenPersonaPosicion(List listaPersonas, int posicion) {
		Long startTime = System.currentTimeMillis();
		listaPersonas.get(posicion);
		Long endTime = System.currentTimeMillis();
		System.out
				.println("Lista - Tiempo en encontrar la posici�n: " + posicion + " " + (endTime - startTime) + " ms.");

	}

}
