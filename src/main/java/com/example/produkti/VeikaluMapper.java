package com.example.produkti;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class VeikaluMapper implements RowMapper<Veikals> {
    @Override
    public Veikals mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        return new Veikals(resultSet.getString("name"));

    }
}