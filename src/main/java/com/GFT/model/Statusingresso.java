package com.GFT.model;

public enum Statusingresso {
	
	ESGOTADO("Esgotado"),
	DISPONIVEL("Disponivel");
	
	private String desc;
	
	Statusingresso(String desc){
		this.desc = desc;
	}
	
	public String getDesc() {
		return desc;
	}
}
