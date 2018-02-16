package com.kenyo.mesero.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;

import com.kenyo.mesero.model.Consumo;

public interface ConsumoRepository extends CrudRepository<Consumo, Long>{
	
	List<Consumo> findByFechapedidoBetween(@DateTimeFormat(pattern ="yyyy/MM/dd HH:mm:ss") @Param("fecha1") Date fecha1,
			@DateTimeFormat(pattern ="yyyy/MM/dd HH:mm:ss") @Param("fecha2") Date fecha2);

}
