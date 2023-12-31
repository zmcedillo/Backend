package com.springboot.backend.app.products.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.backend.app.products.models.entity.Microfono;
import com.springboot.backend.app.products.models.service.MicrofonoService;

@RestController
public class MicrofonoController {
	
	
	
	@Autowired
	private MicrofonoService microService;
	//Definicion de endpoints
	
	@Value("${server.port}")
	private Integer port;
	
	@GetMapping("/list")
	public List<Microfono> list(){
		return microService.findAll().stream().map(cel -> {
			cel.setPort(port);
			return cel;
		}).collect(Collectors.toList());
	}
	
	@GetMapping("/microfono/{id}")
	public Microfono detail(@PathVariable Long id) {
		
		//boolean bl = false;
		//if(!bl)
		//	throw new RuntimeException("No se pudo obtener detalle del microfono");
		return microService.findByID(id);
	}
	
	@DeleteMapping("/microfono/{id}")
	public Microfono delete(@PathVariable Long id) {
	return microService.findByID(id);
	}
	
	@PostMapping("/pruebapost")
	public String pmprueba(@RequestBody String ptexto) {
		return "Funciona el post " + ptexto;
	}
	 
	@PutMapping("/actmarca")
	public Microfono update(@RequestBody Microfono request) {
		Microfono response = request;
		return response;
	}
}
