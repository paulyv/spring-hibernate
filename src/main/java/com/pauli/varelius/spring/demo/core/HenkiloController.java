package com.pauli.varelius.spring.demo.core;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pauli.varelius.spring.demo.henkilo.Henkilo;

@Controller
public class HenkiloController {

	private List henkiloLista;
	
	public HenkiloController(){
		henkiloLista = new ArrayList<Henkilo>();
		henkiloLista.add(new Henkilo("Pauli"));
	}
	
	@RequestMapping(value = "/addPerson", method = RequestMethod.POST)
	public String uusiHenkilo(Model model, @RequestParam(required = false) String nimi){
		
		if(nimi != null && !nimi.trim().isEmpty()){
			henkiloLista.add(new Henkilo(nimi));
		}
		model.addAttribute("henkilot", henkiloLista);
		return "Henkilot";
	}
	
	@RequestMapping(value = "/henkilot", method = RequestMethod.GET)
	public String henkilot(Model model) {
		model.addAttribute("henkilot", henkiloLista);
		return "Henkilot";
	}

}
