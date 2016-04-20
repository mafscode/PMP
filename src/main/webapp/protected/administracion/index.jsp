<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="page-title">
	<h1 class="page-header text-overflow">Administración del Sistema</h1>
</div>
<div id="page-content">
	<div class="row" style="margin: 0px 50px 0px 50px">
		<c:forEach var="SubMenu" items="${db_listado.subMenus}">
    		<div class="col-md-2 col-md-offset-1">
		    	<a href="${SubMenu.url}">
	            <div class="mar-btm" style="cursor:pointer;width: 236px;">
	                <div class="text-center">
	                    <br />
	                    <span class=" icon-wrap"><i class="fa fa-${SubMenu.icono}" style="font-size: 7em"></i></span>
	                    <br />
	                    <p class="text-uppercase mar-btm text-sm">${SubMenu.glosa}</p>
	                    <br/>
	                </div>
	            </div>
	            </a>
	        </div>
		</c:forEach>
	</div>					
</div>