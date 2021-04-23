package com.prueba.cliente.modelo.dao;

import org.springframework.data.repository.CrudRepository;

import com.prueba.cliente.modelo.Cliente;

public interface ClienteDao extends CrudRepository<Cliente,Long>  {

}
