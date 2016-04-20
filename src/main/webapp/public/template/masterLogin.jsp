<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!doctype html>
<html lang="pt-BR">
<head>
        <title><spring:message  code="project.title" /></title>
        <link href="<c:url value='/resources/css/bootstrap.min.css'  />" rel="stylesheet"/>
        <link href="<c:url value='/resources/css/nifty.min.2.3.css'  />" rel="stylesheet"/>
		<link href="<c:url value='/resources/css/page.login.css'  />" rel="stylesheet"/>
        
        <link href="<c:url value='/resources/plg/font-awesome/css/font-awesome.min.css'  />" rel="stylesheet"/>
		<link href="<c:url value='/resources/css/bootstrapValidator.min.css'  />" rel="stylesheet"/>
		
        <link href="<c:url value='/resources/plg/pace/pace.min.css'  />" rel="stylesheet"/>
        <script src="<c:url value='/resources/plg/pace/pace.min.js' />"></script>
    </head>
    <body>
        <div id="container" class="cls-container">
        	<div id="bg-overlay" class="bg-img" style="background-image : url('/PMP/resources/img/bg-img/wallhaven-182976.jpg')"></div>
        	<div class="cls-header cls-header-lg">
				<div class="cls-brand">
					<a class="box-inline" href="/">
						<span class="brand-title">Portal de Metodologias y Politicas <span class="text-thin">Komatsu</span></span>
					</a>
				</div>
			</div>
            <tiles:insertAttribute name="body" />
        </div>
        
		<script src="<c:url value='/resources/js/jquery-2.1.1.min.js' />"></script>
        <script src="<c:url value='/resources/js/bootstrap.min.js' />"></script>
        <script src="<c:url value='/resources/js/bootstrapValidator.min.js' />"></script>
        <script src="<c:url value='/resources/js/pages/login.js' />"></script>
    </body>
</html>