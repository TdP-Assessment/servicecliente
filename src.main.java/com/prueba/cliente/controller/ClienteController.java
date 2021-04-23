package com.prueba.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.cliente.modelo.Cliente;
import com.prueba.cliente.modelo.service.IClienteService;

@RestController
public class ClienteController {
	
	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/listar")
	public List<Cliente> listar(){
		return clienteService.findAll();
		
	}

	@GetMapping("/ver/{id}")
	public Cliente detalle(@PathVariable Long id){
		return clienteService.findById(id);
		
	}

}
