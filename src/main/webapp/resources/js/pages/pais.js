$(document).ready(function () {
	function init()
	{
		$('.bndr-container').click(function () {
			var bndr = $(this).find('.banderaItem').val();
			$('.bndr-container').each(function () {$(this).removeClass('bndr-container-selected');});
			$(this).addClass('bndr-container-selected');
			$('.bndr-selected').val(bndr);
		});
	}
	
	var $table = $('#tabla');

	function getSelectedRow() {
	    var index = $table.find('tr.success').data('index');
	    return $table.bootstrapTable('getData')[index];
	}
	//crear
	$('#btnCrear').click(function (){
		AsyncGt('item', { id: 0 }, function (data) {
		    var dialog 	= bootbox.dialog({
		        title: '&nbsp;',
		        message: data

		     });
		    $('.modal-header .modal-title').append('<a id="btnGuardar" href="#" class="btn btn-default" style="margin-right:10px;border-radius: 2px;"> <i class="fa icon-2x fa fa-save"></i> <br />Guardar</a>');
			
		    init();
            $('#btnGuardar').click(function () {
            	var pais = {
                	idPais : 0,
                	nombre : $('#nombre').val(),
                	icono : $('#bandera').val()               	
                };
            	AsyncPst('crear/guardar', $.postify(pais), function (data) {
            		if(data != null && data.estado == "OK")
        			{
            			dialog.modal('hide');
            		    $.niftyNoty({
            		        type: 'success',
            		        icon: faIcon.valid,
            		        container: 'floating',
            		        title: 'Pais',
            		        message: 'Pais creado exitosamente',
            		        timer: 5000
            		    });
            		    $table.bootstrapTable('refresh');
        			}
            		else
            		{
            			dialog.modal('hide');
            		    $.niftyNoty({
            		        type: 'danger',
            		        icon: faIcon.invalid,
            		        container: 'floating',
            		        title: 'ERROR :(',
            		        message: data.mensaje,
            		        timer: 5000
            		    });
            		}
            	});
            });
    	});
	});
	//editar
  	$table.on('click-row.bs.table', function (e, row, $element) {
  		$('.success').removeClass('success');
    	$($element).addClass('success');
    	AsyncGt('item', { id: getSelectedRow().idPais }, function (data) {
		    var dialog = bootbox.dialog({
		        title: '&nbsp;',
		        message: data

		     });
		    $('.modal-header .modal-title').append('<a id="btnGuardar" href="#" class="btn btn-default" style="margin-right:10px;border-radius: 2px;"> <i class="fa icon-2x fa fa-save"></i> <br />Guardar</a>');
            $('.modal-header .modal-title').append('<a id="btnEliminar" href="#" class="btn btn-danger" style="margin-right:10px;border-radius: 2px;"> <i class="fa icon-2x fa fa-trash"></i> <br />Eliminar</a>');
            init();
            //TODO: boton actualziar
            $('#btnGuardar').click(function () {
            	var pais = {
                	idPais : $('#idPais').val(),
                	nombre : $('#nombre').val(),
                	icono : $('#bandera').val()               	
                };
            	AsyncPst('modificar/guardar', $.postify(pais), function (data) {
            		if(data != null && data.estado == "OK")
        			{
            			dialog.modal('hide');
            		    $.niftyNoty({
            		        type: 'success',
            		        icon: faIcon.valid,
            		        container: 'floating',
            		        title: 'Pais',
            		        message: 'Pais actualizado exitosamente',
            		        timer: 5000
            		    });
            		    $table.bootstrapTable('refresh');
        			}
            		else
            		{
            			dialog.modal('hide');
            		    $.niftyNoty({
            		        type: 'danger',
            		        icon: faIcon.invalid,
            		        container: 'floating',
            		        title: 'ERROR :(',
            		        message: data.mensaje,
            		        timer: 5000
            		    });
            		}
            	});
            });
            //TODO: boton eliminar 
            $('#btnEliminar').click(function () {
            	bootbox.confirm("¿Esta seguro de eliminar este pais, ya que se eliminarán todas las filiales, perfiles, usuarios y activos de informacion asociados?", function(result){
        			if(result)
        			{
        				var pais = {
        	                	idPais : $('#idPais').val(),
        	                	nombre : $('#nombre').val(),
        	                	icono : $('#bandera').val()               	
        	                };
                        AsyncPst('eliminar/guardar', $.postify(pais), function (data) {
                            if(data != null && data.estado == "OK")
                        	{
                    			dialog.modal('hide');
                    		    $.niftyNoty({
                    		        type: 'success',
                    		        icon: faIcon.valid,
                    		        container: 'floating',
                    		        title: 'Pais',
                    		        message: 'Pais eliminado exitosamente',
                    		        timer: 5000
                    		    });
                    		    $table.bootstrapTable('refresh');
                        	}
                            else
                            {
                    			dialog.modal('hide');
                    		    $.niftyNoty({
                    		        type: 'danger',
                    		        icon: faIcon.invalid,
                    		        container: 'floating',
                    		        title: 'ERROR :(',
                    		        message: data.mensaje,
                    		        timer: 5000
                    		    });
                        	}
                    	});
        			}
            	});
            });
    	});
  	});
})