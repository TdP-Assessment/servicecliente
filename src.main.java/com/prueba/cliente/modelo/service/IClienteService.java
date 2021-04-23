package com.prueba.cliente.modelo.service;

import java.util.List;

import com.prueba.cliente.modelo.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();
	public Cliente findById(Long id);
}
