package org.Practica_1_4.proyectoMVC;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class UsuarioMapper implements RowMapper<UsuariosDTO>{

	public UsuariosDTO mapRow(ResultSet rs, int rowNum) throws SQLException{
		
     UsuariosDTO usuario = new UsuariosDTO();
     usuario.setApellidos(rs.getString("apellidos"));
     usuario.setNombre(rs.getString("nombre"));
     usuario.setEmail(rs.getString("email"));
     usuario.setClave(rs.getString("clave"));

return usuario;
}
}