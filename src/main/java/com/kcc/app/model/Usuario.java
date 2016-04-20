package com.kcc.app.model;

import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;  
import javax.persistence.GenerationType;  
import javax.persistence.Id;  
import javax.persistence.Table;  


@Entity  
@Table(name="adm_usuario") 
public class Usuario {

	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	@Column(name = "aus_id")  
	private Integer idUsuario; 
	 
	@Column(name="aus_username")
	private String username;
	 
	@Column(name="aus_nombres")
	private String nombre;
	 
	@Column(name="aus_apellidos")
	private String apellido;
	 
	@Column(name="aus_gerencia")
	private String gerencia;
	 
	@Column(name="aus_correo")
	private String correo;
	 
	@Column(name="aus_estado")
	private String estado;
 
	@Column(name = "aus_password")
	private String password;

	@Column(name = "aus_ape_id")
	private Integer idPerfil;
	
	@Column(name="aus_afi_id")
	private Integer idFilial;

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getGerencia() {
		return gerencia;
	}

	public void setGerencia(String gerencia) {
		this.gerencia = gerencia;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}

	public Integer getIdFilial() {
		return idFilial;
	}

	public void setIdFilial(Integer idFilial) {
		this.idFilial = idFilial;
	}
	
	
}
