<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="page-title">
	<h1 class="page-header text-overflow">Lista de Usuarios</h1>
</div>
<div id="page-content">
	<div class="row">
		<div class="panel">
			<div class="panel-body">
				<div class="row">
					<div class="pad-all text-right">
						<a href="/PMP/protected/usuario/crear" class="btn btn-primary">
							<i class="fa fa-user-plus fa-fw"></i> Crear Usuario
						</a>
					</div>
					
				</div>
				
				<table data-toggle="table"
					   data-url="/PMP/protected/administracion/usuario/list"
					   data-show-columns="false"
					   data-page-list="[5, 10, 20]"
					   data-page-size="10"
					   data-pagination="true" data-show-pagination-switch="true">
					<thead>
						<tr>
							<th data-field="idUsuario" data-switchable="false">ID</th>
							<th data-field="nombre">Nombre</th>
							<th data-field="email">E-Mail</th>
							<th data-field="password">Contraseña</th>
							<th data-field="estado" data-visible="true">Status</th>
							<th data-field="role">Rol</th>
						</tr>
					</thead>
				</table>
			</div>
		</div>
	</div>
</div>