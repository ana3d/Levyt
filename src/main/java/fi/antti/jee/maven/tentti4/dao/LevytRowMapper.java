package fi.antti.jee.maven.tentti4.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.antti.jee.maven.tentti4.bean.Levyt;

public class LevytRowMapper implements RowMapper<Levyt> {
	
	public Levyt mapRow(ResultSet rs, int rowNum) throws SQLException {
		Levyt l = new Levyt();
		l.setId(rs.getInt("id"));
		l.setArtisti(rs.getString("artisti"));
		l.setAlbumi(rs.getString("albumi"));
		l.setFormaatti(rs.getString("formaatti"));
		
		return l;
	}

}
