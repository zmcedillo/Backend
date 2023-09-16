package com.springboot.backend.app.products.models.service;

import java.util.List;

import com.springboot.backend.app.products.models.entity.Microfono;

public interface MicrofonoService {

	public List<Microfono> findAll();
	
	public Microfono findByID(Long id);
}
