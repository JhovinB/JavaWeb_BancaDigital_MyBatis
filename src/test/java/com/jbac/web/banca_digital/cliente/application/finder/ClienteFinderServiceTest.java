package com.jbac.web.banca_digital.cliente.application.finder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.jbac.web.banca_digital.cliente.domain.Cliente;
import com.jbac.web.banca_digital.cliente.domain.ClienteNotFoundException;
import com.jbac.web.banca_digital.cliente.infraestructure.controller.ClienteControllerTest;

@SpringBootTest
@ContextConfiguration
public class ClienteFinderServiceTest {

	private static final Logger log = LoggerFactory.getLogger(ClienteControllerTest.class);
	@Autowired
	private ClienteFinderService clienteFinderService;
	
	@Test
	public void consultarPorDocumento() throws ClienteNotFoundException {
		
		String documento = "74036639";
		
		Optional<Cliente> cliente = clienteFinderService.consultarPorDocumento(documento);
	
		cliente.ifPresent(cli->log.info(cli.toString()));
		
		assertNotNull(cliente.get());
	}
}
