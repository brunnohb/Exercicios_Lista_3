package _2;

public class CDs extends Fornecedor {

	private String numeroFaixas;

	public CDs(String nome, double preco, String numeroFaixas) {
		super(nome, preco);
		this.numeroFaixas = numeroFaixas;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n" + "Quantidade de Faixas: " + CDs.this.numeroFaixas;
	}
}
