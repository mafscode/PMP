<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="row">
	<div class="col-md-12">
		<form class="form-horizontal" autocomplete="off">
				<div class="form-group">
					<label class="col-sm-4 control-label">Sub Proceso</label>
					<div class="col-sm-6">
						<form:input path="db_activo.subProceso" placeholder="Nombre Sub Proceso" class="form-control"/>
						<form:hidden path="db_activo.idSubProceso" />
					</div>
				</div>

		</form>
	</div>
</div>
