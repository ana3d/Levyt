package fi.antti.jee.maven.tentti4.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import fi.antti.jee.maven.tentti4.bean.Levyt;

public class LevyDAO {
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void talleta(Levyt l) {
		String sql = "insert into levyt(artisti, albumi, formaatti) values(?,?,?)";
		Object[] parametrit = new Object[] { l.getArtisti(), l.getAlbumi(), l.getFormaatti() };

		jdbcTemplate.update(sql, parametrit);

	}

	public Levyt etsi(int id) {
		String sql = "select artisti, albumi, formaatti, id from levyt where id = ?";
		Object[] parametrit = new Object[] { id };
		RowMapper<Levyt> mapper = new LevytRowMapper();

		Levyt l = jdbcTemplate.queryForObject(sql, parametrit, mapper);
		return l;

	}

	public List<Levyt> haeKaikki() {

		String sql = "select id, artisti, albumi, formaatti from levyt";
		RowMapper<Levyt> mapper = new LevytRowMapper();
		List<Levyt> henkilot = jdbcTemplate.query(sql, mapper);

		return henkilot;
	}
	

}
