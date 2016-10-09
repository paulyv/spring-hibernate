package com.pauli.varelius.spring.demo.core;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ListController {

	private List<String> lista;
	
	public ListController() {
		this.lista = new ArrayList<String>();
		this.lista.add("Jari Tervo");
		this.lista.add("Donald Trump");
		this.lista.add("Bill Clinton");
	}
	
	// GET request to only load the website  
	@RequestMapping(value = "/listausta", method = RequestMethod.GET)
	public String lista(Model model){
		model.addAttribute("list", lista);
		return "listaus";
	}
	
	// POST request to add to the list
	@RequestMapping(value = "/addName", method = RequestMethod.POST)
	public String listaus(Model model, @RequestParam(required = false) String uusiNimi){
		
		if(uusiNimi != null && !uusiNimi.trim().isEmpty()) {
			this.lista.add(uusiNimi);
		}
		
		model.addAttribute("list", lista);
		return "listaus";
	}
	
}
