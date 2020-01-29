package com.GFT.casadeshow.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.GFT.casadeshow.model.User;
import com.GFT.casadeshow.repository.Users;

@Controller
@RequestMapping("/home")
public class controller {
	
	@Autowired
	private Users usu; 
	
	@RequestMapping
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home");
		
		return mv;
	}
	
	@RequestMapping("/listadeusuario")
	public String listausu() {
		return "Userlist";
	}
	//@RequestMapping("/cadastrodeevento")
	//@RequestMapping("/listadeeventos")

	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(User user) {	
		usu.save(user);
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
	

}
