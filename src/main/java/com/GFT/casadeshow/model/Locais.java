package com.GFT.casadeshow.model;

public enum Locais {
	Lugar1("Lugar1"),
	Lugar2("Lugar2"),
	Lugar3("Lugar3");
	
	
	public String cat;

	Locais(String cat){
		this.cat = cat;
	}
	
	public void setCat(String cat) {
		this.cat = cat;
	}

	
	public String getCat() {
		return cat;
	}

}