package com.apex.spring.api.API.Colaboradores.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.apex.spring.api.API.Colaboradores.model.ColaboradorModel;

// interface criar as assinaturas dos métodos, sem corpo
// extends de outra classe onde já conseguimos trazer os métodos do crud
// ColaboradorModel é o tipo de dados que queremos retornar e o Integer é o tipo de dados que vamos utilizar nos métodos 
// (nesse caso é Integer devido a primary key)
public interface ColaboradorRepository extends Repository<ColaboradorModel, Integer> {
	
	// save, findAll, findByCodigo, delete são métodos do Repository
	
	// método default
	// Save - insert no banco
	void save(ColaboradorModel colaborador);
	
	// select * - trazer todos
	List<ColaboradorModel> findAll();
	

	// Busca por código específico
	ColaboradorModel findByCodigo(Integer codigo);
	
	// Deletar
	// é necessário primeiro buscar o colaborador par depois excluir
	void delete(ColaboradorModel colaborador);
	
	// Update é feito a partir de um save
	
	
}
