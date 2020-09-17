package com.jbac.web.banca_digital.cliente.infraestructure.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.jbac.web.banca_digital.cliente.application.finder.ClienteFinderService;
import com.jbac.web.banca_digital.cliente.domain.Cliente;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteFinderService clienteFinderService;
	
	
	public Collection<Cliente> listarClientes(){
		return clienteFinderService.obtenerClientes();
	}
	
}
