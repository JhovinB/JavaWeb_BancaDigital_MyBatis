package com.jbac.web.banca_digital.cliente.application.create;

import org.springframework.stereotype.Service;

import com.jbac.web.banca_digital.cliente.domain.Cliente;
import com.jbac.web.banca_digital.cliente.domain.ClienteRepository;

@Service
public class ClienteCreateService{
	

	private ClienteRepository clienteRepository;

	public ClienteCreateService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	public Cliente registrarCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

}
