package com.jbac.web.banca_digital.cliente.infraestructure.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.jbac.web.banca_digital.cliente.domain.Cliente;

@SpringBootTest
@ContextConfiguration
public class ClienteControllerTest {
	
	
	private static Logger log= LoggerFactory.getLogger(ClienteControllerTest.class);
	
	@Autowired
	private ClienteController clienteController;
	
	@Test
	@DisplayName("Validar que obtenga una lista de clientes")
	public void obtenerListaDeClientes() {
		Collection<Cliente> lista = clienteController.listarClientes();
		
		//Para el logger
		lista.forEach(cliente->log.debug(cliente.toString()));
		
		assertEquals(false, lista.isEmpty());
		
		
	}
	
}
