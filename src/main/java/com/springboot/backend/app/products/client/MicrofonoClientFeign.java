package com.springboot.backend.app.products.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.springboot.backend.app.products.models.entity.Microfono;

@FeignClient(name= "service-microfono")
public interface MicrofonoClientFeign {

	@GetMapping("/list")
	public List<Microfono> list();
	
	@GetMapping("/microfono/{id}")
	public Microfono detail(@PathVariable Long id);
}
