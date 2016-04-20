<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="page-title">
	<h1 class="page-header text-overflow">Lista de Paises</h1>
</div>
<div id="page-content">
	<div class="row">
		<div class="panel">
			<div class="panel-body">
				<div class="row">
					<div class="pad-all text-left">
						<a id="btnCrear" href="#" class="btn btn-primary">
							<i class="fa fa-user-plus fa-plus"></i> &nbsp;&nbsp;Crear Pais
						</a>
					</div>
					
				</div>
				
				<table id="tabla" data-toggle="table"
					   data-url="/PMP/protected/administracion/pais/list"
					   data-page-list="[5, 10, 20]"
					   data-page-size="10"
					   data-pagination="true" data-show-pagination-switch="true">
					<thead>
						<tr>
							<th data-field="idPais" data-switchable="false">ID</th>
							<th data-field="nombre" data-sortable="true">Nombre</th>
							<th data-field="icono">logo</th>
						</tr>
					</thead>
				</table>
			</div>
		</div>
	</div>
</div>