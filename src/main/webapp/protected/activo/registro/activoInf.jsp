<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="row">
	<div class="col-md-12">
		<form class="form-horizontal activoInformacion" autocomplete="off">
			<div class="row">
				<div class="col-sm-6">
					<div class="form-group">
						<label class="col-sm-4 control-label">Nombre Activo</label>
						<div class="col-sm-8">
							<form:input path="db_activo.nombre" placeholder="Nombre del Activo Información" class="form-control"/>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="form-group">
						<label class="col-sm-4 control-label">Tipo</label>
						<div class="col-sm-8">
							<form:select class="form-control" path="db_activo.idTipoActivo"  >
								<form:option value="0" label="Seleccione"/>
								<form:options items="${db_tipoActivos}" itemValue="idTipoActivo" itemLabel="nombre"/>
							</form:select>
							
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-6">
					<div class="form-group">
						<label class="col-sm-4 control-label">Ubicación</label>
						<div class="col-sm-8">
							<form:input path="db_activo.ubicacion" placeholder="Ubicación del Activo Información" class="form-control"/>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="form-group">
						<label class="col-sm-4 control-label">Propietario</label>
						<div class="col-sm-8">
							<form:input path="db_activo.propietario" placeholder="Propietario del Activo Información" class="form-control"/>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-6">
					<div class="form-group">
						<label class="col-sm-4 control-label">Correo Sponsor</label>
						<div class="col-sm-8">
							<form:input path="db_activo.correoSponsor" placeholder="Correo del Sponsor" class="form-control"/>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="form-group">
						<label class="col-sm-4 control-label">Soporte</label>
						<div class="col-sm-8">
							<form:select class="form-control" path="db_activo.idSoporte"  >
								<form:option value="0" label="Seleccione"/>
								<form:options items="${db_soportes}" itemValue="idSoporte" itemLabel="nombre"/>
							</form:select>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-6">
					<div class="form-group">
						<label class="col-sm-4 control-label">Persona Autorizada</label>
						<div class="col-sm-8">
							<form:input path="db_activo.autorizado" placeholder="Persona Autorizada" class="form-control"/>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="form-group">
						<label class="col-sm-4 control-label">TAG</label>
						<div class="col-sm-8">
							<form:select class="form-control" path="db_activo.idTag"  >
								<form:option value="0" label="Seleccione"/>
								<form:options items="${db_tags}" itemValue="idTag" itemLabel="nombre"/>
							</form:select>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-6">
					<div class="form-group">
						<label class="col-sm-4 control-label">Retención Documento</label>
						<div class="col-sm-8">
							<form:select class="form-control" path="db_activo.idTipoRetencion"  >
								<form:option value="0" label="Seleccione"/>
								<form:options items="${db_retencionDocumento}" itemValue="idRetencionDocumento" itemLabel="nombre"/>
							</form:select>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="form-group">
						<label class="col-sm-4 control-label">Valor Retención</label>
						<div class="col-sm-8">
							<form:input path="db_activo.valorRetencion" placeholder="Valor de la retención" class="form-control"/>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-6">
					<div class="form-group">
						<label class="col-sm-4 control-label">Duración Retención</label>
						<div class="col-sm-8">
							<form:select class="form-control" path="db_activo.idDuracionRetencion"  >
								<form:option value="0" label="Seleccione"/>
								<form:options items="${db_duraRetencion}" itemValue="idDuracionRetencion" itemLabel="nombre"/>
							</form:select>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="form-group">
						<label class="col-sm-4 control-label">Confidencialidad</label>
						<div class="col-sm-8">
							<form:select class="form-control" path="db_activo.idConfidencialidad"  >
								<form:option value="0" label="Seleccione"/>
								<form:options items="${db_confidencialidad}" itemValue="idConfidencialidad" itemLabel="nombre"/>
							</form:select>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-6">
					<div class="form-group">
						<label class="col-sm-4 control-label">Integridad</label>
						<div class="col-sm-8">
							<form:select class="form-control" path="db_activo.idIntegridad"  >
								<form:option value="0" label="Seleccione"/>
								<form:options items="${db_Integridad}" itemValue="idIntegridad" itemLabel="nombre"/>
							</form:select>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="form-group">
						<label class="col-sm-4 control-label">Disponibilidad</label>
						<div class="col-sm-8">
							<form:select class="form-control" path="db_activo.idDisponibilidad"  >
								<form:option value="0" label="Seleccione"/>
								<form:options items="${db_Disponibilidad}" itemValue="idDisponibilidad" itemLabel="nombre"/>
							</form:select>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="form-group">
					<label class="col-sm-4 control-label">Criticidad</label>
					<div class="col-sm-6">
						<form:input path="db_activo.criticidad" placeholder="Valor de la retención" class="form-control"/>
					</div>
				</div>
			</div>
		</form>
	</div>
</div>