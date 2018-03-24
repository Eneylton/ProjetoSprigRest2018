package com.CrudSpringRest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CrudSpringRest.model.Categoria;
import com.CrudSpringRest.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria buscar(Long id) {
		Categoria obj = categoriaRepository.findOne(id);
		return obj;
		
	}
}
