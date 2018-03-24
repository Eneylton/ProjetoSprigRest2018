package com.CrudSpringRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CrudSpringRest.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
