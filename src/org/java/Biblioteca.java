package org.java;

import java.util.ArrayList;

public class Biblioteca {
	private static ArrayList<Livros> listaLivros = new ArrayList<>();

	// metodo GET
	public static ArrayList<Livros> getListaLivros() {
		return listaLivros;
	}
	// Adiciona um objeto na lista
	public static void adicionar(Livros l) {
		listaLivros.add(l);
	}
	
	static public String listar() {
		String saida= "";
		int i =1;
		for(Livros l : listaLivros) {
			saida += " \n========== LIVRO N." + (i++)+ " =====\n";
			saida += l.imprimir() + " \n";
		}
		return saida;
	}


	// remove um livro pelo titulo
	static public boolean remover(String titulo) {
		for (Livros l : listaLivros) {
			if (l.getTitulo().equalsIgnoreCase(titulo)) {
				listaLivros.remove(l);
				return true;
			}
		}
		return false;

	}
	

}
