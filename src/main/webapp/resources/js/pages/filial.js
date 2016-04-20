$(document).ready(function () {
	var $table = $('#tabla');

	$(function () {
		//crear
		$('#btnCrear').click(function (){
			AsyncGt('item', { id: 0 }, function (data) {
    		    var dialog 	= bootbox.dialog({
    		        title: '&nbsp;',
    		        message: data

    		     });
    		    $('.modal-header .modal-title').append('<a id="btnGuardar" href="#" class="btn btn-default" style="margin-right:10px"> <i class="fa icon-2x fa fa-save"></i> <br />Guardar</a>');
                
                $('#btnGuardar').click(function () {
                	var filial = {
                    	idFilial : 0,
                    	glosa : $('#glosa').val(),
                    	idPais : $('#idPais').val(), 
                    	pais: $('#idPais').text()                   	
                    };
                	AsyncPst('crear/guardar', $.postify(filial), function (data) {
                		if(data != null && data.estado == "OK")
            			{
                			dialog.modal('hide');
                		    $.niftyNoty({
                		        type: 'success',
                		        icon: faIcon.valid,
                		        container: 'floating',
                		        title: 'Filial',
                		        message: 'Filial creada exitosamente',
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
	    	AsyncGt('item', { id: getSelectedRow().idFilial }, function (data) {
    		    var dialog = bootbox.dialog({
    		        title: '&nbsp;',
    		        message: data

    		     });
    		    $('.modal-header .modal-title').append('<a id="btnGuardar" href="#" class="btn btn-default" style="margin-right:10px"> <i class="fa icon-2x fa fa-save"></i> <br />Guardar</a>');
                $('.modal-header .modal-title').append('<a id="btnEliminar" href="#" class="btn btn-danger" style="margin-right:10px"> <i class="fa icon-2x fa fa-trash"></i> <br />Eliminar</a>');
				
                //TODO: boton actualziar
                $('#btnGuardar').click(function () {
                	var filial = {
                    	idFilial : $('#idFilial').val(),
                    	glosa : $('#glosa').val(),
                    	idPais : $('#idPais').val(), 
                    	pais: $('#idPais').text()                   	
                    };
                	AsyncPst('modificar/guardar', $.postify(filial), function (data) {
                		if(data != null && data.estado == "OK")
            			{
                			dialog.modal('hide');
                		    $.niftyNoty({
                		        type: 'success',
                		        icon: faIcon.valid,
                		        container: 'floating',
                		        title: 'Filial',
                		        message: 'Filial actualizada exitosamente',
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
                	bootbox.confirm("¿Esta seguro de eliminar la filial?", function(result){
            			if(result)
            			{
            				var filial = {
                                	idFilial : $('#idFilial').val(),
                                	glosa : $('#glosa').val(),
                                	idPais : $('#idPais').val(), 
                                	pais: $('#idPais').text()                   	
                                };
                            AsyncPst('eliminar/guardar', $.postify(filial), function (data) {
	                            if(data != null && data.estado == "OK")
	                        	{
	                    			dialog.modal('hide');
	                    		    $.niftyNoty({
	                    		        type: 'success',
	                    		        icon: faIcon.valid,
	                    		        container: 'floating',
	                    		        title: 'Filial',
	                    		        message: 'Filial eliminada exitosamente',
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
	});

	function getSelectedRow() {
	    var index = $table.find('tr.success').data('index');
	    return $table.bootstrapTable('getData')[index];
	}
});
