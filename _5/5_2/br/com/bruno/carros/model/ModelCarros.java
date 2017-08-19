package br.com.bruno.carros.model;

public class ModelCarros {
	
	private String placa;
	private String tipo_veiculo;
	private String marca;
	private String cor;
	
	public ModelCarros(){
	}
	
	public ModelCarros(String placa, String tipo_veiculo, String marca, String cor){
		this.placa = placa;
		this.tipo_veiculo = tipo_veiculo;
		this.marca = marca;
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTipo_veiculo() {
		return tipo_veiculo;
	}

	public void setTipo_veiculo(String tipo_veiculo) {
		this.tipo_veiculo = tipo_veiculo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
}
