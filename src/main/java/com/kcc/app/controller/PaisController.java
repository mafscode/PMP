package com.kcc.app.controller;

import java.util.ArrayList;
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
import com.kcc.app.model.Pais;
import com.kcc.app.service.PaisService;
import com.kcc.app.viewmodel.PaisVM;
import com.kcc.app.viewmodel.ajaxResponseObj;

@Controller
@RequestMapping(value = "/protected/administracion/pais")
public class PaisController {
	/*PAIS*/
	@Autowired
	private PaisService paisService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)  
	public ModelAndView index() {
		return new ModelAndView("paisList");
	}
	@RequestMapping(value = "/list",method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> listAll( Locale locale) {
		List<PaisVM> lst = paisService.listar();
        return new ResponseEntity<List<PaisVM>>(lst, HttpStatus.OK);
    }
	@RequestMapping(value = "/item", method = RequestMethod.GET)  
	public ModelAndView crear(@RequestParam Integer id) {
		Map<String, Object> model = new HashMap<String, Object>();
		List<String> lstBanderas = new ArrayList<String>();
		lstBanderas.add("cl");
		lstBanderas.add("br");
		lstBanderas.add("mx");
		model.put("db_banderas", lstBanderas);
		if(id.equals(0))
		{
			model.put("db_pais", new PaisVM());
		}
		else
		{
			model.put("db_pais",paisService.buscarVM(id));			
		}
		return new ModelAndView("paisItem", model);
	}
	@RequestMapping(value = "/crear/guardar", method = RequestMethod.POST)  
    public ResponseEntity<?> guardar(@ModelAttribute("command")Pais obj,BindingResult result) {  
		obj.setEstado(estados.activo.toStr());
		paisService.guardar(obj);  
		return new ResponseEntity<ajaxResponseObj>(new ajaxResponseObj("OK", "OK"), HttpStatus.OK);  
    }
	@RequestMapping(value = "/modificar/guardar", method = RequestMethod.POST, produces = "application/json")  
    public ResponseEntity<?> modificar(@ModelAttribute("command")PaisVM obj,BindingResult result) {  
		Pais opais = new Pais();
		opais.setIdPais(obj.getIdPais());
		opais.setNombre(obj.getNombre());
		opais.setIcono(obj.getIcono());
		opais.setEstado(estados.activo.toStr());
		paisService.guardar(opais);  
		return new ResponseEntity<ajaxResponseObj>(new ajaxResponseObj("OK", "OK"), HttpStatus.OK);  
    }
	@RequestMapping(value = "/eliminar/guardar", method = RequestMethod.POST, produces = "application/json")  
    public ResponseEntity<?> elimiar(@ModelAttribute("command")PaisVM obj,BindingResult result) {  
		
		Pais opais = paisService.buscar(obj.getIdPais());
		opais.setEstado(estados.eliminado.toStr());
		paisService.guardar(opais);
		//REVISAR EL BORRADO MASIVO DE WEAS
		
		return new ResponseEntity<ajaxResponseObj>(new ajaxResponseObj("OK", "OK"), HttpStatus.OK);  
    }
}
