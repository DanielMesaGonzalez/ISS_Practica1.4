package org.Practica_1_4.proyectoMVC;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UsuariosDAO implements UsuarioDAOInterface{
	
	
	private JdbcTemplate jdbcTemplate;
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	    this.jdbcTemplate = jdbcTemplate;
	}
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
	this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void InsertaUsuario(UsuariosDTO usuario) {
		// TODO Auto-generated method stub
		String sql = "insert into usuarios values(?,?,?)";
		Object[ ] parametros = {usuario.getNombre(),usuario.getApellidos(),usuario.getEmail()};
		this.jdbcTemplate.update(sql,parametros);
	}

	@Override
	public List<UsuariosDTO> leeUsuario() {
		String sql= "select * from usuarios";
		UsuarioMapper mapper= new UsuarioMapper();
		@SuppressWarnings("unchecked")
		List<UsuariosDTO> usuarios= this.jdbcTemplate.query(sql, mapper);
		
		return usuarios ;
	}

	@Override
	public void BuscarUsuario() {
		// TODO Auto-generated method stub
		
	}
	
	
}
