package _2;

public class Livros extends Loja {

	private String autor;

	public Livros(String nome, double preco, String autor) {
		super(nome, preco);
		this.autor = autor;
	}
}
