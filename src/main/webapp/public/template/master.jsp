<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<tiles:importAttribute name="css"/>
<tiles:importAttribute name="javascripts"/>
<tiles:importAttribute name="javascripts2"/>

<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title></title>
<c:forEach var="css_item" items="${css}">
     <link href="<c:url value="${css_item}"/>" rel="stylesheet" />
</c:forEach>
 
<link href="<c:url value='/resources/plg/pace/pace.min.css'  />" rel="stylesheet" />
<script src="<c:url value='/resources/plg/pace/pace.min.js' />"></script>
</head>
<body>
	<div id="container" class="mainnav-lg">

		<tiles:insertAttribute name="header" />
		<div class="boxed">
			<div id="content-container">
				<tiles:insertAttribute name="body" />
			</div>
			
			<tiles:insertAttribute name="footer" />
		</div>		
	</div>

    <c:forEach var="script" items="${javascripts2}">
        <script src="<c:url value="${script}"/>"></script>
    </c:forEach>
	<c:forEach var="script" items="${javascripts}">
        <script src="<c:url value="${script}"/>"></script>
    </c:forEach>
    
	    
</body>
</html>