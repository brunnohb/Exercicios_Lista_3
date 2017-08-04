package _2;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	public static void main(String[] args) {

		Livros livro1 = new Livros("Harry Potter e a Pedra Filosofal", 16.99, "7909156 451425", "J.K ROWLING");
		Livros livro2 = new Livros("Harry Potter e a Câmara Secreta", 16.99, "7909156 451425", "J.K ROWLING");

		CDs cd1 = new CDs("Rouge", 9.99, "7909156 131418", "12");
		CDs cd2 = new CDs("Bonde do Tigrão", 12.00, "7909156 233121", "15");

		DVD dvd1 = new DVD("Velozes e Furiosos Desafio em Tokyo", 23.50, "7909156 558741", "1.89");

		List<Produto> lista = new ArrayList<>();

		lista.add(livro1);
		lista.add(livro2);
		lista.add(cd1);
		lista.add(cd2);
		lista.add(dvd1);

		System.out.println(livro1.equals(livro2));

		for (Produto produto : lista) {
			System.out.println("NOME: " + produto.toString() + "\n" + "------------------------");
		}
		
		private static void buscarProduto(Produto produto, List<Produto>lista){
			for (Produto prod : lista) {
				if(prod.equals(produto)){
					
				}
			}
		}
		
	}
}
