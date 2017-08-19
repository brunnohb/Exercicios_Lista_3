package br.com.bruno.animais.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.bruno.animais.model.Porquinho_da_India;

public class Porquinho_da_IndiaDAO {

	private final Connection con;

	public Porquinho_da_IndiaDAO(Connection con) {
		this.con = con;
	}
		
	public List<Porquinho_da_India> lista() throws SQLException { 
		List<Porquinho_da_India> porquinhos = new ArrayList<>();
		
		String sql = "select * FROM PORQUINHO_DA_INDIA"; 
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int pdi_codigo = rs.getInt("PDI_CODIGO");
					String pdi_nome = rs.getString("PDI_NOME");
					String pdi_som = rs.getString("PDI_SOM");
					Porquinho_da_India pdis = new Porquinho_da_India(pdi_codigo, pdi_som, pdi_nome);
					porquinhos.add(pdis);
				}
			}
		}

		return porquinhos;
	}
	
}
	