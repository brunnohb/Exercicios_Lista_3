package _2;

public class Livros extends Fornecedor {

	private String autor;

	public Livros(String nome, double preco, String autor) {
		super(nome, preco);
		this.autor = autor;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n" + 
				"Autor do Livro: " + Livros.this.autor;
	}
}
