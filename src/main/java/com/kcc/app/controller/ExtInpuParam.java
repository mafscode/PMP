package com.kcc.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.kcc.app.model.Menu;
import com.kcc.app.service.MenuService;


public class ExtInpuParam extends UsernamePasswordAuthenticationFilter {

	private String extraParameter = "j_region";
	private String delimiter = ":";
	@Autowired
	private MenuService menuRepo;

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException {
		/** AGREGAR VARIABLE DE SESSION PARA CONSTRUIR EL MENU AGREGAR LOGICA EN BASE AL USUARIO**/
		
		/* >BUSCA EL USUARIO*/
		List<Menu> lst = menuRepo.listar();
		request.getSession().setAttribute("dbpais", "CHILE");
		request.getSession().setAttribute("db_idpais", "cl");
		request.getSession().setAttribute("dbfilial", "Komatsu Cummins Chile");
		request.getSession().setAttribute("db_idfilial", "1");
		request.getSession().setAttribute("dbMenu", lst);
		
		return super.attemptAuthentication(request, response);
	}

	/**
	 * @return The parameter name which will be used to obtain the extra input
	 *         from the login request
	 */
	public String getExtraParameter() {
		return this.extraParameter;
	}

	/**
	 * @param extraParameter
	 *            The parameter name which will be used to obtain the extra
	 *            input from the login request
	 */
	public void setExtraParameter(String extraParameter) {
		this.extraParameter = extraParameter;
	}

	/**
	 * @return The delimiter string used to separate the username and extra
	 *         input values in the string returned by obtainUsername()
	 */
	public String getDelimiter() {
		return this.delimiter;
	}

	/**
	 * @param delimiter
	 *            The delimiter string used to separate the username and extra
	 *            input values in the string returned by obtainUsername()
	 */
	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}

}
