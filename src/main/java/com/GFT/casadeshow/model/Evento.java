package com.GFT.casadeshow.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evento {
	
	private Date Data = new Date();
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String Nome;
	private String org;
	private String musicobanda;

	

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
		return Data;
	}
	public void setData(Date data) {
		Data = data;
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