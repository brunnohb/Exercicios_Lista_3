package br.com.bruno.animais.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.bruno.animais.model.Gato;

public class GatoDAO {


	private final Connection con;

	public GatoDAO(Connection con) {
		this.con = con;
	}
		
	public List<Gato> lista() throws SQLException { 
		List<Gato> gatos = new ArrayList<>();
		
		String sql = "select * FROM GATO"; 
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int gat_codigo = rs.getInt("GAT_CODIGO");
					String gat_nome = rs.getString("GAT_NOME");
					String gat_som = rs.getString("GAT_SOM");
					Gato gato = new Gato(gat_codigo, gat_som, gat_nome);
					gatos.add(gato);
				}
			}
		}

		return gatos;
	}
}