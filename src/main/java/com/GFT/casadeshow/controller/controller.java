package com.GFT.casadeshow.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.GFT.casadeshow.model.Evento;
import com.GFT.casadeshow.model.Locais;
import com.GFT.casadeshow.model.User;
import com.GFT.casadeshow.repository.Eventos;
import com.GFT.casadeshow.repository.Users;


@Controller
@RequestMapping
public class controller {
	
	@Autowired
	private Users usu; 
	
	@Autowired
	private Eventos eventos;
	
	
	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home");
		
		return mv;
	}
	
	@RequestMapping("/cadastro")
	public ModelAndView cadsatro() {
		ModelAndView mv = new ModelAndView("Cadastro");
		mv.addObject(new User());
		return mv;
	}
	
	@RequestMapping("/cadastrodeevento")
	public ModelAndView cadastroevento() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
	
	@RequestMapping("/cadastrodelocal")
	public ModelAndView cadastrolocal() {
		ModelAndView mv = new ModelAndView("C");
		return mv;
	}

	@RequestMapping("/listadeusuario")
	public ModelAndView pesquisausu() {
		List<User> todosusers =  usu.findAll();
		ModelAndView mv = new ModelAndView("Userlist");
		mv.addObject("Cadastro", todosusers);
		return mv;
	}

	@RequestMapping("/Eventos")
	public ModelAndView pesquisaevent() {
		List<Evento> todosevents =  eventos.findAll();
		ModelAndView mv = new ModelAndView("Eventlist");
		mv.addObject("CadastroEvento", todosevents);
		return mv;
	}
	
	
	
	@RequestMapping(value = "/home",method = RequestMethod.POST)
	public ModelAndView salvar(@Validated User user, Errors errors) {	
		ModelAndView mv = new ModelAndView("home");
		
		if(errors.hasErrors()) {
			return mv;
			
		}
		mv.addObject(new User());

		usu.save(user);
		
		mv.addObject("mensagem", "usuario cadastrado com sucesso");
		return mv;
	}
	
	@RequestMapping(value = "/cadastrodeevento",method = RequestMethod.POST)
	public ModelAndView salvarevento(@Validated Evento event) {	
		eventos.save(event);
		
		ModelAndView mv = new ModelAndView("CadastroEvento");
		mv.addObject("mensagem", "evento marcado com sucesso");
		return mv;
	}

	
	@ModelAttribute("locais")
	public List<Locais> localmetodo()
	{
		return Arrays.asList(Locais.values());
	}
	

}