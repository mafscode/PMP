<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="page-title">
	<h1 class="page-header text-overflow">Registros de Activos</h1>
</div>
<div id="page-content">
	<div class="row">
		<div class="panel">
			<div class="panel-body">
				<div class="row">
					<div class="pad-all text-left">
						<a id="btnNuevoProceso" href="#" class="btn btn-default" style="margin-right:10px">
							<i class="fa icon-3x fa fa-plus-square"></i>
							<p>
								Proceso
							</p>
							
						</a>
					</div>
					
				</div>
				
				<table id="table" 
					data-group-by="true" 
					data-group-by-field="[subproceso,proceso]" 
					data-search="true" 
					data-page-list="[5, 10, 20]"
					data-page-size="20"
					data-pagination="true" 
					data-show-pagination-switch="true">
    				<thead>
					    <tr>
					        <th data-field="proceso" data-sortable="true">Proceso</th>
					        <th data-field="subproceso" data-sortable="true">Sub Proceso</th>
					        <th data-field="activo">Activo de Información</th>
					        <th data-field="propietario">Propietario</th>
					        <th data-field="correosponsor">Soponsor</th>
					        <th data-field="criticidad">Criticidad</th>
					    </tr>
				    </thead>
				</table>
			</div>
		</div>
	</div>
</div>