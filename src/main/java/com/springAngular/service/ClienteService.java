package com.springAngular.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.springAngular.model.Cliente;


@Service
public class ClienteService {

	
	Map<Integer, Cliente> clientes = new HashMap<>();
	private Integer proximoId = 1;
	//negocios
public Cliente cadastrar(Cliente cliente){
	/*
	if (clientes==null) {
		clientes = new HashMap<>();
	}
	*/
	cliente.setId(proximoId);
	//criar Id
	proximoId++;
	
	clientes.put(cliente.getId(), cliente);
	
	return cliente;
}

public Cliente editar(Cliente cliente){
	
	 clientes.put(cliente.getId(), cliente);
	 return cliente;
	
}


public Cliente buscaPorId(Integer id) {
	
	return clientes.get(id);
}
	
	public Collection <Cliente> buscarTodos(){
		return clientes.values();
	}
	
	public void excluir(Cliente cliente){
		clientes.remove(cliente.getId());
	}
	
	
}
