package br.com.bruno.animais.dao;

import java.sql.Connection;  
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.bruno.animais.model.Cachorro;

public class CachorroDAO {

	private final Connection con;

	public CachorroDAO(Connection con) {
		this.con = con;
	}
		
	public List<Cachorro> lista() throws SQLException { 
		List<Cachorro> cachorros = new ArrayList<>();
		
		String sql = "select * FROM CACHORRO"; 
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int cac_codigo = rs.getInt("CAC_CODIGO");
					String cac_nome = rs.getString("CAC_NOME");
					String cac_som = rs.getString("CAC_SOM");
					Cachorro cachorro = new Cachorro(cac_codigo, cac_som, cac_nome);
					cachorros.add(cachorro);
				}
			}
		}

		return cachorros;
	}
}