package org.java;

import java.util.ArrayList;

public class Livros {

	private static ArrayList<Biblioteca> listaLivros = new ArrayList<>();
	private String titulo;
	private String autor;

	public Livros() { // Construtor default

	}

	public Livros(String titulo, String autor) { // Construtor sobrecarregado
		super();
		this.titulo = titulo;
		this.autor = autor;
	}
	
	
	
	
	
	// metodos de acesso getset

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	
	
	// metodo da classe
	
	public String imprimir() {
		return "Título: " + titulo + "\nAutor: " + autor;
	}
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
