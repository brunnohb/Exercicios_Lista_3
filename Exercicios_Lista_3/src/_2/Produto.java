package _2;
/**
 * 
 * Este pacote refere-se aos exercic�os da Lista 3, referente ao item 2.
 * 
 * @author Bruno Henrique Boni.
 *
 */
public abstract class Produto {
	/**
	 * Esta classe � abstrata para retratar os atributo obrigat�rio � todas as classes.
	 */
	private String nome;
	private double preco;
	private String codBarras;
	
	public Produto(String nome, double preco, String codBarras){
		super();
		this.nome = nome;
		this.preco = preco;
		this.codBarras = codBarras;
	}
	
	public String toString() {
		return "Nome do Produto: " + this.nome + 
				"\n" + 
				"Preco do Produto: " + this.preco +
				"\n" +
				"C�digo de Barras do Produto: " + this.codBarras;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Produto produto = (Produto) obj;
		return this.codBarras.equals(produto.getCodBarras());
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	
}
