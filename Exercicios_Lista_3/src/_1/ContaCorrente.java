package _1;

public class ContaCorrente {

	private double deposita;
	private double saldo;
	private double taxa;

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public double getDeposita() {
		return deposita;
	}

	public void setDeposita(double deposita) {
		this.saldo += deposita;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void saque(double valor) {
		taxa = valor * 0.05;
		this.saldo -= (valor + taxa);

	}

}
