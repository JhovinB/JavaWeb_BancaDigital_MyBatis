package com.jbac.web.banca_digital.cliente.domain;

import java.time.LocalDate;
import java.util.List;

import com.jbac.web.banca_digital.tarjeta.domain.Tarjeta;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Cliente {
	
	private Integer id;
	
	private String nombres;
	
	private String documento;
	
	private LocalDate fechaNacimiento;

	private List<Tarjeta> tarjetas;
	
	
	
	public Cliente(String nombres, String documento, LocalDate fechaNacimiento) {
		this.nombres = nombres;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
	
}
