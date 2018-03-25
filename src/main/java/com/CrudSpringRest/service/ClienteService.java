package com.CrudSpringRest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CrudSpringRest.model.Cliente;
import com.CrudSpringRest.repository.ClienteRepository;
import com.CrudSpringRest.util.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Long id) {
		Cliente obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
					+ ", Tipo: " + Cliente.class.getName());
		}
		return obj;
	}

}
