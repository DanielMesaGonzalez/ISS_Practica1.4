package org.Practica_1_4.proyectoMVC;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.core.JdbcTemplate;

public class UsuariosDAO implements UsuarioDAOInterface{
	
	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;
	public void setDataSource(DataSource dataSource) {
	this.dataSource = dataSource;
	this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void InsertaUsuario(UsuariosDTO usuario) {
		// TODO Auto-generated method stub
		String sql = "insert into usuarios values(?,?)";
		Object[ ] parametros = {usuario.getId(),usuario.getNombre()};
		this.jdbcTemplate.update(sql,parametros);
	}

	@Override
	public List<UsuariosDTO> leeUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void BuscarUsuario() {
		// TODO Auto-generated method stub
		
	}
	
	
}
