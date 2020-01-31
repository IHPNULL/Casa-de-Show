package com.GFT.casadeshow.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
@RequestMapping("/home")
public class controller {
	
	@Autowired
	private Users usu; 
	
	@Autowired
	private Eventos eventos;
	
	
	@RequestMapping("/cadastro")
	public ModelAndView cadsatro() {
		ModelAndView mv = new ModelAndView("Cadastro");
		
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(User user) {	
		usu.save(user);
		
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("mensagem", "usuario cadastrado com sucesso");
		return mv;
	}

	@ModelAttribute
	public ModelAndView pesquisar() {
		List<User> todosusers =  usu.findAll();
		ModelAndView mv = new ModelAndView("Userlist");
		mv.addObject("Cadastro", todosusers);
		return mv;
	}

	@RequestMapping("/listadeusuario")
	public ModelAndView listausu() {
		ModelAndView mv = new ModelAndView("Userlist");	
		return mv;
	}

	@RequestMapping("/cadastrodeevento")
	public ModelAndView cadastroevento() {
		ModelAndView mv = new ModelAndView("CadastroEvento");
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvarevento(Evento event) {	
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

//@RequestMapping("/listadeeventos")