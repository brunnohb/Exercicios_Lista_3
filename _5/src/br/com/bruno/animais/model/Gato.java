package br.com.bruno.animais.model;

public class Gato {

	private int gat_codigo;
	private String gat_som;
	private String gat_nome;

	public String getGat_nome() {
		return gat_nome;
	}

	public void setGat_nome(String gat_nome) {
		this.gat_nome = gat_nome;
	}

	public int getGat_codigo() {
		return gat_codigo;
	}

	public void setGat_codigo(int gat_codigo) {
		this.gat_codigo = gat_codigo;
	}

	public String getGat_som() {
		return gat_som;
	}

	public void setGat_som(String gat_som) {
		this.gat_som = gat_som;
	}

	public Gato() {
	}

	public Gato(int gat_codigo, String gat_som, String gat_nome) {
		this.gat_codigo = gat_codigo;
		this.gat_som = gat_som;
		this.gat_nome = gat_nome;
	}

}
