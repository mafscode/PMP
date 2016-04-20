<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<header id="navbar">
	<div id="navbar-container" class="boxed">

		<div class="navbar-header">
			<a href="/PMP/protected/home" class="navbar-brand"> <img
				src="img/logo.png" alt="" class="brand-icon">
				<div class="brand-title">
					<span class="brand-text">KOMATSU SA</span>
				</div>
			</a>
		</div>
		<div class="navbar-content clearfix">
			<ul class="nav navbar-top-links pull-left">

				<li class="tgl-menu-btn"><a class="mainnav-toggle" href="#">
						<i class="fa fa-navicon fa-lg"></i>
				</a></li>
				
			</ul>
			<ul class="nav navbar-top-links pull-right">
				<li><a > <span class="lang-selected"> <img
							class="lang-flag" src="/PMP/resources/img/<c:out value="${sessionScope.db_idpais}"/>.png"
							alt="Acceso Chile"><span
							class="lang-name">&nbsp;&nbsp;<c:out value="${sessionScope.dbpais}"/></span>
					</span>
				</a></li>
				<li><a > <input type="hidden" id="session_id_filial" value="<c:out value="${sessionScope.dbfilial}"/>" /> &nbsp;&nbsp;<c:out value="${sessionScope.dbfilial}"/></span>
					</span>
				</a></li>
				<li id="dropdown-user" class="dropdown"><a href="#" aria-expanded="true"
					data-toggle="dropdown" class="dropdown-toggle text-right"> <span
						class="pull-right"> <img
							class="img-circle img-user media-object"
							src="/PMP/resources/img/user_v1.png" alt="Profile Picture">
					</span>
						<div class="username hidden-xs">
							<security:authorize access="isAuthenticated()">
								<security:authentication property="principal.username" />
							</security:authorize>
						</div>
				</a>


					<div
						class="dropdown-menu dropdown-menu-md dropdown-menu-right panel-default">

						<!-- User dropdown menu -->
						<ul class="head-list">
							<li><a href="#"> <i class="fa fa-user fa-fw fa-lg"></i>
									Mi Perfil
							</a></li>
							<li><a href="#"> <i
									class="fa fa-question-circle fa-fw fa-lg"></i> Ayuda
							</a></li>
						</ul>

						<!-- Dropdown footer -->
						<div class="pad-all text-right">
							<a href="<c:url value='/logout' />" class="btn btn-primary">
								<i class="fa fa-sign-out fa-fw"></i> Cerrar Sesión
							</a>
						</div>
					</div></li>

			</ul>
		</div>
	</div>
</header>


