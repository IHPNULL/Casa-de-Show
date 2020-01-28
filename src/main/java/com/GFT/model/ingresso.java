package com.GFT.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class ingresso extends User {
		
	public ingresso(Long id,String usuario,String email,Date datacompra) {
		super();
	}
}
