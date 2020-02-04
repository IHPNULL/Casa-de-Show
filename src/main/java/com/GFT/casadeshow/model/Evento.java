package com.GFT.casadeshow.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;
import javax.persistence.TemporalType;


import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;


@SuppressWarnings("deprecation")
@Entity
public class Evento {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="Insira o nome do Evento")
	@NotNull
	private String Nome;
	
	private String org;
	
	@NotEmpty(message="Insira a banda")
	private String musicobanda;
	
	@NumberFormat(pattern = "#,##0.00")
	private BigDecimal valor;

	@NotNull(message="Insira a data no formato: dia/mes/ano")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date data = new Date();
	
	

	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	@Enumerated(EnumType.STRING)
	private Locais Local;	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getMusicobanda() {
		return musicobanda;
	}
	public void setMusicobanda(String musicobanda) {
		this.musicobanda = musicobanda;
	}
	public Locais getLocal() {
		return Local;
	}
	public void setLocal(Locais local) {
		Local = local;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		if (other.id == null) {
			if (other.id != null)
				return false;
		} else if (!other.id.equals(other.id))
			return false;
		return true;
	}
}