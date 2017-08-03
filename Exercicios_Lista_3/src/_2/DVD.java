package _2;

public class DVD extends Fornecedor {

	private String duracao;

	public DVD(String nome, double preco, String duracao) {
		super(nome, preco);
		this.duracao = duracao;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + 
				"\n" + 
		"Duracação do DVD: " + DVD.this.duracao;
	}
	
	}

