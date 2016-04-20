<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="panel" style="margen:25px;">
	<form method="POST" action="/PMP/protected/pais/crear/filialguardar" class="form-horizontal" autocomplete="off">
		<div class="panel-body">
			<div class="form-group">
				<label class="col-sm-3 control-label">Nombre</label>
				<div class="col-sm-6">
					<form:input path="db_filial.glosa" placeholder="Nombre filial" class="form-control"/>
					<form:hidden path="db_filial.idFilial" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-3 control-label">Pais</label>
				<div class="col-sm-6">
					<form:select class="form-control" id="idPais" name="idPais" path="db_filial.idPais" items="${db_paises}" itemValue="idPais" itemLabel="nombre" />
					
				</div>
			</div>
		</div>
	</form>
</div>
