package _2;

public class DVD extends Produto {

	private String duracao;

	public DVD(String nome, double preco, String codBarras, String duracao) {
		super(nome, preco, codBarras);
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

