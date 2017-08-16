package br.com.bruno.animais.teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.bruno.animais.dao.CachorroDAO;
import br.com.bruno.animais.jdbc.oracle.ConnectionPoolOracle;
import br.com.bruno.animais.model.Cachorro;

public class TesteCachorro {
	public static void main(String[] args) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			List<Cachorro> cachorros = new CachorroDAO(con).lista();
			for (Cachorro cachorro : cachorros) {
				System.out.println(cachorro.getCac_codigo() + " " + cachorro.getCac_nome() + " " + cachorro.getCac_som());
				
			}
		}
	}
}
