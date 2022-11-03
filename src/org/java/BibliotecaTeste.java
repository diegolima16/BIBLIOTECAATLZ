package org.java;

import java.util.Scanner;

public class BibliotecaTeste {

	public static void main(String[] args) {
		// Sou empresário e queria uma aplicação simples, para ser implementada no
		// futuro.
		// Aplicação de Biblioteca, com seus Livros, tendo as opções de adicionar um
		// livro, e também remover partindo do título.​
		// Obs1: Na classe biblioteca, tendo apenas nome, e na classe Livro, apenas
		// titulo, e autor;
		// Obs2: Envio da atividade via Link do repositório GitHub.
		
		Livros livros = new Livros();
		Biblioteca biblioteca = new Biblioteca();
		Scanner entrada = new Scanner(System.in);
		Scanner entradaString = new Scanner(System.in);
		
		
		
		int menu = 0;
		String titulo, autor, nome;
		double vInicial, vFinal;
		Livros objLivro;
		
		do { 
			exibirMenu();
			menu = entrada.nextInt();
			
			switch(menu) {
			case 1: // ADC O LIVRO
				System.out.println("Digite o titulo");
				titulo=entradaString.nextLine();
				System.out.println("Digite o autor");
				autor=entradaString.nextLine();
				
				// criar objeto da classe 
				objLivro = new Livros(titulo , autor);
				// guardar no arraylist
				biblioteca.adicionar(objLivro);
				break;
				
			case 2:
				System.out.println("EXCLUSAO DO LIVRO");
				System.out.println("DIGITE O TITULO DO LIVRO");
				titulo = entradaString.nextLine();
				
				if(! (Biblioteca.getListaLivros().isEmpty())){                       // biblioteca n vazia
					if(Biblioteca.remover(titulo)) {
						System.out.println("LIVRO REMOVIDO COM SUCESSO");
					}else {
						System.out.println("TITULO NÃO ENCONTRADO");
					}
				}else {
					System.out.println("NAO EXISTEM LIVROS NA BIBLIOTECA");
				}
				break;
			case 3:
				System.out.println("LISTAGEM DE LIVROS");
				System.out.println(Biblioteca.listar());
			
				
			default:
				System.out.println("");
			}
		
	
	
		}while(menu !=5);
		
	
	}
		
		
		static void exibirMenu(){
			System.out.println("==================");
			System.out.println("(1) - ADICIONAR");
			System.out.println("(2) - REMOVER");
			System.out.println("(3) - LISTAR");
			System.out.println("ESCOLHA UMA OPÇAO");
		}
		
		
		
		
		
		
		
	}


