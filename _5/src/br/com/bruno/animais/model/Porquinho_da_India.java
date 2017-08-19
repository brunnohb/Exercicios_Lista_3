package br.com.bruno.animais.model;

public class Porquinho_da_India {

	private int pdi_codigo;
	private String pdi_som;
	private String pdi_nome;

	public int getPdi_codigo() {
		return pdi_codigo;
	}

	public void setPdi_codigo(int pdi_codigo) {
		this.pdi_codigo = pdi_codigo;
	}

	public String getPdi_som() {
		return pdi_som;
	}

	public void setPdi_som(String pdi_som) {
		this.pdi_som = pdi_som;
	}

	public String getPdi_nome() {
		return pdi_nome;
	}

	public void setPdi_nome(String pdi_nome) {
		this.pdi_nome = pdi_nome;
	}

	public Porquinho_da_India(){
	}
	
	public Porquinho_da_India(int pdi_codigo, String pdi_som, String pdi_nome) {
		this.pdi_codigo = pdi_codigo;
		this.pdi_som = pdi_som;
		this.pdi_nome = pdi_nome;
		}

}