package com.example.produkti;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProduktuMapper implements RowMapper<Produkts> {

    @Override
    public Produkts mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        return new Produkts(resultSet.getString("nosaukums"),
                resultSet.getDouble("cena"),
                resultSet.getString("kategorija"),
                resultSet.getString("filename")
                );

    }
}
