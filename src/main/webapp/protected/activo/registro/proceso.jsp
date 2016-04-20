<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<div id="activo-inf-wz">
	<div class="wz-heading">
		<!--Progress bar-->
		<div class="progress progress-sm progress-light-base">
			<div class="progress-bar progress-bar-primary"></div>
		</div>
		<!--Nav-->
		<ul class="wz-nav-off">
			<li class="col-xs-3">
				<a id="primero" data-toggle="tab" href="#activo-inf-tab1" title="Proceso" class="add-tooltip"
				 aria-describedby="tooltip44023">
					<span class="icon-wrap icon-wrap-sm icon-circle bg-mint">
						<i class="wz-icon fa fa-cog fa-2x"></i>
						<i class="wz-icon-done fa fa-check fa-2x"></i>
					</span>
				</a>
			</li>
			<li class="col-xs-3">
				<a data-toggle="tab" href="#activo-inf-tab2" title="Sub Proceso" class="add-tooltip">
					<span class="icon-wrap icon-wrap-sm icon-circle bg-info">
					<i class="wz-icon fa fa-cogs fa-2x"></i>
					<i class="wz-icon-done fa fa-check fa-2x"></i>
				</span>
				</a>
			</li>
			<li class="col-xs-3">
				<a data-toggle="tab" href="#activo-inf-tab3" title="Activos Creados" class="add-tooltip">
					<span class="icon-wrap icon-wrap-sm icon-circle bg-warning">
					<i class="wz-icon fa fa-list-ul fa-2x"></i>
					<i class="wz-icon-done fa fa-check fa-2x"></i>
				</span>
				</a>
			</li>
			<li class="col-xs-3">
				<a data-toggle="tab" href="#activo-inf-tab4" title="Activo de Información" class="add-tooltip">
					<span class="icon-wrap icon-wrap-sm icon-circle bg-success">
					<i class="wz-icon fa fa-newspaper-o fa-2x"></i>
					<i class="wz-icon-done fa fa-check fa-2x"></i>
				</span>
				</a>
			</li>
		</ul>
	</div>

	<!--Form-->
	<form id="activo-inf-wz-form" class="form-horizontal">
		<div class="panel-body">
			<div class="tab-content">

				<!--First tab-->
				<div id="activo-inf-tab1" class="tab-pane">
					<div class="form-group">
						<label class="col-sm-4 control-label">Proceso</label>
						<div class="col-sm-6">
							<form:input path="db_activo.proceso" placeholder="Nombre Proceso" class="form-control"/>
							<form:hidden path="db_activo.idProceso" />
						</div>
					</div>
				</div>

				<!--Second tab-->
				<div id="activo-inf-tab2" class="tab-pane fade">
					<div class="form-group subProceso">
						<label class="col-sm-4 control-label">Sub Proceso</label>
						<div class="col-sm-6">
							<form:input path="db_activo.subProceso" placeholder="Nombre Sub Proceso" class="form-control"/>
							<form:hidden path="db_activo.idSubProceso" />
						</div>
					</div>
				</div>

				<!--Third tab-->
				<div id="activo-inf-tab3" class="tab-pane">
					<table id="tablaActivos" data-toggle="table"
					   data-show-columns="false"
					   data-page-list="[5, 10, 20]"
					   data-page-size="10"
					   data-pagination="true" data-show-pagination-switch="true">
						<thead>
							<tr>
								<th data-field="idActivo" data-switchable="false">ID</th>
								<th data-field="nombre">Nombre</th>
								<th data-field="propietario">Propietario</th>
								<th data-field="criticidad">Criticidad</th>
							</tr>
						</thead>
					</table>
				</div>

				<!--Fourth tab-->
				<div id="activo-inf-tab4" class="tab-pane  mar-btm text-center">
					
				</div>
			</div>
		</div>
	</form>
	<div class="modal-falso-footer">
		<button type="button" class="previous btn btn-primary">Anterior</button>
		<button type="button" class="save-process btn btn-primary next" data-target="#activo-inf-wz">Guardar Proceso</button>		
		<button type="button" class="save-subprocess btn btn-primary next" style="display:none" data-target="#activo-inf-wz">Guardar Subproceso</button>
		<button type="button" class="agregar-activo btn btn-primary next" style="display:none" data-target="#activo-inf-wz">Agregar Activo</button>
		<button type="button" class="crear-activo btn btn-primary" style="display:none" data-target="#activo-inf-wz">Guardar Activo</button>
		<button type="button" class="finish btn btn-warning" disabled>Terminar</button>
	</div>
</div>