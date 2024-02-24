package com.uce.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.repository.modelo.Persona;
import com.uce.edu.service.IPersonaService;

//http://localhost:8080/personas/buscar

@Controller
@RequestMapping("/personas")
public class PersonaController {
	@Autowired
	private IPersonaService iPersonaService;
	
	//Path
	//GET
	//Diferentes tipos de request
	//verbos o metodos HTTP
	
	@GetMapping("/buscarTodos")
	public String buscarTodos(Model modelo) {
		List<Persona> lista = this.iPersonaService.consultarTodos();
		modelo.addAttribute("personas",lista);
		return "vistaListaPersonas";
	}
	
	@GetMapping("/buscar")
	public String buscarPorCedula (String cedula) {
		return null;
	}
	
	@PutMapping("/actualizar")
	public String actualizar () {
		return null;
	}
	
	@DeleteMapping("/borrar")
	public String borrar () {
		return null;
	}
	
	@PostMapping("/guardar")
	public String guardar () {
		return null;
	}

}
