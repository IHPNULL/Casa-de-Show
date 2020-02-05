package com.GFT.casadeshow.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("deprecation")
@Entity
public class Locals {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="Insira o nome do local")
	@NotNull
	private String Nomelocal;
	
	@NotEmpty(message="Insira o endereço do local")
	@NotNull
	private String Endereco;
	
	@NotEmpty(message="Insira a capacidade de pessoas")
	@NotNull
	private Integer capacidade;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomelocal() {
		return Nomelocal;
	}
	public void setNomelocal(String nomelocal) {
		this.Nomelocal = nomelocal;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		this.Endereco = endereco;
	}
	public Integer getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}
}
