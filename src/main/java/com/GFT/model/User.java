package com.GFT.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class User {
		
	private Long id;
	private String usuario;
	private String email;
	private String senha;
	private Date datadecadastro;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Date getDatadecadastro() {
		return datadecadastro;
	}
	public void setDatadecadastro(Date datadecadastro) {
		this.datadecadastro = datadecadastro;
	}
	
	
}
