<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div >
	<form method="POST" action="/PMP/protected/pais/crear/guardar" class="form-horizontal" autocomplete="off">
		<div class="">
			<div class="form-group">
				<label class="col-sm-3 control-label">Nombre</label>
				<div class="col-sm-6">
					<form:input path="db_pais.nombre" placeholder="Nombre Pais" class="form-control"/>
					<form:hidden path="db_pais.idPais" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label">Bandera</label>
				<div class="col-sm-7 text-md-center">
					<input class="bndr-selected" type="hidden" id="bandera" name="bandera" value="<c:out value="${db_pais.icono}"/>"/>
					<c:forEach var="bandera" items="${db_banderas}">
						<c:choose>
  							<c:when test="${db_pais.icono==bandera}">
  								<div class="col-md-3 bndr-container bndr-container-selected">
									<img src="/PMP/resources/img/32/${bandera}.png" class="img-sm mar-lft mar-ver" alt="Foto Bandera" style="width: 38px;height: 38px;" />
									<input type="hidden" class="banderaItem" value="${bandera}" />
								</div>
  							</c:when>
  							<c:otherwise>
  								<div class="col-md-3 bndr-container">
									<img src="/PMP/resources/img/32/${bandera}.png" class="img-sm mar-lft mar-ver" alt="Foto Bandera" style="width: 38px;height: 38px;" />
									<input type="hidden" class="banderaItem" value="${bandera}" />
								</div>                         
						  </c:otherwise>
						</c:choose>
					</c:forEach>
				</div>
			</div>
		</div>
	</form>
</div>
