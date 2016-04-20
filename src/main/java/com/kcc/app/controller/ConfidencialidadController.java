package com.kcc.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kcc.app.model.Confidencialidad;
import com.kcc.app.service.ConfidencialidadService;
import com.kcc.app.viewmodel.ConfidencialidadVM;

@Controller
@RequestMapping(value = "/public/confidencialidad")
public class ConfidencialidadController {

	@Autowired
	private ConfidencialidadService confSer;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)  
	public ResponseEntity<?> list() {
		List<ConfidencialidadVM> lst = new ArrayList<ConfidencialidadVM>();
		for(Confidencialidad conf : confSer.listar())
			lst.add(new ConfidencialidadVM(conf));
		
		return new ResponseEntity<List<ConfidencialidadVM>>(lst, HttpStatus.OK); //(proceService.listar(), HttpStatus.OK); 
	}
}
