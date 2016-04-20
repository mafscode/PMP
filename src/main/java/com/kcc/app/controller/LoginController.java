package com.kcc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kcc.app.helper.estados;
import com.kcc.app.model.Menu;
import com.kcc.app.model.SubMenu;
import com.kcc.app.model.Usuario;
import com.kcc.app.service.MenuService;
import com.kcc.app.service.SubMenuService;
import com.kcc.app.service.UsuarioService;


@Controller
@RequestMapping("/login")

public class LoginController {

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
    public ModelAndView doGet() {
        return new ModelAndView("login");
    }
    @Autowired
    private MenuService mService;
    @Autowired
    private SubMenuService smService;
    @Autowired
    private UsuarioService uService;
    @RequestMapping(value = "/init", method = RequestMethod.GET)
    public ModelAndView init()
    {
    	//init menu service
    	cargaMenus();
    	//init usuario
    	cargausuadmin();
    	return new ModelAndView("init");
    }
    public Menu cargaMenu(String nombre, String icono, String estado, Integer orden, String url)
    {
    	Menu oMenu = new Menu();
        oMenu.setNombre(nombre);
        oMenu.setIcono(icono);
        oMenu.setEstado(estado);
        oMenu.setOrden(orden);
        oMenu.setUrl(url);
        return mService.guardar(oMenu);
    }
    public void cargaSubMenu(String nombre, String icono, String estado, Integer orden, String url, Menu menu)
    {
    	SubMenu oSubmenu = new SubMenu();
    	oSubmenu.setEstado(estado);
    	oSubmenu.setIcono(icono);
    	oSubmenu.setMenu(menu);
    	oSubmenu.setNombre(nombre);
    	oSubmenu.setOrden(orden);
    	oSubmenu.setUrl(url);
    	smService.guardar(oSubmenu);
    }
    public void cargaMenus()
    {
    	Menu oMenu = new Menu();
    	oMenu = cargaMenu("Administracion","cogs",estados.activo.toStr(),5,"/PMP/protected/adminsitracion/index");
    	cargaSubMenu("Pais","cog",estados.activo.toStr(),1,"/PMP/protected/administracion/pais/index",oMenu);
    	cargaSubMenu("Filial","cog",estados.activo.toStr(),2,"/PMP/protected/administracion/filial/index",oMenu);
    	cargaSubMenu("Usuarios","users",estados.activo.toStr(),3,"/PMP/protected/administracion/usuario/index",oMenu);

    	//oMenu = cargaMenu("Metodologias","graduation-cap",estados.activo.toStr(),1,"#");
    	//oMenu = cargaMenu("Politica","legal",estados.activo.toStr(),2,"#");
    	oMenu = cargaMenu("Activos","steam",estados.activo.toStr(),3,"/PMP/protected/activo/index");
    	cargaSubMenu("Registro de Activos","newspaper-o ",estados.activo.toStr(),1,"/PMP/protected/activo/registro/index",oMenu);
    	cargaSubMenu("Análisis de Riesgos","sliders",estados.activo.toStr(),2,"/PMP/protected/activo/analisisriesgo/index",oMenu);
    	cargaSubMenu("Plan de Acción","tasks",estados.activo.toStr(),3,"/PMP/protected/activo/planaccion/index",oMenu);
    	cargaSubMenu("Inventario de activos","cubes",estados.activo.toStr(),4,"/PMP/protected/activo/inventario/index",oMenu);
    	cargaSubMenu("Seguimiento","search",estados.activo.toStr(),5,"/PMP/protected/activo/seguimiento/index",oMenu);

    	//oMenu = cargaMenu("Riesgos","bomb",estados.activo.toStr(),4,"#");

    }
    public void cargausuadmin()
    {
    	Usuario usu = new Usuario();
    	usu.setUsername("admin");
    	usu.setApellido("apellido admin");
    	usu.setCorreo("admin@correo.com");
    	usu.setEstado(estados.activo.toStr());
    	usu.setPassword("123");
    	usu.setIdFilial(1);
    	usu.setGerencia("tecnologia");
    	usu.setNombre("administrador");
    	uService.save(usu);
    	
    }
}