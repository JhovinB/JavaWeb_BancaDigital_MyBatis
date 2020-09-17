package com.jbac.web.banca_digital.tarjeta.infraestructure.persitence;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.jbac.web.banca_digital.tarjeta.domain.Tarjeta;

@Mapper
public interface MyBatisTarjetaMapper {
	
	@Select("SELECT * FROM tarjeta WHERE id_cliente = #{idCliente}")
	public List<Tarjeta> findByIdCliente(Integer idCliente);

	
}
