package com.kcc.app.controller;


import java.util.HashMap;  
import java.util.List;  
import java.util.Map; 

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.servlet.ModelAndView;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.util.Locale;

import com.kcc.app.helper.estados;
import com.kcc.app.model.Usuario;
import com.kcc.app.service.*;

import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.validation.BindingResult; 

@Controller
@RequestMapping(value = "/protected/administracion/usuario")
public class UsuarioController {
	@Autowired  
	private UsuarioService usuarioService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)  
	public ModelAndView welcome() {
		Map<String, Object> model = new HashMap<String, Object>();
		List<Usuario> usu = usuarioService.listar();
		model.put("usuarios",  usu);  
		return new ModelAndView("usuariosList", model);
	}
	@RequestMapping(value = "/crear", method = RequestMethod.GET)  
	public ModelAndView crear() {
		
		return new ModelAndView("usuariosCrear");
	}
	@RequestMapping(value = "/crear/guardar", method = RequestMethod.POST)  
    public ModelAndView guardar(@ModelAttribute("command")Usuario usu,BindingResult result) {  
		usu.setEstado(estados.activo.toStr());
		usuarioService.save(usu);  
      return new ModelAndView("usuariosList");  
    }  
    
	@RequestMapping(value = "/list",method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> listAll( Locale locale) {
    	List<Usuario> lstUsu = usuarioService.listar();
        return new ResponseEntity<List<Usuario>>(lstUsu, HttpStatus.OK);
    }
    
}
