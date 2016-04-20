/*$(document).ready(function () {
	$('#region-selector').find('.region-opcion').click(function () {
		//region-opcion
		var imagen = $(this).find('.region-imagen');
		var nombre = $(this).find('.region-nombre');
		var id = $(this).find('.region-id');
		
		$('.region-seleccionada').find('.region-imagen').each(function () {			
			$(this).attr('src', imagen.attr('src'));
			$(this).attr('alt', imagen.attr('alt'));
		});
		$('.region-seleccionada').find('.spn-region-nombre').each(function () {
			$(this).html(nombre.html());
		});
		$('.region-seleccionada').find('.region-id').each(function () {
			$(this).val(id.val());
		});
		$('.region-seleccionada').find('.region-nombre').each(function () {
			$(this).val(nombre.html().replace('&nbsp;', ''));
		});
	});
	
})*/
$(document).ready(function () {
	var faIcon = {
			valid: 'fa fa-check-circle fa-lg text-success',
			invalid: 'fa fa-times-circle fa-lg',
			validating: 'fa fa-refresh'
		};
	$("#submit").click(function() {
        $('#form-login').submit();
    });
	/*setTimeout(function() {
		//alert($('#j_password').val());
		$('#form-login').bootstrapValidator({
			message: 'This value is not valid',
			feedbackIcons: faIcon,
			fields: {
				j_username: {
					message: 'The username is not valid',
					validators: {
						notEmpty: {
							message: 'The username is required.'
						}
					}
				},
				j_password: {
					message: 'The j_password is not valid',
					validators: {
						notEmpty: {
							message: 'The username is required.'
						}
					}
				}
			}
		});
	}, 1000);*/
	
});