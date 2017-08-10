package _3;

public class Circulo implements IFormaGeometrica {

	private double pi = 3.14d;
	private double raio;
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double calculaPerimetro(){
		double result;
		return result = 2 * this.getPi() * this.getRaio();
	}
	
	public double calculaArea(){
		double result;
		return result = this.getPi() * (this.getRaio() * this.getPi());
		
	}
}
