package com.kcc.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/protected/home")

public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView welcome(HttpServletRequest request) {
    	
        return new ModelAndView("welcomePage");
    }
}