package com.kcc.app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kcc.app.model.Menu;

@Controller
@RequestMapping(value = "/protected/adminsitracion")
public class AdminsitracionController {
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/index", method = RequestMethod.GET)  
	public ModelAndView index(HttpServletRequest request) {
		List<Menu> lst = new ArrayList<Menu>();
		lst = (List<Menu>)request.getSession().getAttribute("dbMenu");
		
		Map<String, Object> model = new HashMap<String, Object>();
		for(Menu oMenu : lst)
			if(oMenu.getIdMenu() == 1){
				model.put("db_listado",  oMenu);
				break;
			}
		return new ModelAndView("administracionIndex", model);
	}
}
