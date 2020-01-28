package com.GFT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.GFT.model.User;

@Controller
public class controller {
	public class usercontroller{
		
		@RequestMapping("/cadastro")
		public String novouser() {
			return "Teladecadastro";
		}
		
		@RequestMapping(method = RequestMethod.POST)
		public String salvar(User user) {
			
			return "login";
		}
	}
}
