package com.jbac.web.banca_digital.tarjeta.domain;

import java.util.List;
import java.util.Optional;

public interface TarjetaRepository {
	
public Optional<List<Tarjeta>> findByIdCliente(Integer idCliente);
	
	public Optional<Tarjeta> findById(Integer id);
	
	public Tarjeta save(Tarjeta tarjeta);

	public boolean delete(Integer id);
}
