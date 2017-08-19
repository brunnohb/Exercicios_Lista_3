package br.com.bruno.animais.teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.bruno.animais.dao.Porquinho_da_IndiaDAO;
import br.com.bruno.animais.dao.CachorroDAO;
import br.com.bruno.animais.dao.GatoDAO;
import br.com.bruno.animais.jdbc.oracle.ConnectionPoolOracle;
import br.com.bruno.animais.model.Cachorro;
import br.com.bruno.animais.model.Gato;
import br.com.bruno.animais.model.Porquinho_da_India;


public class Teste {
	public static void main(String[] args) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			List<Cachorro> cachorros = new CachorroDAO(con).lista();
			for (Cachorro cachorro : cachorros) {
				System.out.println(cachorro.getCac_nome() + " \\ " + cachorro.getCac_som());
				
			}
			List<Gato> gatos = new GatoDAO(con).lista();
			for (Gato gato : gatos) {
				System.out.println(gato.getGat_nome() + " \\ " + gato.getGat_som());
			}
			List<Porquinho_da_India> pdis = new Porquinho_da_IndiaDAO(con).lista();
			for (Porquinho_da_India porquinho_da_India : pdis) {
				System.out.println(porquinho_da_India.getPdi_nome() + " \\ " + porquinho_da_India.getPdi_som());
			}
			
		}
	}
}
