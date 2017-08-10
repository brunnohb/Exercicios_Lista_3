package _2;
/**
 * 
 * Este pacote refere-se aos exercic�os da Lista 3, referente ao item 2.
 * 
 * @author Bruno Henrique Boni.
 *
 */
public abstract class Produto implements Comparable<Produto>{
	/**
	 * Esta classe � abstrata para retratar os atributo obrigat�rio � todas as classes.
	 */
	private String nome;
	private String preco;
	private String codBarras;
	
	public Produto(String nome, String preco, String codBarras){
		super();
		this.nome = nome;
		this.preco = preco;
		this.codBarras = codBarras;
	}
	
	public String toString() {
		return  this.nome + 
				"\n" + 
				"PRE�O DO PRODUTO: " + this.preco +
				"\n" +
				"C�DIGO DE BARRAS DO PRODUTO: " + this.codBarras;
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

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}
	
	@Override
	public int compareTo(Produto o) {
		return this.nome.compareTo(o.getPreco());
	}
	
}
