package com.GFT.model;

import java.util.Date;

public class Show extends User {
	
	private Date dataevento;
	private String banda;
	private int lotacao;
	private double preço;
	private Statusingresso status;
	private String estilo;
	private String nomeevento;
	
	
	public Show(String banda, Date dataevento, int lotaçao, double preço, Statusingresso status, String estilo,
			String nomeevento) {
		super();
		this.banda = banda;
		this.dataevento = dataevento;
		this.lotacao = lotaçao;
		this.preço = preço;
		this.status = status;
		this.estilo = estilo;
		this.nomeevento = nomeevento;
	}

	public String getBanda() {
		return banda;
	}
	
	public void setBanda(String banda) {
		this.banda = banda;
	}
	
	public Date getDataevento() {
		return dataevento;
	}
	
	public void setDataevento(Date dataevento) {
		this.dataevento = dataevento;
	}
	
	public int getLotacao() {
		return lotacao;
	}
	
	public void setLotacao(int lotacao) {
		this.lotacao = lotacao;
	}
	
	public double getPreço() {
		return preço;
	}
	
	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	public Statusingresso getStatus() {
		return status;
	}
	
	public void setStatus(Statusingresso status) {
		this.status = status;
	}
	
	public String getEstilo() {
		return estilo;
	}
	
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	public String getNomeevento() {
		return nomeevento;
	}
	
	public void setNomeevento(String nomeevento) {
		this.nomeevento = nomeevento;
	}



}
