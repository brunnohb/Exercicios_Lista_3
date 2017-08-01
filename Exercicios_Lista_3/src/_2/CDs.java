package _2;

public class CDs extends Loja {

	private String numeroFaixas;

	public CDs(String nome, double preco, String numeroFaixas) {
		super(nome, preco);
		this.numeroFaixas = numeroFaixas;
	}
}
