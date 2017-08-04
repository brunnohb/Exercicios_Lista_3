package _1;

public class ContaCorrenteEspecial extends ContaCorrente {
	
	public void saque(double valor){
		this.setTaxa(valor * 0.01);
		this.setSaldo(this.getSaldo() - (valor + this.getTaxa()));
		
	}
}
