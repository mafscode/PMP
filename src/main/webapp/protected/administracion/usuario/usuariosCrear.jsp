<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="page-title">
	<h1 class="page-header text-overflow">Creación de usuarios</h1>
</div>
<div id="page-content">
	<div class="row">
		<div class="panel">
			<form method="POST" action="/PMP/protected/usuario/crear/guardar" class="form-horizontal" autocomplete="off">
				<div class="panel-body">
					<div class="form-group">
						<label class="col-sm-3 control-label">Nombre</label>
						<div class="col-sm-6">
							<input type="text" placeholder="Nombre Usuario" class="form-control"
								id="nombre" name="nombre">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">E-mail</label>
						<div class="col-sm-6">
							<input type="text" placeholder="E-mail Usuario" class="form-control"
								id="email" name="email" autocomplete="off">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">Password</label>
						<div class="col-sm-6">
							<input type="Password" placeholder="Password" class="form-control"
								id="password" name="password" autocomplete="off">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label">ROL</label>
						<div class="col-sm-6">
							<select class="form-control" id="role" name="role">
								<option value="ROLE_ADMIN">ROLE_ADMIN</option>
								<option value="ROLE_USER">ROLE_USER</option>
							</select>
						</div>
					</div>

				</div>
				<div class="panel-footer">
					<div class="row">
						<div class="col-sm-10 col-sm-offset-5">
							<button class="btn btn-primary" type="submit">Guardar</button>
							&nbsp;&nbsp;&nbsp; <a href="/PMP/protected/usuario/index"
								class="btn btn-primary"> <i
								class="fa fa fa-chevron-left fa-fw"></i> Cancelar
							</a>
						</div>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>