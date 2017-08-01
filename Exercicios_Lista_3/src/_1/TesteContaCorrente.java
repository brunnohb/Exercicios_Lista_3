package _1;

public class TesteContaCorrente {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		ContaCorrenteEspecial cce = new ContaCorrenteEspecial();

		cc.setSaldo(1000d);
		cc.saque(500d);
		cc.setDeposita(1000d);
		
		cce.setSaldo(2000d);
		cce.saque(200d);
		cce.setDeposita(1000d);
		
		System.out.println("Resultado Conta Corrente: " + cc.getSaldo());
		System.out.println("Resultado Conta Corrente Especial: " + cce.getSaldo());
	}

}
