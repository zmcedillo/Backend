package com.springboot.backend.app.products.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.backend.app.products.models.dao.MicrofonoDao;
import com.springboot.backend.app.products.models.entity.Microfono;

@Service
public class MicrofonoServiceIMPl implements MicrofonoService {

	@Autowired
	private MicrofonoDao dao;
	@Override
	@Transactional(readOnly = true)
	public List<Microfono> findAll() {

		return (List<Microfono>) dao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Microfono findByID(Long id) {

		return dao.findById(id).orElse(null);
	}

}
