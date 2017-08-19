package br.com.bruno.carros.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.bruno.carros.model.ModelCarros;;

public class CarrosDAO {

	private final Connection con;

	public CarrosDAO(Connection con) {
		this.con = con;
	}

	public List<ModelCarros> lista() throws SQLException {
		List<ModelCarros> carros = new ArrayList<>();

		String sql = "select * FROM CARROS";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					String placa = rs.getString("PLACA");
					String tipo_veiculo = rs.getString("TIPO_VEICULO");
					String marca = rs.getString("MARCA");
					String cor = rs.getString("COR");
					ModelCarros carro = new ModelCarros(placa, tipo_veiculo, marca, cor);
					carros.add(carro);
				}
			}
		}

		return carros;
	}
}
