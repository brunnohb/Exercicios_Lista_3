package _2;
/**
 * 
 * Este pacote refere-se aos exercic�os da Lista 3, referente ao item 2.
 * 
 * @author Bruno Henrique Boni.
 *
 */
public abstract class Fornecedor {
	/**
	 * Esta classe � abstrata para retratar os atributo obrigat�rio � todas as classes.
	 */
	protected String nome;
	protected double preco;
	
	public Fornecedor(String nome, double preco){
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	public String toString() {
		return "Nome do Produto: " + this.nome + 
				"\n" + 
				"Preco do Produto: " + this.preco;
	}
}
