<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="page-title">
	<h1 class="page-header text-overflow">BIENVENIDO SEÑOR USUARIO DEL AVERNO</h1>
</div>
<div id="page-content">
	
	<div class="row" style="margin: 0px 50px 0px 50px">
		<c:forEach var="Menu" items="${sessionScope.dbMenu}">
		    <div class="col-md-2 col-md-offset-1">
		    	<a href="${Menu.url}">
	            <div class="mar-btm" style="cursor:pointer;width: 236px;">
	                <div class="text-center">
	                    <br />
	                    <span class=" icon-wrap"><i class="fa fa-${Menu.icono}" style="font-size: 7em"></i></span>
	                    <br />
	                    <p class="text-uppercase mar-btm text-sm">${Menu.nombre}</p>
	                    <br/>
	                </div>
	            </div>
	            </a>
	        </div>
		</c:forEach>
	</div>					
</div>