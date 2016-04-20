<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<div class="cls-content">
	<div class="cls-content-sm panel">
		<div class="panel-body">
			<p class="pad-btm">Accede al sistema con tu cuenta</p>
			
			<form id="form-login" method="post" action="j_spring_security_check">
				<div class="form-group">
					<div class="input-group">
						<div class="input-group-addon"><i class="fa fa-user"></i></div>
						<input type="text" class="form-control" placeholder="Noombre de usuario" name="j_username" id="j_username">
					</div>
				</div>
				<div class="form-group">
					<div class="input-group">
						<div class="input-group-addon"><i class="fa fa-asterisk"></i></div>
						<input type="password" class="form-control" placeholder="Password" name="j_password" id="j_password">
					</div>
				</div>
			
				<div class="row">
					<div class="col-xs-7">
						
					</div>
					<div class="col-xs-3">
						<div class="form-group text-right">
						<button class="btn btn-success text-uppercase" type="submit" name="submit" id="submit">Acceder</button>
						</div>
					</div>
				</div>
			</form>
		</div>
	</div>
	<div class="pad-ver">
		<a href="#" class="btn-link mar-lft">Recuperar Contraseña</a>
	</div>
</div>
