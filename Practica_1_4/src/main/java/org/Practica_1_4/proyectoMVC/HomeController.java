package org.Practica_1_4.proyectoMVC;


import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



/**
 * Handles requests for the application home page.
 */

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	private UsuariosDAO dao= new UsuariosDAO();
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "home";
	}
	
	@RequestMapping(value = "/Registro", method = RequestMethod.POST)
	public String registropost(HttpServletRequest request,Locale locale, Model model) {
		HttpSession sesion = request.getSession();
	    String nombre= (String)request.getParameter("username");
	    String apellido= (String)request.getParameter("surname");
	    String email= (String)request.getParameter("email");
	    UsuariosDTO user=new UsuariosDTO(nombre, apellido, email);
	    sesion.setAttribute("nusuario", user);
	    request.setAttribute("nusuario", user);
	    dao.InsertaUsuario(user);
		return "sesion";
	}
	
	@RequestMapping(value = "/Registro", method = RequestMethod.GET)
	public String registroget(HttpServletRequest request,Locale locale, Model model) {
		if(request.getSession(false)!=null) {
			request.getSession(false).setMaxInactiveInterval(3);
			return "sesion";
			}
			else {
		    return "caduca";
			}
		
	}
	
	
	@RequestMapping(value = "/Sesion3", method = RequestMethod.POST)
	public String sesion(@RequestParam("usuario") String usuario,@RequestParam("clave") String passwd,HttpServletRequest req,Locale locale, Model model) {
		//String usuario=req.
		//String passwd=req.getParameter("clave");
		//String url="";
		UsuariosDTO db= new UsuariosDTO();
		
		
		if(db.checkAdmin(usuario,passwd)) {
			
			List<UsuariosDTO> a=dao.leeUsuario();
			
			return"admin";
			
			
		}else {
			return "registro";
			}
		//return "sesion";
		
	}
	
}
