package _2;

public class Livros extends Produto {

	private String autor;

	public Livros(String nome, double preco, String codBarras, String autor) {
		super(nome, preco, codBarras);
		this.autor = autor;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n" + 
				"Autor do Livro: " + Livros.this.autor;
	}
}
