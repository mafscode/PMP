/**
 * TODO:AGREGAR DIFERENCIADOR DE EDICION Y DE CREACION
*/
$(document).ready(function () {
	//GRILLA
	AsyncGt('/PMP/protected/activo/registro/subproceso/list', { id: 0 }, function (data) {
		$('#table').bootstrapTable({
	        data: data
	    });

		var $table = $('#table');

	  	$table.on('click-row.bs.table', function (e, row, $element) {
	  			if(!$($element).hasClass( 'branch' ))
	  			{
	  				$('.success').removeClass('success');
			    	$($element).addClass('success');
			    	alert(getSelectedRow().idproceso); 	
	  			}
		  		
		  	});
	    function getSelectedRow() {
		    var index = $table.find('tr.success').data('index');
		    return $table.bootstrapTable('getData')[index];
		}
	});
	//init
	var isValid;
	$('#btnNuevoProceso').click(function (){
		AsyncGt('/PMP/protected/activo/registro/proceso', { id: 0 }, function (data) {
		    var vtnProceso = bootbox.dialog({
		        title: 'Registro Proceso',
		        size:'large',
		        message: data
		    });
		    wizardInit();
		    $('.agregar-activo').click(function () {
				//CARGA FORMULARIO DE ACTIVOS DE INFORMACION
				$('#activo-inf-tab4').html('');
				AsyncGt('/PMP/protected/activo/registro/activoinf', { id: 0 }, function (data) {
					$('#activo-inf-tab4').append(data);
				});
			});
		    
		    $('.save-process').click(function () {
				var oProceso = {
					idProceso: $('#idProceso').val(),
					glosa: $('#proceso').val()
				};
				AsyncPst('/PMP/protected/activo/registro/proceso/guardar', $.postify(oProceso), function (data) {
					if(data.estado == "OK")
					{
						$.niftyNoty({
            		        type: 'success',
            		        container: '.bootbox-body',
            		        icon: faIcon.valid,
            		        title: 'Proceso',
            		        message: 'Proceso creado exitosamente',
            		        timer: 3000
            		    });
						$('#activo-inf-wz').find('.previous').prop('disabled', true);
						$('#idProceso').val(data.idObjeto);
						$('#save-process').hide();
					}
					else
					{
						$.niftyNoty({
            		        type: 'danger',
            		        icon: faIcon.invalid,
            		        container: '.bootbox-body',
            		        title: 'ERROR al tratar de guardar el proceso',
            		        message: data.mensaje,
            		        timer: 5000
            		    });
						$('#activo-inf-wz').bootstrapWizard('previous');
					}
				}, $(this));
		    });
		    validaWZ();
    	});
	});
	//
	function wizardInit()
	{
		$('#activo-inf-wz').bootstrapWizard({
			tabClass		: 'wz-steps',
			nextSelector	: '.next',
			previousSelector	: '.previous',
			onTabClick: function(tab, navigation, index) {
				return false;
			},
			onInit : function(){
				$('#activo-inf-wz').find('.finish').hide().prop('disabled', true);
				
			},
			onTabShow: function(tab, navigation, index) {
				var $total = navigation.find('li').length;
				var $current = index+1;
				var $percent = (index/$total) * 100;
				var margin = (100/$total)/2;
				$('#activo-inf-wz').find('.progress-bar').css({width:$percent+'%', 'margin': 0 + 'px ' + margin + '%'});

				navigation.find('li:eq('+index+') a').trigger('focus');


				// If it's the last tab then hide the last button and show the finish instead
				if($current >= $total) {
					$('#activo-inf-wz').find('.next').hide();
					$('#activo-inf-wz').find('.finish').show();
					$('#activo-inf-wz').find('.finish').prop('disabled', false);
					$('#activo-inf-wz').find('.save').show();
				} else {
					$('#activo-inf-wz').find('.next').show();
					$('#activo-inf-wz').find('.finish').hide().prop('disabled', true);
					$('#activo-inf-wz').find('.save').hide();
				}
				if($current == 2)//guarda proceso
				{
					
				}
				if($current == 3)
				{
					//GUARDA SUBPROCESO
					$('.agregar-activo').show();					
				}
				if($current == 4)
				{
					$('.crear-activo').show();
				}
				if($current == 5)
				{
					
				}
			},
			onNext: function(){
				isValid = null;
				$('#activo-inf-wz-form').bootstrapValidator('validate');

				if(isValid === false)return false;
			}
		});
		nifty.document.trigger('nifty.ready');
		setTimeout(function () {$('.wz-nav-off').find('li:eq(0) a').trigger('focus');}, 1000);
		
		$('.save-subprocess').click(function () {
			var oSubProceso = {
				
				idSubProceso: $('#idSubProceso').val(),
				nombre: $('#subProceso').val(),
				proceso: {
					idProceso: $('#idProceso').val(),
					glosa: $('#proceso').val(),
				}
			};
			AsyncPst('/PMP/protected/activo/registro/subproceso/guardar', $.postify(oSubProceso), function (data) {
				if(data.estado == "OK")
				{
					$.niftyNoty({
        		        type: 'success',
        		        container: '.bootbox-body',
        		        icon: faIcon.valid,
        		        title: 'Sub proceso',
        		        message: 'Sub proceso creado exitosamente',
        		        timer:3000
        		    });
					$('#activo-inf-wz').find('.previous').prop('disabled', true);
					$('#idSubProceso').val(data.idObjeto);
					
					//CARGA LISTADO DE ACTIVOS PARA EL SUBPROCESO
					$('#tablaActivos').bootstrapTable({
							url:'/PMP/protected/activo/registro/list',
							queryParams: { idsubproceso: $('#idSubProceso').val()
						}
					});
					$('#tablaActivos').bootstrapTable('refresh');
				}
				else
				{
					$.niftyNoty({
        		        type: 'danger',
        		        icon: faIcon.invalid,
        		        container: '.bootbox-body',
        		        title: 'ERROR al tratar de guardar el sub proceso',
        		        message: data.mensaje,
        		        timer: 5000
        		    });
					$('#activo-inf-wz').bootstrapWizard('previous');
				}
			});
		});
		
		$('#activo-inf-wz .crear-activo').click(function(){
			//GUARDA ACTIVO INFORMACION
			var oActivoInf = {
				nombre: $('.activoInformacion #nombre').val(),
				idTipoActivo: $('#idTipoActivo').val(),
				ubicacion: $('#ubicacion').val(),
				propietario: $('#propietario').val(),
				correoSponsor: $('#correoSponsor').val(),
				idSoporte: $('#idSoporte').val(),
				autorizado: $('#autorizado').val(),
				idTag: $('#idTag').val(),
				idTipoRetencion: $('#idTipoRetencion').val(),
				valorRetencion: $('#valorRetencion').val(),
				idDuracionRetencion: $('#idDuracionRetencion').val(),
				idConfidencialidad: $('#idConfidencialidad').val(),
				idIntegridad: $('#idIntegridad').val(),
				idDisponibilidad: $('#idDisponibilidad').val(),
				criticidad:$('#criticidad').val(),
				idSubProceso: $('#idSubProceso').val()
			}
			AsyncPst('/PMP/protected/activo/registro/guardar', $.postify(oActivoInf), function (data) {
				if(data.estado == "OK")
				{
					$.niftyNoty({
        		        type: 'success',
        		        container: '.bootbox-body',
        		        icon: faIcon.valid,
        		        title: 'Activo de Informacion',
        		        message: 'Activo de informacion creado exitosamente',
        		        timer: 3000
        		    });
					$('#activo-inf-wz').find('.previous').prop('disabled', true);
					$('#idSubProceso').val(data.idObjeto);
					
					//CARGA FORMULARIO DE ACTIVOS DE INFORMACION
					$('#activo-inf-tab4').html('');
					AsyncGt('/PMP/protected/activo/registro/activoinf', { id: 0 }, function (data) {
						$('#activo-inf-tab4').append(data);
					});
					//CARGA LISTADO DE ACTIVOS PARA EL SUBPROCESO
					$('#tablaActivos').bootstrapTable({
						url:'/PMP/protected/activo/registro/list',
						queryParams: { idsubproceso: $('#idSubProceso').val() }
					});
					$('#tablaActivos').bootstrapTable('refresh');
					
					$('#activo-inf-wz').bootstrapWizard('previous');
				}
				else
				{
					$.niftyNoty({
        		        type: 'danger',
        		        icon: faIcon.invalid,
        		        container: '.bootbox-body',
        		        title: 'ERROR al tratar de guardar el activo de informacion',
        		        message: data.mensaje,
        		        timer: 5000
        		    });
					$('#activo-inf-wz').bootstrapWizard('previous');
				}
			});
		});
	}
	function validaWZ()
	{
		$('#activo-inf-wz-form').bootstrapValidator({
			message: 'Este valor no es valido',
			feedbackIcons: {
				valid: 'fa fa-check-circle fa-lg text-success',
				invalid: 'fa fa-times-circle fa-lg',
				validating: 'fa fa-refresh'
			},
			fields: {
				proceso: {
					message: 'Proceso is not valid',
					validators: {
						notEmpty: {
							message: 'Proceso es un campo requerido.'
						}
					}
				},
				subProceso: {
					message: 'Sub Proceso is not valid',
					validators: {
						notEmpty: {
							message: 'Sub proceso es un campo requerido.'
						}
					}
				}
			}
		}).on('success.field.bv', function(e, data) {
			// $(e.target)  --> The field element
			// data.bv      --> The BootstrapValidator instance
			// data.field   --> The field name
			// data.element --> The field element

			var $parent = data.element.parents('.form-group');

			// Remove the has-success class
			$parent.removeClass('has-success');


			// Hide the success icon
			//$parent.find('.form-control-feedback[data-bv-icon-for="' + data.field + '"]').hide();
		}).on('error.form.bv', function(e) {
			isValid = false;
		});
	}
});