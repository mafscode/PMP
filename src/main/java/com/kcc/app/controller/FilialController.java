package com.kcc.app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kcc.app.helper.estados;
import com.kcc.app.model.Filial;
import com.kcc.app.model.Pais;
import com.kcc.app.service.FilialService;
import com.kcc.app.service.PaisService;
import com.kcc.app.viewmodel.FilialVM;
import com.kcc.app.viewmodel.ajaxResponseObj;

@Controller
@RequestMapping(value = "/protected/administracion/filial")
public class FilialController {

	@Autowired
	private FilialService filialService;
	
	@Autowired
	private PaisService paisService;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)  
	public ModelAndView filialindex() {
		return new ModelAndView("filialList");
	}
	@RequestMapping(value = "/listar",method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> filiallistar( Locale locale) {
    	List<FilialVM> lst = filialService.listar();
        return new ResponseEntity<List<FilialVM>>(lst, HttpStatus.OK);
    }
	@RequestMapping(value = "/item", method = RequestMethod.GET)  
	public ModelAndView filialcrear(@RequestParam Integer id) {
		Map<String, Object> model = new HashMap<String, Object>();
		
		model.put("db_paises",  paisService.listar());
		if(id.equals(0))
		{
			model.put("db_filial", new FilialVM());
		}
		else
		{
			
			model.put("db_filial",filialService.buscar(id));
		}
		return new ModelAndView("filialItem", model);
	}
	@RequestMapping(value = "/crear/guardar", method = RequestMethod.POST, produces = "application/json")  
    public ResponseEntity<?> filialCrear(@ModelAttribute("command")FilialVM obj,BindingResult result) {  
		
		Filial oFilial = new Filial();
		oFilial.setIdFilial(obj.getIdFilial());
		oFilial.setNombre(obj.getGlosa());
		oFilial.setEstado(estados.activo.toStr());
		Pais opais = new Pais();
		opais.setIdPais(obj.getIdPais());
		oFilial.setPais(opais);
		filialService.guardar(oFilial);  
		return new ResponseEntity<ajaxResponseObj>(new ajaxResponseObj("OK", "OK"), HttpStatus.OK);  
    }
	@RequestMapping(value = "/modificar/guardar", method = RequestMethod.POST, produces = "application/json")  
    public ResponseEntity<?> filialModificar(@ModelAttribute("command")FilialVM obj,BindingResult result) {  
		
		Filial oFilial = new Filial();
		oFilial.setIdFilial(obj.getIdFilial());
		oFilial.setNombre(obj.getGlosa());
		oFilial.setEstado(estados.activo.toStr());
		Pais opais = new Pais();
		opais.setIdPais(obj.getIdPais());
		oFilial.setPais(opais);
		filialService.guardar(oFilial);  
		return new ResponseEntity<ajaxResponseObj>(new ajaxResponseObj("OK", "OK"), HttpStatus.OK);  
    }
	@RequestMapping(value = "/eliminar/guardar", method = RequestMethod.POST, produces = "application/json")  
    public ResponseEntity<?> filialElimiar(@ModelAttribute("command")FilialVM obj,BindingResult result) {  
		
		Filial oFilial = new Filial();
		oFilial.setIdFilial(obj.getIdFilial());
		oFilial.setNombre(obj.getGlosa());
		oFilial.setEstado(estados.eliminado.toStr());
		Pais opais = new Pais();
		opais.setIdPais(obj.getIdPais());
		oFilial.setPais(opais);
		filialService.guardar(oFilial);  
		return new ResponseEntity<ajaxResponseObj>(new ajaxResponseObj("OK", "OK"), HttpStatus.OK);  
    }
}
