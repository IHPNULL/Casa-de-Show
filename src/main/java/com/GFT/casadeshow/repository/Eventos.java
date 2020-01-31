package com.GFT.casadeshow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GFT.casadeshow.model.Evento;

public interface Eventos extends JpaRepository<Evento, Long> {
	
	

}
