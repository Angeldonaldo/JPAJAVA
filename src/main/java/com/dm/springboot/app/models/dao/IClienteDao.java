package com.dm.springboot.app.models.dao;

import java.util.List;

import com.dm.springboot.app.models.entity.Cliente;

public interface IClienteDao {
	public List<Cliente> findAll();
}
