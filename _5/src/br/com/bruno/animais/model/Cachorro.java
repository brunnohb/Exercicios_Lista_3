package br.com.bruno.animais.model;

public class Cachorro {
	
	private int cac_codigo;
	private String cac_som;
	private String cac_nome;
	
	
	
	public String getCac_nome() {
		return cac_nome;
	}
	public void setCac_nome(String cac_nome) {
		this.cac_nome = cac_nome;
	}
	public int getCac_codigo() {
		return cac_codigo;
	}
	public void setCac_codigo(int cac_codigo) {
		this.cac_codigo = cac_codigo;
	}
	public String getCac_som() {
		return cac_som;
	}
	public void setCac_som(String cac_som) {
		this.cac_som = cac_som;
	}
	
	public Cachorro(){
	}
	
	public Cachorro(int cac_codigo, String cac_som, String cac_nome){
		this.cac_codigo = cac_codigo;
		this.cac_som = cac_som;
		this.cac_nome = cac_nome;
	}
}
