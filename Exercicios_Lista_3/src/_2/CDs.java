package _2;

public class CDs extends Produto {

	private String numeroFaixas;

	public CDs(String nome, String preco, String codBarras, String numeroFaixas) {
		super(nome, preco, codBarras);
		this.numeroFaixas = numeroFaixas;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n" + "Quantidade de Faixas: " + CDs.this.numeroFaixas;
	}
}
