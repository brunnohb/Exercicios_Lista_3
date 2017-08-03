package _2;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	public static void main(String[] args) {

		Livros livro1 = new Livros("Harry Potter e a Pedra Filosofal", 16.99, "J.K ROWLING");
		Livros livro2 = new Livros("Harry Potter e a Câmara Secreta", 16.99, "J.K ROWLING");

		CDs cd1 = new CDs("Rouge", 9.99, "12");
		CDs cd2 = new CDs("Bonde do Tigrão", 12.00, "15");

		DVD dvd1 = new DVD("Velozes e Furiosos Desafio em Tokyo", 23.50, "1.89");

		List lista = new ArrayList();

		lista.add(livro1);
		lista.add(livro2);
		lista.add(cd1);
		lista.add(cd2);
		lista.add(dvd1);

		System.out.println("CD 1: " + cd1 + "\n" +
		"--------------------------" + "\n" + 
		"CD 2: " + cd2 + "\n" + 
		"--------------------------" + "\n" +
		"DVD 1: " + dvd1 + "\n" + 
		"--------------------------" + "\n" +
		"Livro 1: " + livro1 + "\n" + 
		"--------------------------" + "\n" +
		"Livro 2: " + livro2);
	}
}
