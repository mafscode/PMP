<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<nav id="mainnav-container">
	<div id="mainnav">
		<div id="mainnav-menu-wrap">
			<div class="nano">
				<div class="nano-content">
					<ul id="mainnav-menu" class="list-group">

						<!--Category name-->
						<li class="list-header">
						
						<c:forEach var="Menu" items="${sessionScope.dbMenu}">
						    <!--FALTA AGREGAR EL class="active-link" ESO INCLUYE EL QUE EL MENU SE MANTENGA ABIERTO SI ENTRO AL SUBMENU -->
						    <c:choose>
						    	<c:when test="${not empty Menu.subMenus}">
									<li>
										<a href="#"> <i class="fa fa-${Menu.icono}"></i> <span
											class="menu-title"> <strong>${Menu.nombre}</strong>
										</span> <i class="arrow"></i>
										</a> 
										
										<ul class="collapse">
											<c:forEach var="SubMenu" items="${Menu.subMenus}">
									    		<li><a href="${SubMenu.url}">${SubMenu.nombre}</a></li>
											</c:forEach>			
										</ul>
									</li>
					            </c:when>
					            <c:otherwise>
					                <li >
										<a href="${Menu.url}"> <i
											class="fa fa-${Menu.icono}"></i> <span class="menu-title"> <strong>${Menu.nombre}</strong>
										</span>
										</a><i class="arrow"></i>
									</li>
					            </c:otherwise>
						    </c:choose>
						</c:forEach>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</nav>

