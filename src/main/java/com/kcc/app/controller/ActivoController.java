package com.kcc.app.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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
import com.kcc.app.model.ActivoInformacion;
import com.kcc.app.model.Proceso;
import com.kcc.app.model.SubProceso;
import com.kcc.app.service.ActivoInformacionService;
import com.kcc.app.service.ConfidencialidadService;
import com.kcc.app.service.DisponibilidadService;
import com.kcc.app.service.DuracionRetencionService;
import com.kcc.app.service.IntegridadService;
import com.kcc.app.service.ProcesoService;
import com.kcc.app.service.RetencionDocumentoService;
import com.kcc.app.service.SoporteService;
import com.kcc.app.service.SubProcesoService;
import com.kcc.app.service.TagService;
import com.kcc.app.service.TipoActivoService;
import com.kcc.app.viewmodel.ActivoInformacionVM;
import com.kcc.app.viewmodel.ProcesoVM;
import com.kcc.app.viewmodel.ajaxResponseObj;

@Controller
@RequestMapping(value = "/protected/activo")
public class ActivoController {

	@Autowired
	private ActivoInformacionService actService;
	
	@Autowired
	private ProcesoService proceService;
	
	@Autowired
	private SubProcesoService subproceService;
	
	@Autowired
	private TipoActivoService tipoActService;
	
	@Autowired
	private SoporteService soporteService;
	
	@Autowired
	private TagService tagService;
	
	@Autowired
	private RetencionDocumentoService retencionDocuService;
	
	@Autowired
	private DuracionRetencionService duraRetencionService;
	
	@Autowired
	private ConfidencialidadService confiService;
	
	@Autowired
	private IntegridadService inteService;
	
	@Autowired
	private DisponibilidadService dispoService;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)  
	public ModelAndView index() {
		
		return new ModelAndView("activoIndex");
	}
	
	@RequestMapping(value = "/registro/index", method = RequestMethod.GET)  
	public ModelAndView registroIndex() {
		return new ModelAndView("activoRegistroIndex");
	}
	
	@RequestMapping(value = "/registro/proceso", method = RequestMethod.GET)  
	public ModelAndView creaProceso() {
		ActivoInformacionVM obj = new ActivoInformacionVM();
		
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("db_activo",  obj); 
		return new ModelAndView("activoRegistroProceso", model);
	}
	@RequestMapping(value = "/registro/proceso/guardar", method = RequestMethod.POST)  
	public ResponseEntity<?> guardarProceso(@ModelAttribute("command")Proceso obj,BindingResult result,HttpServletRequest request) {
		try
		{
			obj.setIdFilial(Integer.parseInt(request.getSession().getAttribute("db_idfilial").toString()));
			obj.setEstado(estados.activo.toStr());
			Proceso rsp = proceService.guardar(obj);
			return new ResponseEntity<ajaxResponseObj>(new ajaxResponseObj("OK", "OK", rsp.getIdProceso()), HttpStatus.OK);
		}
		catch(Exception ex)
		{
			return new ResponseEntity<ajaxResponseObj>(new ajaxResponseObj("ERROR", ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@RequestMapping(value = "/registro/subproceso/guardar", method = RequestMethod.POST)  
	public ResponseEntity<?> guardarSubProceso(@ModelAttribute("command")SubProceso obj,BindingResult result,HttpServletRequest request) {
		try
		{
			obj.setEstado(estados.activo.toStr());
			SubProceso rsp = subproceService.guardar(obj);
			return new ResponseEntity<ajaxResponseObj>(new ajaxResponseObj("OK", "OK", rsp.getIdSubProceso()), HttpStatus.OK);
		}
		catch(Exception ex)
		{
			return new ResponseEntity<ajaxResponseObj>(new ajaxResponseObj("ERROR", ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@RequestMapping(value = "/registro/activoinf", method = RequestMethod.GET)  
	public ModelAndView creaActivoInformacion() {
		ActivoInformacion obj = new ActivoInformacion();
		
		Map<String, Object> model = new HashMap<String, Object>();		
		model.put("db_tipoActivos", tipoActService.listar());
		model.put("db_soportes", soporteService.listar());
		model.put("db_tags", tagService.listar());
		model.put("db_retencionDocumento",  retencionDocuService.listar());
		model.put("db_duraRetencion",  duraRetencionService.listar());		
		model.put("db_confidencialidad",  confiService.listar());
		model.put("db_Integridad",  inteService.listar());
		model.put("db_Disponibilidad", dispoService.listar());
		model.put("db_activo",  obj);
		return new ModelAndView("activoRegistroActivoInf", model);
	}
	@RequestMapping(value = "/registro/guardar", method = RequestMethod.POST)
	public ResponseEntity<?> guardar(@ModelAttribute("command")ActivoInformacion obj,BindingResult result,HttpServletRequest request) {
		try
		{
			obj.setEstado(estados.activo.toStr());
			ActivoInformacion rsp = actService.guardar(obj);
			return new ResponseEntity<ajaxResponseObj>(new ajaxResponseObj("OK", "OK", rsp.getSubProceso().getIdSubProceso()), HttpStatus.OK);
		}
		catch(Exception ex)
		{
			return new ResponseEntity<ajaxResponseObj>(new ajaxResponseObj("ERROR", ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@RequestMapping(value = "/registro/proceso/list", method = RequestMethod.GET)  
	public ResponseEntity<?> listProceso() {
		
		return new ResponseEntity<List<Proceso>>(proceService.listar(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/registro/subproceso/list", method = RequestMethod.GET)  
	public ResponseEntity<?> listSubProceso() {

		return new ResponseEntity<List<ProcesoVM>>(subproceService.listarVM(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/registro/list", method = RequestMethod.GET)  
	public ResponseEntity<?> list(@RequestParam  Integer idsubproceso) {
		
		return new ResponseEntity<List<ActivoInformacion>>(actService.listar(idsubproceso), HttpStatus.OK); //(proceService.listar(), HttpStatus.OK); 
	}
}
